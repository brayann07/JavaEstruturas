/* Um posto está vendendo combustíveis com a seguinte tabela de descontos: Álcool:
até 20 litros, desconto de 3% por litro
acima de 20 litros, desconto de 5% por litro Gasolina:
até 20 litros, desconto de 4% por litro
acima de 20 litros, desconto de 6% por litro

Escreva um programa que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 e o preço do litro do álcool é R$ 1,90.

 */
import java.util.Scanner;
public class Posto {
   public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);
        String validacao;
        double pagar = 0;
        System.out.println("A- Alcool\nG-Gasolina");
        validacao = entrada.nextLine();
        System.out.println("Qual a quantidade de litros vendido:");
        int quantidade = entrada.nextInt();
        switch (validacao) {
            case "A":
                if(quantidade > 20){
                    pagar = quantidade*1.9*1.05;
                }else{
                    pagar = quantidade*1.9*1.03;
                }
                break;
            case "G":
                if(quantidade > 20){
                    pagar = quantidade*2.5*1.06;
                }else{
                    pagar = quantidade*2.5*1.04;
                }
            default:
                System.out.println("Erro na seleção!");
                break;
        }
        System.out.println("o valor a ser pago é:"+pagar+"RS");
   }
}
