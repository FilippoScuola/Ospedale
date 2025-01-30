public class Main {
    public static void main(String[] args) {
        Ospedale ospedale = new Ospedale();
        Menu menu = new Menu(ospedale);
        menu.avvia();
    }
}
