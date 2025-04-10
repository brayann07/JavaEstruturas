


/* 
Considere uma aplicação que solicite uma seqüência de números inteiros positivos para o usuário, e informe o maior e o menor deles. A seqüência não pode conter mais do que 10 números. Internamente, a aplicação deverá armazenar os números fornecidos pelo usuário em um array apontado pela variável numeros. Somente depois que o usuário fornecer todos os valores, a aplicação deverá determinar os resultados e apresentá-los para o usuário */
import javax.swing.JOptionPane;
public class Atividade2 {
    public static void main(String[] args) {
        int[] positivos = new int[10];
        int maior = 0, menor = 99;
        for (int i = 0; i < 10; i++) {
            int positivosAux = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            positivos[i]=positivosAux;
            if (positivos[i] > maior ){
                maior =  positivos[i];
            }
            if (positivos[i] < menor){
                menor = positivos[i];
            }
        }
        for (int i=0 ; i<10 ; i++){
            JOptionPane.showMessageDialog(null,"Números:"+positivos[i]);
        }
        JOptionPane.showMessageDialog(null,"Maior valor do array:"+maior);
        JOptionPane.showMessageDialog(null,"Menor valor do array:"+menor);
    }
}
