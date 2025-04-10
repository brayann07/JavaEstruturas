
// 4- 10 inputs no array e verificar os pares e impares
import javax.swing.JOptionPane;
public class Atividade4 {  
    public static void main(String[] args) {
        int[] inteiros = new int[10];
        int inteirosaux;
        int pares= 0 , impares=0;
        for (int i =0; i <10; i++) {
            inteirosaux = Integer.parseInt(JOptionPane.showInputDialog("Digite um número!:"));
            inteiros[i] =  inteirosaux;
            if(inteiros[i] % 2 == 0){
                pares ++;
            }
            if(inteiros[i] % 2 == 1){
                impares ++;
            }
        }
        for (int i =1; i < 10; i++) {
            System.out.println("números digitados:"+inteiros[i]);
        }
        JOptionPane.showMessageDialog(null,"Número de pares:"+pares);
        JOptionPane.showMessageDialog(null,"Número de impares:"+impares);
    }
}
