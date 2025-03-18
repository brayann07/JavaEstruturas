/* 4) Escrever um algoritmo para ler dois valores e escolher a operação matemática desejada (adição, subtração, multiplicação e divisão). Ao final exibir o resultado.

Exemplo:  valor1 =  2
			 valor2 =  3
               operação = adição
               Resultado = 5
 */

import javax.swing.JOptionPane;

public class Mat {
    public static void main(String[] args) {
        System.out.println("Operações Disponíveis");
        String num1,num2;
        String operacao;
        num1 = JOptionPane.showInputDialog("Digite o primeiro número");
        num2 = JOptionPane.showInputDialog("Digite o segundo número");
        float n1 = Float.parseFloat(num1);
        float n2 = Float.parseFloat(num2);

        System.out.println("Operações:\nAdição-A\nSubtração-S\nMultiplicação-M");
        operacao = JOptionPane.showInputDialog("Qual operação deseja");
        if(operacao.equalsIgnoreCase("A")){
            float resultado = n1 + n2;
            JOptionPane.showMessageDialog(null, "Seu resultado é "+resultado);
        }else if(operacao.equalsIgnoreCase("S")){
            float resultado = n1 - n2;
            JOptionPane.showMessageDialog(null, "Seu resultado é "+resultado);
        }else if(operacao.equalsIgnoreCase("M")){
            float resultado = n1 * n2;
            JOptionPane.showMessageDialog(null, "Seu resultado é "+resultado);
        }else{
            JOptionPane.showMessageDialog(null, "Ou vc n escreveu nada ou vc n sabe olhar uma tela");
        }
    }
}
