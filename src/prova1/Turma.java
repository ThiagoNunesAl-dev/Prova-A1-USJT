package prova1;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Turma {
    //Atributos
    public String Nome;
    public int quantAlunos;
    public Aluno[] Alunos;
    
    //Listas vazias para serem preenchidas após as entradas de dados
	List<String> aprovados = new ArrayList<>();
	List<String> reprovados = new ArrayList<>();
	
    //Getters e Setters
    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getQuantAlunos() {
        return this.quantAlunos;
    }

    public void setQuantAlunos(int quantAlunos) {
        this.quantAlunos = quantAlunos;
    }

    public Aluno[] getAlunos() {
        return this.Alunos;
    }

    //Métodos
    
    //Preenche os atributos da classe Turma, a partir de um objeto já criado.
    public void criarTurma(Turma t) {
    	String nomeInput = JOptionPane.showInputDialog("Insira o nome da turma: ");
    	int quantInput = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de alunos da turma: "));
    	this.Alunos = new Aluno[quantInput];
    	
    	t.setNome(nomeInput);
    	t.setQuantAlunos(quantInput);   
    }
    
    //Preenche a turma com alunos cujos dados são fornecidos pelo usuário.
    public void preencherTurma(Turma t) {
        for(int i = 0; i < this.quantAlunos; i++) {
            String nomeInput = JOptionPane.showInputDialog("Nome do aluno: ");
            int matriculaInput = Integer.parseInt(JOptionPane.showInputDialog("Numero de matricula: "));
            float nota1Input = Float.parseFloat(JOptionPane.showInputDialog("Primeira nota: "));
            float nota2Input = Float.parseFloat(JOptionPane.showInputDialog("Primeira nota: ")); 
            
            Aluno aluno = new Aluno(nomeInput, matriculaInput, nota1Input, nota2Input);          
            aluno.calcularMedia(aluno, nota1Input, nota2Input);
          
            this.Alunos[i] = aluno;
            
            if(aluno.getMedia() >= 7) {
            	aprovados.add(aluno.getNome());
            } else {
            	reprovados.add(aluno.getNome());
            }
        }       
    }
    
    public void mostrarTurma() {
    	System.out.println("Aprovados: "+aprovados+"\nReprovados: "+reprovados);
    }
}
