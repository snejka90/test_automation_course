import Mostenirea.Masina;
import Polimorfism.Animal;
import Polimorfism.Caine;
import Polimorfism.Pisica;

public class Application {

    public static void main(String... args) {
        Masina masina = new Masina( "Skoda" );
        masina.afiseazaDetaliiVehicul();

        Animal pisica = new Pisica();
        pisica.emiteSunet();

        Animal caine = new Caine();
        caine.emiteSunet();
    }
}


