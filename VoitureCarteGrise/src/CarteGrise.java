import java.util.Date;

public class CarteGrise {

    private int numero;
    private Date dateEmission;
    private Voiture proprietaire;

    public CarteGrise(int numero, Date dateEmission) {
        this.numero = numero;
        this.dateEmission = dateEmission;
        this.proprietaire = null;
    }

    public void setProprietaire(Voiture v) {
        if (this.proprietaire == null) {
            this.proprietaire = v;
            v.lierCarteGrise(this);
        }
    }


    public void afficherInfos() {
        System.out.println("---=Infos Carte Grise=---");
        System.out.println("Numéro: " + this.numero);
        System.out.println("Date Emission: " + this.dateEmission);
        if (this.proprietaire != null) {
            System.out.println("Propriétaire: " + this.proprietaire.getImmatriculation() + " (" + this.proprietaire.getMarque() + ")");
        } else {
            System.out.println("Pas de propriétaire lié.");
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int num) {
        this.numero = num;
    }

    public Date getDateEmission() {
        return dateEmission;
    }

    public void setDateEmission(Date dtE) {
        this.dateEmission = dtE;
    }

    public Voiture getProprietaire() {
        return proprietaire;
    }
}