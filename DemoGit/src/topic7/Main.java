package topic7;

import topic6.ContulPersoanei;

public class Main {
    public static void main (String[] args) throws Exception {
        ContulPersoanei contSnejana = new ContulPersoanei ("Snejana Tiganciuc", 0, 4.500);
        FileManager.writeToFile("src/topic7/"+contSnejana.getId()+".txt",contSnejana.getNumePersoana());
        String result = FileManager.readFile("src/topic7/0.txt");
        System.out.println (result.toString());
    }
}
