import java.util.Vector;
import java.util.Scanner;
class Ospedale{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        Vector<Persona> persona = new Vector<Persona>();
        Vector<String> cRosso = new Vector<>(1,1);
        Vector<String> cGiallo = new Vector<>(1,1);
        Vector<String> cVerde = new Vector<>(1,1);
        Vector<Menu> M = new Vector<Menu>();

        M.add(new Menu("1","Inserisci persona"));
        M.add(new Menu("2","Togli persona"));
        M.add(new Menu("3","Vedi persone"));
        M.add(new Menu("4","Cerca persona"));
        M.add(new Menu("0","Esci"));

        for(int i = 0;i<M.size();i++){
            System.out.println(M.get(i).toString());
        }

        System.out.println("Scegli: ");
        String scelta = scanner.nextLine();

        switch (scelta) {
            case 1:
                persona.add(new Persona(
                scanner.nextLine(),
                scanner.nextLine(),
                scanner.nextLine(),
                scanner.nextInt(),
                scanner.nextBoolean())); 

                if(persona.get(0).getCodice() == "Verde"){
                    cVerde.addElement(scelta);(persona.get(0));
                }


                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            
        }

    }
}