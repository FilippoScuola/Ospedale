import java.util.Scanner;

public class Menu {
    private Ospedale ospedale;
    private Scanner scanner;

    public Menu(Ospedale ospedale) {
        this.ospedale = ospedale;
        this.scanner = new Scanner(System.in);
    }

    public void avvia() {
        while (true) {
            System.out.println("\n--- MENU OSPEDALE ---");
            System.out.println("1. Aggiungi paziente");
            System.out.println("2. Rimuovi paziente");
            System.out.println("3. Mostra pazienti");
            System.out.println("4. Trova paziente");
            System.out.println("5. Esci");
            System.out.print("Scelta: ");
            
            int scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma il ritorno a capo

            switch (scelta) {
                case 1: aggiungiPaziente();break;
                case 2: rimuoviPaziente();break;
                case 3: ospedale.mostraPazienti();break;
                case 4 : trovaPaziente();break;
                case 5: {
                    System.out.println("Uscita...");
                    break;
                }
                default : System.out.println("Scelta non valida.");break;
            }
        }
    }

    private void aggiungiPaziente() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Cognome: ");
        String cognome = scanner.nextLine();
        System.out.print("Età: ");
        int eta = scanner.nextInt();
        scanner.nextLine();
        
        String gravita;
        do {
            System.out.print("Gravità (verde/giallo/rosso): ");
            gravita = scanner.nextLine().toLowerCase();
        } while (!gravita.equals("verde") && !gravita.equals("giallo") && !gravita.equals("rosso"));

        System.out.print("È già stato visitato? (true/false): ");
        boolean visitato = scanner.nextBoolean();
        scanner.nextLine(); // Consuma il ritorno a capo

        ospedale.aggiungiPaziente(new Persona(nome, cognome, eta, gravita, visitato));
        System.out.println("Paziente aggiunto con successo.");
    }

    private void rimuoviPaziente() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Cognome: ");
        String cognome = scanner.nextLine();

        if (ospedale.rimuoviPaziente(nome, cognome)) {
            System.out.println("Paziente rimosso con successo.");
        } else {
            System.out.println("Paziente non trovato.");
        }
    }

    private void trovaPaziente() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Cognome: ");
        String cognome = scanner.nextLine();

        Persona p = ospedale.trovaPaziente(nome, cognome);
        if (p != null) {
            System.out.println("Dettagli paziente: " + p);
        } else {
            System.out.println("Paziente non trovato.");
        }
    }
}
