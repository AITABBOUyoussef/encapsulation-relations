import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Voiture v1 = new Voiture("1234-A-56", "Renault", "Clio");
        CarteGrise cg1 = new CarteGrise(987654, new Date());

        v1.lierCarteGrise(cg1);
        System.out.println("\n--- Vérification ---");

        v1.afficherInfos();
        System.out.println("--------");
        cg1.afficherInfos();


    }
}