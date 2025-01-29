class Menu {
    public String inserimento,descrizione;
    
    Menu(String inserimento, String descrizione){
        this.inserimento = inserimento;
        this.descrizione = descrizione;
    }

    public String toString(){
        return inserimento + " " + descrizione;
    }
}