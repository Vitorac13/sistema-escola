package src.models;

public class AlunoTestar {
    
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", 'A');
        aluno1.nota1 = 8;
        aluno1.nota2 = 7;
        aluno1.nota3 = 9;
        aluno1.calcularMedia();
        aluno1.calcularSituacao();
        aluno1.exibirBoletim();

        Aluno aluno2 = new Aluno("Maria", 'B');
        aluno2.nota1 = 6;
        aluno2.nota2 = 5;
        aluno2.nota3 = 4;
        aluno2.calcularMedia();
        aluno2.calcularSituacao();
        aluno2.exibirBoletim();

        Aluno aluno3 = new Aluno("Pedro", 'A');
        aluno3.nota1 = 4;
        aluno3.nota2 = 3;
        aluno3.nota3 = 2;
        aluno3.calcularMedia();
        aluno3.calcularSituacao();
        aluno3.exibirBoletim();
    }
}
