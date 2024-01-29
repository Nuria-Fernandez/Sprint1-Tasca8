package n1exercici5;

public class Main {
    public static void main(String[] args) {
        NumeroPi funcionalInterface = () -> 3.1415;//instancio y asigno el valor
        System.out.println(funcionalInterface.getPiValue());

    }


}
