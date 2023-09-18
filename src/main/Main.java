package main;

import entities.Attore;
import enums.Genere;
import enums.GenereDocumentario;
import enums.TipoOfferta;
import prodotti.Documentario;
import prodotti.Film;
import prodotti.Prodotto;
import prodotti.SerieTV;
import users.Account;
import users.Utente;

import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Account a = new Account("pippo@gmail.com", "12345", TipoOfferta.BASIC);
        Utente u = new Utente("MrSosu", "boh", false, "12345", a);
        Film film = new Film("Il Grande Lebowsky", 1997, new HashSet<>(), Genere.COMMEDIA, false, false, 120);
        u.addInMiaLista(film);
        SerieTV serieTV = new SerieTV("Better Call Saul", 2015, new HashSet<>(), Genere.THRILLER, false, true, 6, 10);
        Documentario documentario = new Documentario("America Selvaggia", 2019, new HashSet<>(), Genere.DOCUMENTARIO,
                false, false,
                GenereDocumentario.NATURA);
        Film film1 = new Film("Parasite", 2019, new HashSet<>(), Genere.COMMEDIA, false, true, 130);
        Prodotto[] array_prodotti = { documentario, film1, film, serieTV };
        for (Prodotto p : array_prodotti) {
            System.out.println(p);
        }
        System.out.println("--------------------------------");
        Arrays.sort(array_prodotti);
        for (Prodotto p : array_prodotti) {
            System.out.println(p);
        }

        u.addRecensione(film1, 5);
        System.out.println(film1.getRecensioni());
    }

}
