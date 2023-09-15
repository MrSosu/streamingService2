package users;

public class Utente {

    private String nome;
    private String avatar;
    private boolean isKid;
    private String pin;
    private Account account;

    public Utente(String nome, String avatar, boolean isKid, String pin, Account account) {
        this.nome = nome;
        this.avatar = avatar;
        this.isKid = isKid;
        this.pin = pin;
        this.account = account;
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
}
