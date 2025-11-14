import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Personne p1 = new Personne("Youssef ", 22);
        Passeport pass1 = new Passeport("MA123456", "Marocaine", new Date(2050, 11, 31));
        p1.assignerPasseport(pass1);
        p1.afficherInfos();
    }
}