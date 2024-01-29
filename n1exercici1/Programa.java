package n1exercici1;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Programa {

    private List <String> primeraLista;
    public Programa() {
        primeraLista = new ArrayList<>();
        primeraLista.add("cazo");
        primeraLista.add("olla");
        primeraLista.add("sarten");
        primeraLista.add("plancha");
        primeraLista.add("bote");
        primeraLista.add("tabla");
        primeraLista.add("exprimidor");
    }
    public void filtrar(){
        List <String> listaDevuelta = new ArrayList<>();
        listaDevuelta =  primeraLista.stream().filter(p -> p.contains("o")).toList();
        listaDevuelta.forEach(System.out::println);
    }
}
