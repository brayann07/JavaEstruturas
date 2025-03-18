/* Faça um programa que receba o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato */
import java.util.Scanner;
public class Barato {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);
        float prod1,prod2,prod3;
        System.out.println("Qual o preço do produto 1:");
        prod1 = entrada.nextFloat();
        System.out.println("Qual o preço do produto 2:");
        prod2 = entrada.nextFloat();
        System.out.println("Qual o preço do produto 3:");
        prod3 = entrada.nextFloat();
        if(prod1 < prod2 && prod1 < prod3){
            System.out.println("Produto 1 é o mais barato.");
        }
        if(prod2 < prod1 && prod2 < prod3){
            System.out.println("Produto 2 é o mais barato.");
        }
        if(prod3 < prod2 && prod3 < prod1){
            System.out.println("Produto 3 é o mais barato.");
        }
    }
}
