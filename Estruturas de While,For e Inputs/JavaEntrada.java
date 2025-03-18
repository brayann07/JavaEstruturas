import java.util.Scanner;
public class JavaEntrada{
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);
        double Celsius,Fahrenheit;
        System.out.println("Qual a temperatura em Celsius:");
        Celsius = entrada.nextDouble();
        Fahrenheit = ( 9 * Celsius + 160) / 5;
        System.out.println("O valor em Fahrenheit é: " + Fahrenheit);
    }
}