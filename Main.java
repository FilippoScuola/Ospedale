import java.util.Vector;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        Vector<Menu> M = new Vector<Menu>();

        M.add(new Menu("1","Inserisci persona"));
        M.add(new Menu("2","Togli persona"));
        M.add(new Menu("3","Vedi persone"));
        M.add(new Menu("4","Esci"));

        System.out.println("Scegli: ");
        String scelta = scanner.nextLine();

        switch (scelta) {
            case 1:
                Persona p = new Persona();   
                
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            
        }
    }
}