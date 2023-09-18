package prodotti;

import entities.Attore;
import entities.Recensione;
import enums.Genere;

import java.util.HashSet;
import java.util.Set;

public abstract class Prodotto implements Comparable<Prodotto> {

    protected String titolo;
    protected int anno;
    protected Set<Attore> cast;
    protected Genere genere;
    protected boolean pg;
    protected boolean original;
    protected Set<Recensione> recensioni;

    public Prodotto(String titolo, int anno, Set<Attore> cast, Genere genere, boolean pg, boolean original) {
        this.titolo = titolo;
        if (anno < 1900 || anno > 2023) {
            throw new IllegalArgumentException("anno non corretto");
        }
        this.anno = anno;
        this.cast = cast;
        this.genere = genere;
        this.pg = pg;
        this.original = original;
        this.recensioni = new HashSet<>();
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

    public Set<Attore> getCast() {
        return cast;
    }

    public void setCast(Set<Attore> cast) {
        this.cast = cast;
    }

    public Set<Recensione> getRecensioni() {
        return recensioni;
    }

    public void setRecensioni(Set<Recensione> recensioni) {
        this.recensioni = recensioni;
    }

    public void addRecensione(Recensione r) {
        recensioni.add(r);
    }

    @Override
    public int compareTo(Prodotto p) {
        if (p == null) {
            throw new NullPointerException("Il prodotto preso da fuori è null!");
        }
        // ordino i prodotti in catalogo prima in base all'anno d'uscita decrescente e in caso di stesso anno in
        // ordine alfabetico
        if (this.anno > p.anno) return -1;
        else if (this.anno < p.anno) return 1;
        else {
            return this.titolo.compareTo(p.titolo); // questo perchè il compareTo delle stringhe funziona in ordine
            // alfabetico
        }
    }

    @Override
    public String toString() {
        return titolo + ", " + anno;
    }
}
