import javax.swing.JOptionPane;

public class Cargo {
    public static void main(String[] args) {
        String sigla,nome,salario;
        System.out.println("Cargos:\nT-Técnico\nE-Engenheiro de Software\nA-Analista Sistemas\nP-Programador Python\nW-Web-Designer\nG-Gerente Projetos");
        nome = JOptionPane.showInputDialog("Digite Seu nome");
        sigla = JOptionPane.showInputDialog("Digite a respectiva sigla do seu cargo:");
        salario = JOptionPane.showInputDialog("Qual seu salário:");
        if(sigla.equalsIgnoreCase("T")){
            JOptionPane.showMessageDialog(null, "Seu cargo é TÉCNICO,"+nome+" e você ganha "+salario);
        }else if(sigla.equalsIgnoreCase("E")){
            JOptionPane.showMessageDialog(null, "Seu cargo é ENGENHEIRO DE SOFTWARE,"+nome+" e você ganha "+salario);
        }else if(sigla.equalsIgnoreCase("A")){
            JOptionPane.showMessageDialog(null, "Seu cargo é ANALISTA DE SISTEMAS,"+nome+" e você ganha "+salario);
        }else if(sigla.equalsIgnoreCase("P")){
            JOptionPane.showMessageDialog(null, "Seu cargo é PROGRAMADOR PYTHON,"+nome+" e você ganha "+salario);
        } else if(sigla.equalsIgnoreCase("W")){
            JOptionPane.showMessageDialog(null, "Seu cargo é WEB DESIGNER,"+nome+" e você ganha "+salario);
        } else if(sigla.equalsIgnoreCase("G")){
            JOptionPane.showMessageDialog(null, "Seu cargo é GERENTE DE PROJETOS,"+nome+" e você ganha "+salario);
        }else{
            JOptionPane.showMessageDialog(null, "Se nem escreveu nada");
        }  
    }
}
