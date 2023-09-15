package prodotti;

import entities.Attore;
import entities.Recensione;
import enums.Genere;

public class Prodotto {

    protected String titolo;
    protected int anno;
    protected Attore[] cast;
    protected Genere genere;
    protected boolean pg;
    protected boolean original;
    protected Recensione[] recensioni;

    public Prodotto(String titolo, int anno, Attore[] cast, Genere genere, boolean pg, boolean original) {
        this.titolo = titolo;
        if (anno < 1900 || anno > 2023) {
            throw new IllegalArgumentException("anno non corretto");
        }
        this.anno = anno;
        this.cast = cast;
        this.genere = genere;
        this.pg = pg;
        this.original = original;
        this.recensioni = new Recensione[1000];
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public Attore[] getCast() {
        return cast;
    }

    public void setCast(Attore[] cast) {
        this.cast = cast;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public boolean isPg() {
        return pg;
    }

    public void setPg(boolean pg) {
        this.pg = pg;
    }

    public boolean isOriginal() {
        return original;
    }

    public void setOriginal(boolean original) {
        this.original = original;
    }
}
