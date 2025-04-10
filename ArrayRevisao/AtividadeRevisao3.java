
import javax.swing.JOptionPane;



/* 3) Construir um programa JAVA que contenha um método que recebe como parâmetro um array de 10 números inteiros e mostre somente os valores pares digitados.
 */
public class AtividadeRevisao3 {
    public static void main(String[] args) {
        Pares();
        System.exit(0);
    }
    public static void Pares(){
        int[] nums = new int[10];
        int[] pares = new int[10];
        int[] impares = new int[10];
        int contpares = 0;
        int contimpares = 0;
        int a = 0;
        int b = 0;

        for(int i = 0; i<10 ; i++){
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            nums[i] = num;
            if((nums[i] % 2) == 0){
                 pares[a] = nums[i];
                 a++;
                 contpares ++;
            }else{
                impares[b] = nums[i];
                b++;
                contimpares ++;
            }
        }
        for (int i=0; i < pares.length; i++) {
            System.out.println("Números pares:"+pares[i]);
        }
        for (int i = 0; i < impares.length; i++) {
            System.out.println("Números impares:"+impares[i]);
        }
        System.out.println("Contagem de pares:"+contpares);
        System.out.println("Contagem de impares:"+contimpares);
    }
}
