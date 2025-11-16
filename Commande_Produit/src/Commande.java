import java.util.*;
public class Commande {
    private int id;
       private List<Produit> produits;

       public Commande (int id){
           this.id=id;
           this.produits = new ArrayList<>();
       }


    public void ajouterProduit(Produit p){
        this.produits.add(p) ;
        System.out.println("Le Produit '" + p.getNom() + "' a été ajouté à la commande " + this.id);
    }
    public double calculerTotal() {
           double totalCommande = 0.0;

        for (Produit p : this.produits) {
            double prixLigne = p.getPrixUnitaire() * p.getQuantite();
            totalCommande = totalCommande + prixLigne;
        }
        return totalCommande;
    }
    public int getId(){
           return id ;
    }
}
