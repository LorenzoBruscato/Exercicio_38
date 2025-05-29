package principal;

import model.Professor;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lorenzo
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Professor> listaProfessores = new ArrayList<>();

        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Adicionar Professor\n" +
                    "2 - Listar Professores\n" +
                    "3 - Remover Professor\n" +
                    "4 - Sair"
            ));

            switch (opcao) {
                case 1:
                    Professor prof = new Professor();
                    prof.leitura();
                    prof.setDisciplina(JOptionPane.showInputDialog("Digite a disciplina:"));
                    prof.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salário:")));
                    listaProfessores.add(prof);
                    break;
                case 2:
                    StringBuilder sb = new StringBuilder();
                    for (Professor p : listaProfessores) {
                        sb.append(p.toString()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, sb.length() > 0 ? sb.toString() : "Lista vazia!");
                    break;
                case 3:
                    int idRemover = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do professor a remover:"));
                    boolean encontrado = false;
                    for (Professor p : listaProfessores) {
                        if (p.getId() == idRemover) {
                            listaProfessores.remove(p);
                            JOptionPane.showMessageDialog(null, "Professor removido!");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        JOptionPane.showMessageDialog(null, "Professor não encontrado.");
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (opcao != 4);
    }
}
