package model;

public class Aluno {
    
    String nome;
    char turma;
    int nota1;
    int nota2;
    int nota3;
    float media;
    String situacao;

    Aluno(String nome) {
        this.nome = nome;
    }    
    
    Aluno(String turma) {
        this.turma = turma;
    }  

    Aluno(float nota1) {
        this.nota1 = (int) nota1;
    }   

    Aluno(float nota2) {
        this.nota2 = (int) nota2;
    }  

    Aluno(float nota3) {
        this.nota3 = (int) nota3;
    }

    Aluno(String nome, char turma) {
        this.nome = nome;
        this.turma = turma;
    }

    Aluno(float nota1, float nota2, float nota3) {
        this.nota1 = (int) nota1;
        this.nota2 = (int) nota2;
        this.nota3 = (int) nota3;
    }

    void calcularMedia(){
        this.media = (this.nota1 + this.nota2 + this.nota3) / 3;
    }

    void calcularSituacao(){
        if(this.media >= 7){
            this.situacao = "Aprovado";
        } else if(this.media >= 5){
            this.situacao = "Recuperação";
        } else {
            this.situacao = "Reprovado";
        }
    }

    void exibirBoletim(){
        IO.println("\nNome: " + this.nome);
        IO.println("Turma: " + this.turma);
        IO.println("Nota 1: " + this.nota1);
        IO.println("Nota 2: " + this.nota2);
        IO.println("Nota 3: " + this.nota3);
        IO.println("Média: " + this.media);
        IO.println("Situação: " + this.situacao);
    }
}