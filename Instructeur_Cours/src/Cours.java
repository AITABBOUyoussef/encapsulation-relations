public class Cours {
    private int id ;
    private String titre;
    private String description ;
    public Cours(int id , String titre ,  String description ) {
        this.id = id;
        this.titre = titre;
        this.description = description;

    }

    public void afficherCours(){System.out.println("  [Cours ID: " + this.id + "]");
        System.out.println("  Titre: " + this.titre);
        System.out.println("  Description: " + this.description);
        System.out.println("  -----------------");
    }
    public String getTitre() {
        return this.titre;
    }
}

