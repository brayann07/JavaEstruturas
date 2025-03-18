/* 2) Escrever um algoritmo para ler nome e a sigla do estado civil de uma pessoa e verificar a classificação:

Sigla			Classificação
S				Solteiro 
C				Casado 	
V				Viúvo 
D				Divorciado
 */

import javax.swing.JOptionPane;
public class VerificarCivil {
    public static void main(String[] args) {
        String estado,nome;
        System.out.println("Solteiro-S , Casado-C , Viúvo-V , Divorciado-D");
        nome = JOptionPane.showInputDialog("Digite Seu Nome");
        estado = JOptionPane.showInputDialog("Digite Seu Estado Cívil");
        if(estado.equalsIgnoreCase("S")){
            JOptionPane.showMessageDialog(null, "Seu estado cívil é SOLTEIRO(A),"+nome);
        }else if(estado.equalsIgnoreCase("C")){
            JOptionPane.showMessageDialog(null, "Seu estado cívil é CASADO(A),"+nome);
        }else if(estado.equalsIgnoreCase("V")){
            JOptionPane.showMessageDialog(null, "Seu estado cívil é VIÚVO(A),"+nome);
        }else if(estado.equalsIgnoreCase("D")){
            JOptionPane.showMessageDialog(null, "Seu estado cívil é DIVORCIADO(A),"+nome);
        } else{
            JOptionPane.showMessageDialog(null, "Se nem escreveu nada");
        } 
    }
}
