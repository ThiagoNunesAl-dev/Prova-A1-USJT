package prova1;

public class Aluno {
    //Atributos
    public String Nome;
    public int Matricula;
    public float Nota1;
    public float Nota2;
    public float Media;

    //Getters e Setters
    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getMatricula() {
        return this.Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    public float getNota1() {
        return this.Nota1;
    }

    public void setNota1(float Nota1) {
        this.Nota1 = Nota1;
    }

    public float getNota2() {
        return this.Nota2;
    }

    public void setNota2(float Nota2) {
        this.Nota2 = Nota2;
    }
    
    public float getMedia() {
        return this.Media;
    }

    public void setMedia(float Media) {
        this.Media = Media;
    }
    
    //Métodos
    public Aluno(String nome, int matricula, float nota1, float nota2) {
    	this.Nome = nome;
    	this.Matricula = matricula;
    	this.Nota1 = nota1;
    	this.Nota2 = nota2;
    }
    
    
    public void calcularMedia(Aluno a, float nota1, float nota2) {
    	this.Nota1 = nota1;
    	this.Nota2 = nota2;
    	
    	a.Media = (nota1 + nota2)/2;
    }
}
