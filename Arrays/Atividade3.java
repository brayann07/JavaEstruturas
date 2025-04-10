

/* 3) Considere o problema de registrar 10 valores inteiros (positivos e negativos). Cada valor é armazenado em uma variável interna a uma estrutura array chamada números. Após cadastro, verificar e mostrar a quantidade de números positivos e negativos digitados. */
import java.util.Scanner;
public class Atividade3 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner dados = new Scanner(System.in);
        int[] numeros = new int[10];
        int positivo = 0, negativo = 0;
        for(int i = 0; i < 10; i++){
            System.out.println("Digite números (positivos e negativos)");
            numeros[i] = dados.nextInt();
            if(numeros[i] >=0){
                positivo++;
            }
            if(numeros[i] < 0){
                negativo++;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Números Digitados "+numeros[i]);
        }
        System.out.println("Qtde Números negativos:"+negativo);
        System.out.println("Qtde Números positivo:"+positivo);
        dados.close();
    }
}
