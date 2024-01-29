package n1exercici8;

public class Main {
    public static void main(String[] args) {

        Funcional nuevaInstancia = (palabra -> new StringBuilder(palabra).reverse().toString());
        System.out.println(nuevaInstancia.inversa("Hello"));
        /*Por lo tanto, cuando llamas al método inversa en la instancia de Funcional que has creado,
         se ejecuta el código definido en la expresión lambda, que es invertir la cadena de texto
         proporcionada.*/
        /*cuando uso una expresión lambda para inicializar una interfaz estoy diciendo qué va a ejecutarse
        en el cuerpo del método. Es decir, estoy definiendo lo que va a hacer inversa.
         */


    }
}
