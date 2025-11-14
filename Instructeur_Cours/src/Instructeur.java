import java.util.*;
public class Instructeur {
    private int id ;
    private String nom;
    private String specialisation ;
    private   List<Cours> coursEnseignes;

    public Instructeur(int id , String nom , String specialisation){
        this.id = id ;
        this.nom = nom ;
        this.specialisation = specialisation ;
        this.coursEnseignes = new ArrayList<>();
    }
    public void ajouterCours(Cours c){
        this.coursEnseignes.add(c) ;
        System.out.println("Le cours '" + c.getTitre() + "' a été ajouté à l'instructeur " + this.nom);
    }
    public void afficherCours() {
        System.out.println("--- Liste des cours de " + this.nom + " ---");

        if (coursEnseignes.isEmpty()) {
            System.out.println("Cet instructeur n'enseigne aucun cours pour le moment.");
            return;
        }
        for (Cours c : this.coursEnseignes) {
            c.afficherCours();
        }
    }

}
