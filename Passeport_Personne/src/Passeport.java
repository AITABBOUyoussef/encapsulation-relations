import java.time.DateTimeException;
import java.util.Date;

public class Passeport {
    private  String numero ;
    private String nationalite ;
    private Date dateExpiration  ;
    public Passeport(String num , String nationalite , Date  dtE ){
        this.numero = num ;
        this.nationalite = nationalite ;
        this.dateExpiration = dtE ;

    }
        public void afficherInfos() {
            System.out.println("   Numéro Passeport: " + this.numero);
            System.out.println("   Nationalité: " + this.nationalite);
            System.out.println("   Date d'expiration: " + this.dateExpiration);
        }
public String getNumero (){
        return numero ;
}
public void setNumero(String num ){
        this.numero = num ;
}
    public String getNationalite (){
        return nationalite ;
    }
    public void setNationalite(String nationalite ){
        this.nationalite = nationalite ;
    }
    public Date getDateExpiration (){
        return dateExpiration ;
    }
    public void setDateExpiration(Date dtE ){
        this.dateExpiration  = dtE ;
    }

    }


