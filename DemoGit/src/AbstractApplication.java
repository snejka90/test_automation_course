import Abstractia.FormaGeometrica;
import Abstractia.Patrat;
import Abstractia.Triunghi;

public class AbstractApplication {

    public static void main(String...args) {
        FormaGeometrica formaGeometrica = new Triunghi();
        FormaGeometrica formaGeometrica1 = new Patrat();

        formaGeometrica.calculArie();
        formaGeometrica1.calculArie();
    }
}
