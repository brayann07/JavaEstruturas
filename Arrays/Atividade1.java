
/* Uma indústria deseja controlar as temperaturas de uma máquina. Considere o problema de registrar as temperaturas diárias de uma máquina, correspondente ao ano (365 dias) de operação da máquina. O valor de cada dia é armazenado em uma variável interna a uma estrutura array conhecida pela variável-apontador temperatura. 
 */
import java.util.Scanner;
public class Atividade1{
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner dados = new Scanner(System.in);
        double[] temperaturas = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a sua temperatura:");
            temperaturas[i] = dados.nextDouble();
        }
        for (int i = 0; i < 10; i++) {
            System.err.println("Temperaturas:"+temperaturas[i]);   
        }
       dados.close();
    }
}
