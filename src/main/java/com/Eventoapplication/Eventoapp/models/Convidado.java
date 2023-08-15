package com.Eventoapplication.Eventoapp.models;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.NotEmpty;
import java.io.Serializable;

@Entity
public class Convidado implements Serializable {

    static final long SerialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;


    @NotEmpty
    private String rg;
    @NotEmpty
    private String nomeConvidado;

    @ManyToOne
    private Evento evento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getNomeConvidado() {
        return nomeConvidado;
    }

    public void setNomeConvidado(String nomeConvidado) {
        this.nomeConvidado = nomeConvidado;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
