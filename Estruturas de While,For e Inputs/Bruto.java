/* Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 10% para o INSS e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês. Desconto do IR:
Salário Bruto até 900 (inclusive) - isento
Salário Bruto até 1500 (inclusive) - desconto de 5%
Salário Bruto até 2500 (inclusive) - desconto de 10%
Salário Bruto acima de 2500 - desconto de 20%


Mostrar na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.
 */
import java.util.Scanner;
public class Bruto {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);
        float salario,hora,quantidade;
        System.out.println("Cada hora paga:");
        hora = entrada.nextFloat();
        System.out.println("Quantidade de hora trabalha:");
        quantidade = entrada.nextFloat();
        salario = hora * quantidade;
        salario = salario - (salario * 10/100);
        if(salario <= 900){
            System.out.println("Salário alterado :" + salario);
        }
        if(salario > 900 || salario <=1500){
            salario = salario - (salario * 5/100);
            System.out.println("Salario alterado : "+ salario);
        }
        if(salario >1500 || salario <= 2500){
            salario = salario - (salario * 10/100);
            System.out.println("Salario alterado : "+ salario);
        }
        if(salario >2500){
            salario = salario - (salario * 20/100);
            System.out.println("Salario alterado : "+ salario);
        }
    }
}
