package src;

import src.services.CadastroService;

public class Main {
    
    int opcao = 1;

    while(opcao != 0){

        IO.println("Menu");
        IO.println("1 - Cadastrar notas.");
        IO.println("2 - Exibir boletim dos alunos.");
        IO.println("3 - Exibir média das turmas.");
        IO.println("4 - Exibir situação dos alunos.");
        IO.println("0 - Encerrar programa.");
        opcao = Integer.parseInt(IO.readln("Escolha uma opção: "));

        switch(opcao){
            case 0:
                break;
            case 1:
                CadastroService();
                break;
            case 2:
                BoletimService();
                break;
            case 3:
                MediaService();
                break;
            case 4:
                SituacaoService();
                break;
            default:
                IO.println("\nOpção inválida!");
            
        }   
    }

    IO.println("\nPrograma encerrado. ");
}
