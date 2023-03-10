package topic6;


public class ContulPersoanei {

    private String numePersoana;
    private Integer id;

    private Double sumaCurenta;

    public ContulPersoanei(String numePersoana, Integer id, Double sumaCurenta) throws Exception{
      this.setNumePersoana(numePersoana);
      this.setId(id);
      this.setSumaCurenta(sumaCurenta);
    }
    public String getNumePersoana(){
        return numePersoana;
    }
    public void setNumePersoana(String numePersoana){
        if (numePersoana.length()==0)
            throw new RuntimeException("Name does not to be empty");
        else if (numePersoana.length() <5)
            throw new IllegalArgumentException("Name is too short");
        this.numePersoana=numePersoana;
    }
    public int getId(){
        return id;
    }
    public void setId(int id) throws Exception {
        if(id<0)
            throw new Exception("Values must to be positive");
        this.id=id;
    }
    public Double getSumaCurenta(){
        return sumaCurenta;
    }
    public void setSumaCurenta(Double sumaCurenta){
        this.sumaCurenta=sumaCurenta;
    }
    public void transferCatreOPersoana(String nume, Double suma){
        if (nume.length()==0)
            throw new IllegalArgumentException("Undelivered to person without name");
    this.transferCatreOPersoana(nume,suma);
    }
}
