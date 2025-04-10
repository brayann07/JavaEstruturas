
import javax.swing.JOptionPane;

/* 8) Construir um programa JAVA que contenha um método que leia 02 arrays com A e B com 5 números inteiros. Após criar um novo array R (10) com a união dos valores dos arrays  A e B.
 */
public class AtividadeRevisao8 {
    public static void main(String[] args) {
        Metodo();
        System.exit(0);
    }
    public static void Metodo(){
        int[] arrayA = new int[5];
        int[] arrayB = new int[5];
        int[] arrayR = new int[10];
        for (int i = 0; i < 5; i++) {
            int auxA = Integer.parseInt(JOptionPane.showInputDialog("Números lista A"));
            arrayA[i] = auxA;
        }
        for (int i = 0; i < 5; i++) {
            int auxB = Integer.parseInt(JOptionPane.showInputDialog("Números lista B"));
            arrayB[i] = auxB;
        }
        for (int i = 0; i < 5; i++) {
            arrayR[i] = arrayA[i];
        }
        for( int i = 0; i<5 ; i++){
            arrayR[i + arrayA.length ] = arrayB[i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("O valor da arrayR em união de A e B é:"+arrayR[i]);
        }
    }
}
