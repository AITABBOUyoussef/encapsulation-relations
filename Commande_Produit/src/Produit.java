public class Produit {
    private String nom;
    private double prixUnitaire ;
    private int quantite ;
    public Produit( String nom ,  double prix , int quantite) {
        this.nom = nom;
        this.prixUnitaire = prix;
        this.quantite = quantite;
    }
public String getNom (){
        return nom;
}
public double getPrixUnitaire(){
        return prixUnitaire;
}
public int getQuantite(){
        return quantite;
}
    }