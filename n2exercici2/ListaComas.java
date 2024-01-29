package n2exercici2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListaComas {
    private List <Integer> listaNueva;
    public ListaComas(){
        listaNueva = Arrays.asList(2, 45, 66, 23, 89, 75, 36);
    }
    public void pasarString(){

        String transformado = listaNueva.stream().map(n -> (n%2 == 0 ? "e" : "o")+n).collect(Collectors.joining(","));
        System.out.println(transformado);
    }

}
