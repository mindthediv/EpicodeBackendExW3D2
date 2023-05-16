package com.w3d2;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class EventoDAO extends Evento{
    public static EntityManager em =  JpaUtil.getEntityManagerFactory().createEntityManager();
    public static EntityTransaction transaction = em.getTransaction();
    public EventoDAO(String titolo, String dataEvento, String descrizione, com.w3d2.tipoEvento tipoEvento,
            int numeroMassimoPartecipanti) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti);
    }

    public static void save(Evento ev){
        transaction.begin();
        em.persist(ev);
        transaction.commit();
    }
    
}
