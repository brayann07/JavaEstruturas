
import javax.swing.JOptionPane;

/* 6) Construir um programa JAVA que contenha um método que leia 02 arrays com A e B com 5 números inteiros. Após criar um novo array R com a soma dos valores dos arrays A e B.
 */
public class AtividadeRevisao6 {
    public static void main(String[] args) {
        Metodo();
        System.exit(0);
    }
    public static void Metodo(){
        int[] arrayA = new int[5];
        int[] arrayB = new int[5];
        int[] arrayR = new int[5];
        for(int i = 0; i<5; i++){
            int auxA = Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro número:"));
            int auxB = Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo número:"));
            arrayA[i] = auxA;
            arrayB[i] = auxB;
        }
        for (int i = 0; i < 5; i++) {
            arrayR[i] += (arrayA[i] + arrayB[i]);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Soma:"+arrayR[i]);
        }
    }
}
