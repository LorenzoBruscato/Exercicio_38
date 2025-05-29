package model;

/**
 *
 * @author Lorenzo
 */
public class Professor extends Pessoa {
    private String disciplina;
    private double salario;

    public Professor() {
    }

    public Professor(int id, String nome, int idade, String disciplina, double salario) {
        super(id, nome, idade);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String getNomeFormatado() {
        return "Prof. " + this.getNome();
    }

    @Override
    public String toString() {
        return super.paraString() +
                "\nDisciplina: " + getDisciplina() +
                "\nSalário: " + getSalario() +
                "\n-------------------";
    }
}
