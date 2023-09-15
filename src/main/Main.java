package main;

import entities.Attore;
import enums.Genere;
import enums.TipoOfferta;
import prodotti.Film;
import users.Account;
import users.Utente;

public class Main {

    public static void main(String[] args) {
        Account a = new Account("pippo@gmail.com", "12345", TipoOfferta.BASIC);
        Utente u = new Utente("MrSosu", "boh", false, "12345", a);
        Film film = new Film("Il Grande Lebowsky", 1997, new Attore[10], Genere.COMMEDIA, false, false, 120);
        u.addInMiaLista(film);
        System.out.println(u.getMiaLista());
        u.addInMiaLista(film);

    }

}
