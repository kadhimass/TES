import model.Pesawat;
import model.Tiket;

public class App {
    public static void main(String[] args) {
        Pesawat pesawat = new Pesawat("GA-210", "Garuda Indonesia", "Jakarta", "Denpasar", 180);
        Tiket tiket = new Tiket("TKT-001", "Rendy", pesawat, "12A", 1500000);

        System.out.println("=== Data Pesawat ===");
        System.out.println(pesawat);
        System.out.println();
        System.out.println("=== Data Tiket ===");
        System.out.println(tiket);

    }
}