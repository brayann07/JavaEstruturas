import java.util.Scanner;
public class Maior {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entrada  = new Scanner(System.in);
        double numero1;
        double numero2;
        System.out.println("Digite o Primeiro número");
        numero1 = entrada.nextDouble();
        System.out.println("Digite o Segundo número");
        numero2 = entrada.nextDouble();
        if(numero1 > numero2){
            System.out.println("Número 1:" + numero1);
            System.out.println("é maior que:" + numero2);
        }
        if(numero2 > numero1){
            System.out.println("Número 2:" + numero2);
            System.out.println("é maior que:" + numero1);
        }

    }
}
