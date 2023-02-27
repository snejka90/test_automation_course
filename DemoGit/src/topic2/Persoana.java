package topic2;

import Abstractia.FormaGeometrica;
import Abstractia.Patrat;
import Abstractia.Triunghi;
import Mostenirea.Masina;
import Polimorfism.Animal;
import Polimorfism.Caine;
import Polimorfism.Pisica;

public class Persoana {

    public String prenume;
    public String nume;
    public Integer varsta;

    public Persoana(){
        this.prenume=prenume;
        this.nume=nume;
        this.varsta=varsta;
    }

    public String getPrenume(){
        return prenume;
    }
    public void setPrenume(){
        this.prenume=prenume;
    }
    public String getNume(){
        return nume;
    }
    public void setNume(){
        this.nume=nume;
    }
    public Integer getVarsta(){
        return varsta;
    }
    public void setVarsta(){
        this.varsta=varsta;
    }


    public static class AbstractApplication {

        public static void main(String...args) {
            FormaGeometrica formaGeometrica = new Triunghi();
            FormaGeometrica formaGeometrica1 = new Patrat();

            formaGeometrica.calculArie();
            formaGeometrica1.calculArie();
        }
    }

    public static class Application {

        public static void main(String... args) {
            Masina masina = new Masina( "Skoda" );
            masina.afiseazaDetaliiVehicul();

            Animal pisica = new Pisica();
            pisica.emiteSunet();

            Animal caine = new Caine();
            caine.emiteSunet();
        }
    }

    public static class Main {
        public static void main(String[] args) {
            System.out.println("Hello world!");
        }
    }
}
