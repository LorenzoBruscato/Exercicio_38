package dao;

import model.Professor;
import java.util.ArrayList;

/**
 *
 * @author Lorenzo
 */
public class ProfessorDAO {
    private static ArrayList<Professor> listaProfessores = new ArrayList<>();

    public static ArrayList<Professor> getListaProfessores() {
        return listaProfessores;
    }

    public static void setListaProfessores(ArrayList<Professor> listaProfessores) {
        ProfessorDAO.listaProfessores = listaProfessores;
    }

    public boolean insertProfessor(Professor p) {
        listaProfessores.add(p);
        return true;
    }

    public boolean deleteProfessor(int id) {
        int indice = buscarIndice(id);
        if (indice != -1) {
            listaProfessores.remove(indice);
            return true;
        }
        return false;
    }

    public boolean updateProfessor(int id, Professor novo) {
        int indice = buscarIndice(id);
        if (indice != -1) {
            listaProfessores.set(indice, novo);
            return true;
        }
        return false;
    }

    public Professor buscarProfessor(int id) {
        for (Professor p : listaProfessores) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    private int buscarIndice(int id) {
        for (int i = 0; i < listaProfessores.size(); i++) {
            if (listaProfessores.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
