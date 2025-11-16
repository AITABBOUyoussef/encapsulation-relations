import java.util.ArrayList;
import java.util.List;
public class Etudiant {
    private int Id;
    private String nom;
    private List<Cours> coursSuivis;

    public Etudiant(int id, String nom) {
        this.Id = id;
        this.nom = nom;
        this.coursSuivis = new ArrayList<>();
    }

    public void inscrire(Cours c) {
        if(!this.coursSuivis.contains(c)){
        this.coursSuivis.add(c);
            c.ajouterEtudiant(this);}
    }
    public void afficherCoursSuivis() {
        System.out.println("--- Liste des cours suivis par " + this.nom + " ---");
        if (this.coursSuivis.isEmpty()) {
            System.out.println(this.nom + " n'est inscrit à aucun cours.");
            return;
        }
        for (Cours c : this.coursSuivis) {
            c.afficherInfo();
        }
    }

    public String getNom(){
        return nom ;
    }
    public int getID(){
        return Id ;
    }

}
