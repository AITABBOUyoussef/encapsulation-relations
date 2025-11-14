public class Personne {
    private String nom ;
    private int age ;
    private Passeport passeport ;
    public Personne (String nom , int age ) {
        this.nom = nom ;
        this.age = age ;
        this.passeport = null ;

    }
public void afficherInfos(){
        System.out.println("=== Infos Personne ===");
        System.out.println("Nom : " + this.nom);
    System.out.println("Age : " + this.age);
}

   public void assignerPasseport(Passeport p){
        this.passeport = p ;
       System.out.println("Le passeport " + p.getNumero() + " a ete assigne a " + this.nom);
   }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Passeport getPasseport() {
        return passeport;
    }
}
