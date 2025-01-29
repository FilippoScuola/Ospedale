class Persona{
    private String nome,cognome,codice;
    private int eta;
    private boolean visitata;

    public Persona(){
        this.nome = "ns";
        this.cognome = "ns";
        this.codice = "ns";
        this.eta = 0;
        this.visitata = false;
    }

    public Persona(String nome, String cognome, String codice, int eta, boolean visitata){
        this.nome = nome;
        this.cognome = cognome;
        this.codice = codice;
        this.eta = eta;
        this.visitata = visitata;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public void setVisitata(boolean visitata) {
        this.visitata = visitata;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCodice() {
        return codice;
    }

    public String toString(){
        return nome + " " + cognome + " " + eta + " " + codice + " " + visitata;
    }
}