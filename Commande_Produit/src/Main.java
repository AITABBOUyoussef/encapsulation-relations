public class Main {

    public static void main(String[] args) {

        Produit p1 = new Produit("Clavier ", 450.0, 1);
        Produit p2 = new Produit("Souris ", 200.0, 2);
        Produit p3 = new Produit("Tapis de souris ", 150.0, 1);

        Commande cmd1 = new Commande(1);

        cmd1.ajouterProduit(p1);
        cmd1.ajouterProduit(p2);
        cmd1.ajouterProduit(p3);

        double totalFinal = cmd1.calculerTotal();

        System.out.println("=================================");
        System.out.println("TOTAL DE LA COMMANDE: " + totalFinal + " DH");
        System.out.println("=================================");

    }
}