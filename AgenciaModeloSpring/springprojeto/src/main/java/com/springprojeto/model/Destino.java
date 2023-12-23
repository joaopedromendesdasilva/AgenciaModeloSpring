package com.springprojeto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import jakarta.persistence.JoinTable;

import java.util.Date;

@Entity
public class Destino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String cidade;
    private String pais;
    private Date dataPartida;

    @ManyToMany
    @JoinTable(name = "Cliente_Destino", joinColumns = @JoinColumn ("Cliente_id"), inverseJoinColumns = @JoinColumn (name = "Destino_id"))
    private set<Destino> Destino = new HashSet<>();
    public Destino() {
    }

    public Destino(String nome, String cidade, String pais, Date dataPartida) {
        this.nome = nome;
        this.cidade = cidade;
        this.pais = pais;
        this.dataPartida = dataPartida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Date getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(Date dataPartida) {
        this.dataPartida = dataPartida;
    }
}
