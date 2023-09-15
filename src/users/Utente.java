package users;

import prodotti.Prodotto;

public class Utente {

    private String nome;
    private String avatar;
    private boolean isKid;
    private String pin;
    private Account account;
    private Prodotto[] miaLista;

    public Utente(String nome, String avatar, boolean isKid, String pin, Account account) {
        this.nome = nome;
        this.avatar = avatar;
        this.isKid = isKid;
        this.pin = pin;
        this.account = account;
        this.miaLista = new Prodotto[100];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public boolean isKid() {
        return isKid;
    }

    public void setKid(boolean kid) {
        isKid = kid;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Prodotto[] getMiaLista() {
        return miaLista;
    }

    public void addInMiaLista(Prodotto p) {
        if (isPresentInLista(p)) throw new IllegalArgumentException("Il prodotto è già presente nella lista");
        boolean flag = false;
        for (int i = 0; i < miaLista.length; i++) {
            if (miaLista[i] == null) {
                miaLista[i] = p;
                flag = true;
            }
        }
        if (!flag) throw new IllegalArgumentException("La tua lista è piena!");
    }

    public void removeInMiaLista(Prodotto p) {
        if (isPresentInLista(p)) {
            for (int i = 0; i < miaLista.length; i++) {
                if (miaLista[i] == p) {
                    miaLista[i] = null;
                }
            }
        }
        else throw new IllegalArgumentException("Il prodotto non è presente nella lista!");
    }

    private boolean isPresentInLista(Prodotto p) {
        for (int i = 0; i < miaLista.length; i++) {
            if (p.equals(miaLista[i])) {
                return true;
            }
        }
        return false;
    }

}
