package Encapsularea;

public class ContBancar {

    private Integer numarCont= Integer.valueOf("1234567891234567");
    private Float sold= Float.valueOf("12999.99");


    ContBancar(){
        numarCont = Integer.valueOf("1234567891234567");
    }

    ContBancar(Integer serieNumarCont){
        this.numarCont = Integer.valueOf(serieNumarCont);
    }

    public Integer getNumarCont() {return numarCont;}

    public Float getSold() {return sold;}

}
