import java.util.ArrayList;
import java.util.List;

public class Cours {
    private int Id ;
    private String Titre ;
    private List<Etudiant> inscrits ;
    public Cours (int id , String Titre ){
        this.Id=id ;
        this.Titre= Titre ;
        this.inscrits = new ArrayList<>();
    }
    public void ajouterEtudiant(Etudiant e) {
        if (!this.inscrits.contains(e)) {
            this.inscrits.add(e);
            e.inscrire(this);
        }
    }
        public void afficherInscrits() {
            System.out.println("--- Liste des inscrits au cours " + this.Titre + " ---");
            if (this.inscrits.isEmpty()) {
                System.out.println("Aucun étudiant n'est inscrit à ce cours.");
                return;
            }
            for (Etudiant e : this.inscrits) {
                System.out.println("  - " + e.getNom() + " (ID: " + e.getID() + ")");
            }
        }

        public void afficherInfo() {
            System.out.println("  [Cours ID: " + this.Id + "] " + this.Titre);
        }

        public String getTitre() {
            return this.Titre;
        }
    }


