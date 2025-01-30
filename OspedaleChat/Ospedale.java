import java.util.Vector;

public class Ospedale {
    private Vector<Persona> pazientiVerdi = new Vector<>();
    private Vector<Persona> pazientiGialli = new Vector<>();
    private Vector<Persona> pazientiRossi = new Vector<>();

    public void aggiungiPaziente(Persona p) {
        switch (p.getCodiceGravita()) {
            case "verde" -> pazientiVerdi.add(p);
            case "giallo" -> pazientiGialli.add(p);
            case "rosso" -> pazientiRossi.add(p);
            default -> System.out.println("Codice gravità non valido.");
        }
    }

    public boolean rimuoviPaziente(String nome, String cognome) {
        return rimuoviDaVector(pazientiVerdi, nome, cognome) ||
               rimuoviDaVector(pazientiGialli, nome, cognome) ||
               rimuoviDaVector(pazientiRossi, nome, cognome);
    }

    private boolean rimuoviDaVector(Vector<Persona> vector, String nome, String cognome) {
        return vector.removeIf(p -> p.getNome().equalsIgnoreCase(nome) && p.getCognome().equalsIgnoreCase(cognome));
    }

    public void mostraPazienti() {
        System.out.println("\n** PAZIENTI IN ATTESA **");
        mostraVector("ROSSO", pazientiRossi);
        mostraVector("GIALLO", pazientiGialli);
        mostraVector("VERDE", pazientiVerdi);
    }

    private void mostraVector(String colore, Vector<Persona> vector) {
        if (!vector.isEmpty()) {
            System.out.println("\n" + colore + ":");
            for (Persona p : vector) {
                System.out.println("  - " + p);
            }
        }
    }

    public Persona trovaPaziente(String nome, String cognome) {
        for (Vector<Persona> v : new Vector[]{pazientiRossi, pazientiGialli, pazientiVerdi}) {
            for (Persona p : v) {
                if (p.getNome().equalsIgnoreCase(nome) && p.getCognome().equalsIgnoreCase(cognome)) {
                    return p;
                }
            }
        }
        return null;
    }
}
