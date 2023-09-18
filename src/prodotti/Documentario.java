package prodotti;

import entities.Attore;
import enums.Genere;
import enums.GenereDocumentario;

import java.util.Set;

public class Documentario extends Prodotto {

    private GenereDocumentario genereDocumentario;

    public Documentario(String titolo, int anno, Set<Attore> cast, Genere genere, boolean pg, boolean original,
                        GenereDocumentario genereDocumentario) {
        super(titolo, anno, cast, genere, pg, original);
        this.genereDocumentario = genereDocumentario;
    }

    public GenereDocumentario getGenereDocumentario() {
        return genereDocumentario;
    }

    public void setGenereDocumentario(GenereDocumentario genereDocumentario) {
        this.genereDocumentario = genereDocumentario;
    }
}
