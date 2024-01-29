package n1exercici3;

import java.util.ArrayList;
import java.util.List;

public class Mes {
    private List <String> meses;
    public Mes(){
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
        meses.forEach(mes -> System.out.println(mes));
    }
}
