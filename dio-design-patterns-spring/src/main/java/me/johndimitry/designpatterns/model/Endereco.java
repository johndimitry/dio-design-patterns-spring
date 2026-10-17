package me.johndimitry.designpatterns.model;
import jakarta.persistence.Entity; import jakarta.persistence.Id;
@Entity
public class Endereco {
    @Id private String cep;
    private String logradouro, complemento, bairro, localidade, uf, ibge, gia, ddd, siafi;
    // getters e setters...
    public String getCep(){return cep;} public void setCep(String cep){this.cep=cep;}
    public String getLogradouro(){return logradouro;} public void setLogradouro(String v){logradouro=v;}
    public String getComplemento(){return complemento;} public void setComplemento(String v){complemento=v;}
    public String getBairro(){return bairro;} public void setBairro(String v){bairro=v;}
    public String getLocalidade(){return localidade;} public void setLocalidade(String v){localidade=v;}
    public String getUf(){return uf;} public void setUf(String v){uf=v;}
    public String getIbge(){return ibge;} public void setIbge(String v){ibge=v;}
    public String getGia(){return gia;} public void setGia(String v){gia=v;}
    public String getDdd(){return ddd;} public void setDdd(String v){ddd=v;}
    public String getSiafi(){return siafi;} public void setSiafi(String v){siafi=v;}
}