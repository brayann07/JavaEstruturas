
import javax.swing.JOptionPane;

/* Uma clinica deseja controlar seus médicos. Construir um programa JAVA que considere o problema de registrar os nomes dos medicos, nomes das suas especialidades em Arrays (separadas). Após a leitura, imprimir os médicos e especialidades cadastradas. */

public class AtividadeRevisao2 {
    public static void main(String[] args) {
        String[] nome = new String[3];
        String[] especialidade = new String[3];
        for (int i = 0; i < 3; i++) {
            String nomeaux = JOptionPane.showInputDialog("Qual seu nome:");
            String especialidadeaux = JOptionPane.showInputDialog("Qual sua especialidade:");
            nome[i] = nomeaux;
            especialidade[i] = especialidadeaux;
        }
        for (int i = 0; i < 3; i++) {
            System.err.println("Nome:"+nome[i]+"\nEspecialidade:"+especialidade[i]+"\n");
        }
    }
}
