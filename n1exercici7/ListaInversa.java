package n1exercici7;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class ListaInversa {
    private List <Object> nuevaLista;

    public ListaInversa(){
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
        nuevaLista.sort(Comparator.comparing(objeto -> objeto.toString().length()).reversed());
        //Estoy sacando la medida de cada cadena después de convertir toda la lista en Strings.
        //Así las puedo comparar.
        //Se le suma reversed para ordenarla de más larga a más corta
        nuevaLista.forEach(System.out::println);

    }
}