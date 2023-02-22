package topic2;

public class Main {
    public static void main(String... args){
        Persoana Marinel = new Persoana();

        Marinel.nume = "Marin";
        Marinel.prenume = "Tiganciuc";
        Marinel.varsta = Integer.valueOf("39");

        System.out.println(Marinel.getPrenume() + Marinel.getNume() + Marinel.getVarsta());
    }

}
