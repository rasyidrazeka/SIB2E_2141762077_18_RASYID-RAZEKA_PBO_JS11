package tugasjs11;
public class Main {
    public static void main(String[] args) {
        Keledai keledai = new Keledai("Kedelai", 4, "Hehehehe",
            "Abu-Abu");
        Gorila gorila = new Gorila("Gulali", 4, "Haaum Hauum",
            "Hitam Manis");
        Singa singa = new Singa("CingaCing", 4, "Roaaar",
            "Coklat");

        keledai.displayData();
        System.out.println();
        gorila.displayData();
        System.out.println();
        singa.displayData();
        System.out.println();
    }
}