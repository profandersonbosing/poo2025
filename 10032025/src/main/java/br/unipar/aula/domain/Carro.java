package br.unipar.aula.domain;

public class Carro {
    
    private Long id;
    
    private String apelido;
    
    private String chassi;
    
    private Marca marca;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Carro{" + "id=" + id + ", apelido=" + apelido + ", chassi=" + chassi + ", marca=" + marca + '}';
    }
    
    
    
}
