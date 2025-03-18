/* 1)  Escrever um algoritmo para ler o nome de um aluno e a sigla do curso e verificar:
		Sigla			Curso
		ADM 		      Administração
		DIR			Direito
		CEX			Comércio Exterior
 */
import javax.swing.JOptionPane;
public class VerificarSigla {
    public static void main(String[] args) {
        String curso,nome;
        System.out.println("Informatica-INFO, Administração- ADM, Design-DG");
        nome = JOptionPane.showInputDialog("Digite Seu Nome");
        curso = JOptionPane.showInputDialog("Digite Seu Curso");
        if(curso.equalsIgnoreCase("ADM")){
            JOptionPane.showMessageDialog(null, "Seu curso é ADMINSTRAÇÂO,"+nome);
        }else if(curso.equalsIgnoreCase("DG")){
            JOptionPane.showMessageDialog(null, "Seu curso é DESIGN GRÁFICO,"+nome);
        }else if(curso.equalsIgnoreCase("INFO")){
            JOptionPane.showMessageDialog(null, "Seu curso é INFORMÁTICA!,"+nome);
        }else{
            JOptionPane.showMessageDialog(null, "Se nem escreveu nada");
        }
    }
}
