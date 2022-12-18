import java.util.Date;

public class Recursive {

    public static void main(String[] args) {
        //System.out.println(factorial(6));
        //System.out.println(contarLetras("palabra", "a"));
        long startTime = new Date().getTime();
        System.out.println(factorial(52));
        long endTime = new Date().getTime();
        System.out.println("Execution time: " + (endTime - startTime) + " milliseconds");
    }

    public static int factorial(int n){
        if (n <= 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static int contarLetras(String palabra, String letra){
        int contador = 0;
        if (palabra.substring(0,1).equals(letra)){
            contador += contarLetras(palabra.substring(1), letra);
        }
        return contador;
    }
}
