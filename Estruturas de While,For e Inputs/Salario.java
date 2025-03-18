/* Os gestores da sua empresa resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa que calcula os reajustes. Portanto, faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
Salários até R$ 280,00 (incluindo), receberão aumento de 20%
Salários entre R$ 280,00 e R$ 700,00 (incluindo), receberão aumento de 15%
Salários entre R$ 700,00 e R$ 1500,00 (incluindo), receberão aumento de 10%
Salários de R$ 1500,00 em diante, receberão aumento de 5% 

Após o aumento ser realizado, informe na tela:
O salário antes do reajuste;
O percentual de aumento aplicado;
O valor do aumento;
O novo salário, após o aumento; */
import java.util.Scanner;
public class Salario { 
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);
        float salario;
        System.out.println("Salario do colaborador:");
        salario = entrada.nextFloat();
        if(salario <= 280){
            double aumento = 0.20;
            System.out.println("Salário antigo:" + salario);
            double salarionovo = salario + (salario * aumento);
            float aumentostatic = salario * 20/100;
            System.out.println("Salario novo" + salarionovo);
            System.out.println("Valor do aumento" + aumentostatic);
            System.out.println("Percentual do aumento:20%");
        }
        if(salario > 280 && salario < 700){
            double aumento = 0.15;
            System.out.println("Salário antigo:" + salario);
            double salarionovo = salario + (salario * aumento);
            float aumentostatic = salario * 15/100;
            System.out.println("Salario novo" + salarionovo);
            System.out.println("Valor do aumento" + aumentostatic);
            System.out.println("Percentual do aumento:15%");
        }
        if(salario >= 700 && salario < 1500){
            double aumento = 0.10;
            System.out.println("Salário antigo:" + salario);
            double salarionovo = salario + (salario * aumento);
            float aumentostatic = salario * 10/100;
            System.out.println("Salario novo" + salarionovo);
            System.out.println("Valor do aumento" + aumentostatic);
            System.out.println("Percentual do aumento:10%");
        }
        if(salario > 1500){
            double aumento = 0.05;
            System.out.println("Salário antigo:" + salario);
            double salarionovo = salario + (salario * aumento);
            float aumentostatic = salario * 5/100;
            System.out.println("Salario novo" + salarionovo);
            System.out.println("Valor do aumento" + aumentostatic);
            System.out.println("Percentual do aumento:5%");
        }
    }
}
