package users;

import enums.TipoOfferta;

import java.util.HashSet;
import java.util.Set;

public class Account {

    // attributi
    private String email;
    private String password;
    private TipoOfferta tipoOfferta;
    private Set<Utente> utenti;

    public Account(String email, String password, TipoOfferta tipoOfferta) {
        this.email = email;
        this.password = password;
        this.tipoOfferta = tipoOfferta;
        this.utenti = new HashSet<>();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TipoOfferta getTipoOfferta() {
        return tipoOfferta;
    }

    public void setTipoOfferta(TipoOfferta tipoOfferta) {
        this.tipoOfferta = tipoOfferta;
    }

    public Set<Utente> getUtenti() {
        return utenti;
    }

    public void setUtenti(Set<Utente> utenti) {
        this.utenti = utenti;
    }

    public void addUser(Utente u) {
        utenti.add(u);
    }

    public void removeUser(Utente u) {
        utenti.remove(u);
    }

}
