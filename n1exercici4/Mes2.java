package n1exercici4;

import java.util.ArrayList;
import java.util.List;

public class Mes2 {
    private List<String> meses;
    public Mes2(){
        meses = new ArrayList<>();
        meses.add("enero");
        meses.add("febrero");
        meses.add("marzo");
        meses.add("abril");
        meses.add("mayo");
        meses.add("junio");
        meses.add("julio");
        meses.add("agosto");
        meses.add("septiembre");
        meses.add("octubre");
        meses.add("noviembre");
        meses.add("diciembre");
    }
    public void imprimirLista(){
        meses.forEach(System.out::println);
    }
}
