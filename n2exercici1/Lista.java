package n2exercici1;
import java.util.ArrayList;
import java.util.List;
public class Lista {
    private List <String> nuevaLista;
    public Lista(){
        nuevaLista = new ArrayList<>();
        nuevaLista.add("Ana");
        nuevaLista.add("Adela");
        nuevaLista.add("Eva");
        nuevaLista.add("Ada");
        nuevaLista.add("Arnau");
    }
    public void filtrarLista(){
        List <String> listaFiltrada;
        listaFiltrada = nuevaLista.stream().filter(x -> x.startsWith("A") && x.length() == 3).toList();
        listaFiltrada.forEach(nombre -> System.out.println(nombre));

    }
}
