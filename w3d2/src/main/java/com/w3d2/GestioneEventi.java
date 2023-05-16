package com.w3d2;

public final class GestioneEventi {
    public static void main(String[] args) {
        Evento ev = new Evento("S. Agostino", "21/08/2023", "Celebrazione di S.Agostino presso la chiesa di S.reta", tipoEvento.PUBBLICO, 300);
        EventoDAO.save(ev);
    }
}
