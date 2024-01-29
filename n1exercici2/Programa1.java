package n1exercici2;
import java.util.ArrayList;
import java.util.List;

    public class Programa1 {

        private List<String> primeraLista;
        public Programa1() {
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
            listaDevuelta =  primeraLista.stream().filter(p -> p.contains("o") && p.length() > 5 ).toList();
            listaDevuelta.forEach(System.out::println);
        }
    }


