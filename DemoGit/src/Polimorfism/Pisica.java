package Polimorfism;

public class Pisica  extends Animal{

    public Pisica(){
        super();
    }

    @Override
    public void emiteSunet() {
        System.out.println("miauna");
    }
}
