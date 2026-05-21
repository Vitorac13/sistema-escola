package src.models;

public class Aluno {
    
    String nome;
    char turma;
    private Float nota1;
    private Float nota2;
    private Float nota3;
    private float media;
    private String situacao;

    public Aluno(String nome) {
        this.nome = nome;
    }    
    
    Aluno(char turma) {
        this.turma = turma;
    }  

    Aluno(String nome, char turma) {
        this.nome = nome;
        this.turma = turma;
    }

    Aluno(float nota1, float nota2, float nota3) {
        this.nota1 = (Float) nota1;
        this.nota2 = (Float) nota2;
        this.nota3 = (Float) nota3;
    }

    public void imprimirNome(){
        IO.println("Nome: " + this.nome);
    }

    void calcularMedia(){
        this.media = (this.nota1 + this.nota2 + this.nota3) / 3;
    }

    public void calcularSituacao(){
        if(this.nota1 == null || this.nota2 == null || this.nota3 == null){
            IO.println("Notas não cadastradas. Impossível calcular situação.");
            return;
        }
        if(this.media >= 7){
            this.situacao = "Aprovado";
        }
        if(this.media >= 5){
            this.situacao = "Recuperação";
        }
        if(this.media < 5){
            this.situacao = "Reprovado";
        }
    }

    public void exibirBoletim(){
        IO.println("\nNome: " + this.nome);
        IO.println("Turma: " + this.turma);
        IO.println("Nota 1: " + this.nota1);
        IO.println("Nota 2: " + this.nota2);
        IO.println("Nota 3: " + this.nota3);
        IO.println("Média: " + this.media);
        IO.println("Situação: " + this.situacao);
    }
}