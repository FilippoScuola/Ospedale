import java.util.Objects;

public class Persona {
    private String nome;
    private String cognome;
    private int eta;
    private String codiceGravita; // "verde", "giallo", "rosso"
    private boolean visitato;

    public Persona(String nome, String cognome, int eta, String codiceGravita, boolean visitato) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.codiceGravita = codiceGravita.toLowerCase();
        this.visitato = visitato;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getEta() {
        return eta;
    }

    public String getCodiceGravita() {
        return codiceGravita;
    }

    public boolean isVisitato() {
        return visitato;
    }

    public void setVisitato(boolean visitato) {
        this.visitato = visitato;
    }

    @Override
    public String toString() {
        return nome + " " + cognome + " | Età: " + eta + " | Gravità: " + codiceGravita.toUpperCase() +
                " | Visitato: " + (visitato ? "Sì" : "No");
    }
}
