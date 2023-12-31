package prodotti;

import entities.Attore;
import enums.Genere;

import java.util.Set;

public class Film extends Prodotto {

    private int durata;

    public Film(String titolo, int anno, Set<Attore> cast, Genere genere, boolean pg, boolean original, int durata) {
        super(titolo, anno, cast, genere, pg, original);
        this.durata = durata;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }
}
