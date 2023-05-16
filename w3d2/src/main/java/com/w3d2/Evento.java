package com.w3d2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

enum tipoEvento {PUBBLICO,PRIVATO};


@Entity
@Table (name = "eventi")
public class Evento {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    int id;
    @Column
	String titolo;
    @Column(name = "data_evento")
	String dataEvento;
    @Column
	String descrizione;
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo")
	tipoEvento tipoEvento;
    @Column(name = "n_max_partecipanti")
	int numeroMassimoPartecipanti;
    public Evento(String titolo, String dataEvento, String descrizione, com.w3d2.tipoEvento tipoEvento,
            int numeroMassimoPartecipanti) {
        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public String getDataEvento() {
        return dataEvento;
    }
    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    public tipoEvento getTipoEvento() {
        return tipoEvento;
    }
    public void setTipoEvento(tipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }
    public int getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }
    public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }
}
