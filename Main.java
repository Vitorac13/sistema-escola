package com.mycompany.projeto;

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
                CadastroNotas();
                break;
            case 2:
                ExibirBoletim();
                break;
            case 3:
                //ExibirMedias();
                break;
            case 4:
                //ExibirSituacao();
                break;
            default:
                IO.println("\nOpção inválida!");
            
        }   
    }

    IO.println("\nPrograma encerrado. ");
}
