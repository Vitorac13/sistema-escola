package src;

import src.models.Aluno;

public class Main {
    
    public static void main() {

        int opcao = 1;

        while(opcao != 0){

            IO.println("Menu");
            IO.println("1 - Cadastrar notas.");
            IO.println("2 - Exibir boletim dos alunos.");
            IO.println("3 - Exibir média das turmas.");
            IO.println("4 - Exibir situação dos alunos.");
            IO.println("0 - Encerrar programa.");
            opcao = Integer.parseInt(IO.readln("Escolha uma opção: "));

            Aluno aluno1 = new Aluno("Arthur");
            
            switch(opcao){
                case 0:
                    break;
                case 1:
                    //CadastroService();
                    aluno1.imprimirNome();
                    aluno1.calcularSituacao();
                    break;
                case 2:
                    //BoletimService();
                    aluno1.exibirBoletim();
                    break;
                case 3:
                    //MediaService();
                    break;
                case 4:
                    //SituacaoService();
                    break;
                default:
                    IO.println("\nOpção inválida!");
                
            }   
        }

        IO.println("\nPrograma encerrado. ");
    }
}