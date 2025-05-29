package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Lorenzo
 */
public abstract class Pessoa {
    private int id;
    private String nome;
    private int idade;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public abstract String getNomeFormatado();

    public void leitura() {
        setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID:")));
        setNome(JOptionPane.showInputDialog("Digite o nome:"));
        setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:")));
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, paraString());
    }

    public String paraString() {
        return "ID: " + getId() +
                "\nNome: " + getNome() +
                "\nIdade: " + getIdade();
    }
}
