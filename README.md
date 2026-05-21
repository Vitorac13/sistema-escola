# Sistema Escolar em Java

Sistema desenvolvido em Java para gerenciamento do desempenho de alunos em uma escola.
O projeto permite cadastrar notas, exibir boletins, calcular médias das turmas e verificar a situação dos alunos de forma simples através de um menu interativo no terminal.

## Funcionalidades

* Cadastro de notas dos alunos
* Exibição de boletim completo
* Cálculo da média das turmas
* Verificação da situação dos alunos
* Menu interativo no terminal
* Validação de notas entre 0 e 10
* Armazenamento dos dados durante a execução do programa

## Estrutura da Escola

O sistema trabalha com:

* 3 turmas
* 4 alunos por turma
* 3 notas para cada aluno

## Menu do Sistema

```text
1 - Cadastrar notas
2 - Exibir boletim dos alunos
3 - Exibir média das turmas
4 - Exibir situação dos alunos
0 - Encerrar programa
```

## Regras de Aprovação

| Média              | Situação    |
| ------------------ | ----------- |
| Maior ou igual a 7 | APROVADO    |
| Entre 5 e 6.9      | RECUPERAÇÃO |
| Abaixo de 5        | REPROVADO   |

## Tecnologias Utilizadas

* Java 25
* Programação estruturada

## Estrutura Inicial do Projeto

```text
sistema-escola/
│
├── src/
│   ├── Main.java
│   ├── models/
│   │   └── Aluno.java
│   ├── services/
│   │   ├── CadastroService.java
│   │   ├── BoletimService.java
│   │   ├── MediaService.java
│   │   └── SituacaoService.java
│   └── utils/
│       └── IO.java
│
├── README.md
└── .gitignore
```

## Funcionalidades Implementadas

### Cadastro de Notas

O usuário informa:

* Turma
* Número do aluno
* As 3 notas

As notas são validadas para garantir valores entre 0 e 10.

### Exibição do Boletim

O sistema exibe:

* Turma
* Aluno
* Notas
* Média final
* Situação do aluno

### Média das Turmas

Calcula e mostra a média geral de cada turma.

### Situação dos Alunos

Exibe:

* Quantidade de aprovados
* Quantidade em recuperação
* Quantidade de reprovados

## Desafios Extras

O projeto pode ser expandido para incluir:

* Aluno com maior média
* Aluno com menor média
* Média geral da escola
* Ranking das turmas
* Banco de dados
* Interface gráfica

## Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/Vitorac13/sistema-escola.git
```

2. Entre na pasta do projeto:

```bash
cd sistema-escola
```

3. Compile os arquivos:

```bash
javac src/*.java
```

4. Execute o programa:

```bash
java src/Main
```

## Objetivo do Projeto

Este projeto foi desenvolvido com foco em:

* Prática de lógica de programação
* Organização de projetos Java
* Modularização de código
* Programação orientada a objetos
* Estruturas de repetição e decisão

## Autor

Desenvolvido por Vitor Costa.
