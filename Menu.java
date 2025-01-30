import java.util.Scanner;
import java.util.Vector;

class Menu {
    public String inserimento,descrizione;
    
    Menu(String inserimento, String descrizione){
        this.inserimento = inserimento;
        this.descrizione = descrizione;
    }

    public String toString(){
        return inserimento + " " + descrizione;
    }

    public void stampa(){
        
    }

    public static void main(String[] args){

        Vector<Menu> M = new Vector<Menu>();

        M.add(new Menu("1","Inserisci persona"));
        M.add(new Menu("2","Togli persona"));
        M.add(new Menu("3","Vedi persone"));
        M.add(new Menu("4","Esci"));

        
        
        
    }
}