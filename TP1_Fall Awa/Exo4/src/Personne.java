import java.time.LocalDate;
import java.time.Period;

public class Personne {
    public String nom,prenom,matricule;
    public static int numIdentificaton = 0000;
    public Integer age;
    public LocalDate dateNaissance;

    public Personne() {
    }

    public Personne(String nom, String prenom, Integer age, LocalDate dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.dateNaissance = dateNaissance;
        numIdentificaton++;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    public String generateMat(){
        String mat = "" + prenom.charAt(0) + nom.charAt(0) + "000" + numIdentificaton;
        return mat.toUpperCase();
    }
    public int age()
    {
        LocalDate dateAct =LocalDate.now();
        return Period.between(dateNaissance,dateAct).getYears();
    }
    public void comparer(Personne p,Personne p1)
    {
        if (p.age() > p1.age()){
            System.out.println(p.getPrenom() + " " + p.getNom() +
                    "("+p.age() + " ans) est plus agee que " +
                    p1.getPrenom() + " " + p1.getNom() +
                    "(" + p1.age() + " ans)");
        }else
        {
            System.out.println(p1.getPrenom() + " " + p1.getNom() +
                    "("+p1.age() + " ans) est plus agee que " +
                    p.getPrenom() + " " + p.getNom() +
                    "(" + p.age() + " ans)");
        }
    }
}
