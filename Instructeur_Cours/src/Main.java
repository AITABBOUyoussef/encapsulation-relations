import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("--------------");
        Instructeur prof1 = new Instructeur(101, "Youssef", "Informatique");
        Cours coursJava = new Cours(1, "Java POO", "Programmation Orientée Objet avancée");
        Cours coursPython = new Cours(2, "Python Data Science", "Analyse de données");
        Cours coursWeb = new Cours(3 , "Développement Web", "HTML, CSS, JavaScript");

        prof1.ajouterCours(coursJava);
        prof1.ajouterCours(coursPython);
        prof1.ajouterCours(coursWeb);
        prof1.afficherCours();

    }
}
