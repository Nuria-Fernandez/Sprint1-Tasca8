package n1exercici6;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class ListaParaOrdenar {
    private List <Object> nuevaLista;

    public ListaParaOrdenar(){
        nuevaLista = new ArrayList<>();
        nuevaLista.add("Hola");
        nuevaLista.add(22);
        nuevaLista.add("Supercalifragilístico");
        nuevaLista.add("SkatePark");
        nuevaLista.add("El coronel no tiene quien le escriba");
        nuevaLista.add(78965412);
        nuevaLista.add("Meditación");
        nuevaLista.add('K');
        nuevaLista.add(1);
        nuevaLista.add(123456);
    }
    public void listaOrdenada(){
        nuevaLista.sort(Comparator.comparing(objeto -> objeto.toString().length()));
        //Estoy sacando la medida de cada cadena después de convertir toda la lista en Strings.
        //Así las puedo comparar.
        nuevaLista.forEach(System.out::println);

    }
}
