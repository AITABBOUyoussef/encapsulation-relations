public class Voiture {

    private String immatriculation;
    private String marque;
    private String modele;

    private CarteGrise carteGrise;

    public Voiture(String mat, String mar, String mod) {
        this.immatriculation = mat;
        this.marque = mar;
        this.modele = mod;
        this.carteGrise = null;
    }

    public void lierCarteGrise(CarteGrise c) {
        if (this.carteGrise == null) {
            this.carteGrise = c;
            c.setProprietaire(this);
            System.out.println("La Carte Grise " + c.getNumero() + " a été liée à la voiture " + this.immatriculation);
        }
    }

    public void afficherInfos() {
        System.out.println("---=Infos Voiture=---");
        System.out.println("Immatriculation: " + this.immatriculation);
        System.out.println("Marque: " + this.marque);
        System.out.println("Modèle: " + this.modele);
        if (this.carteGrise != null) {
            System.out.println("Liée à la Carte Grise: " + this.carteGrise.getNumero());
        } else {
            System.out.println("Pas de carte grise liée.");
        }
    }
    public String getImmatriculation() {
        return immatriculation;
    }
    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }
    public void setModele(String modele) {
        this.modele = modele;
    }

    public CarteGrise getCarteGrise() {
        return carteGrise;
    }

}