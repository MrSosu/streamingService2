package entities;

import prodotti.Prodotto;
import users.Utente;

public class Recensione {

    private Utente u;
    private Prodotto p;
    private int voto;
    private String commento;

    public Recensione(Utente u, Prodotto p, int voto) {
        this.u = u;
        this.p = p;
        this.voto = voto;
    }

    public Recensione(Utente u, Prodotto p, int voto, String commento) {
        this(u, p, voto);
        this.commento = commento;
    }

    public Utente getU() {
        return u;
    }

    public void setU(Utente u) {
        this.u = u;
    }

    public Prodotto getP() {
        return p;
    }

    public void setP(Prodotto p) {
        this.p = p;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public String getCommento() {
        return commento;
    }

    public void setCommento(String commento) {
        this.commento = commento;
    }
}
