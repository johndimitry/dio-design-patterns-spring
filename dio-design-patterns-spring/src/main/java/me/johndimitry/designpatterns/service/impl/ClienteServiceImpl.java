package me.johndimitry.designpatterns.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.johndimitry.designpatterns.model.Cliente;
import me.johndimitry.designpatterns.model.Endereco;
import me.johndimitry.designpatterns.repository.ClienteRepository;
import me.johndimitry.designpatterns.repository.EnderecoRepository;
import me.johndimitry.designpatterns.service.ClienteService;
import me.johndimitry.designpatterns.service.ViaCepService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        if (clienteRepository.findById(id).isPresent()) {
            salvarClienteComCep(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }

    private void salvarClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novo = viaCepService.consultarCep(cep);
            enderecoRepository.save(novo);
            return novo;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }
}