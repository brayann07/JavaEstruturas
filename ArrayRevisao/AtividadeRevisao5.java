
import javax.swing.JOptionPane;

/* 5) Construir um programa JAVA que contenha um método que recebe como parâmetro um array de 10 números inteiros e mostre somente os valores negativos digitados. */

public class AtividadeRevisao5 {
    public static void main(String[] args) {
        Metodo();
        System.exit(0);
    }
    public static void Metodo(){
        int[] inteiros = new int[10];
        for (int i = 0; i < 10; i++) {
            int inteirosaux = Integer.parseInt(JOptionPane.showInputDialog("Qual número é:"));
            if(inteirosaux < 0){
                inteiros[i] = inteirosaux;
            }else{
                // nada
            }
        }
            for (int i = 0; i < inteiros.length; i++) {
                System.out.println("Negativos:"+inteiros[i]);
            }
    }
}
