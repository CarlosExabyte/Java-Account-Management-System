English:

## Getting Started

Welcome to the guide on how to use the Java program for managing accounts with a MySQL database. This program allows you to create, view, correct, withdraw, and deposit money from accounts stored in a MySQL database through a simple command-line interface. Below is a breakdown of how to get started with the program:

## Folder Structure

- `src`: the folder to maintain sources

## Dependency Management

You can manage dependencies for your Java projects using the JAVA PROJECTS view in Visual Studio Code.

## Program Overview
The Java program provided allows users to perform various operations on accounts stored in a MySQL database, including:

- Creating a new account.
- Viewing all existing accounts.
- Correcting account details.
- Withdrawing money from an account.
- Depositing money into an account.
The accounts and their details are stored in a MySQL database, allowing for efficient management and retrieval of account information.

## Database Setup
Before using the program, you need to set up a MySQL database to store account information. Follow these steps to set up the database:

- Install MySQL Server on your system if you haven't already.
- Create a new database named account_management.
- Create a table named accounts with the following columns:
- id (INT, AUTO_INCREMENT, PRIMARY KEY)
- name (VARCHAR)
- type (VARCHAR)
- balance (DOUBLE)
- debtor (VARCHAR)
- account_number (INT)
- Ensure your MySQL server is running and accessible.

## How to Use
Follow these steps to use the Java program:

Ensure you have Java and a Java Development Kit (JDK) installed on your system.
Clone or download the project files from the repository.
Open the project in Visual Studio Code.
Navigate to the App.java file, which contains the main method to run the program.
Compile and run the program by executing the main method in App.java.
Follow the prompts displayed in the command-line interface to perform various operations on accounts, such as creating, viewing, correcting, withdrawing, and depositing money.

==================================================================================================

PTBR :

## Começando
Bem-vindo ao guia sobre como usar o programa Java para gerenciar contas com um banco de dados MySQL. Este programa permite que você crie, visualize, corrija, retire e deposite dinheiro de contas armazenadas em um banco de dados MySQL por meio de uma interface de linha de comando simples. Abaixo está uma explicação de como começar com o programa:

## Estrutura de Pastas
- src: a pasta para manter os arquivos do programa.

## Visão Geral do Programa
O programa Java fornecido permite que os usuários realizem várias operações em contas armazenadas em um banco de dados MySQL, incluindo:

- Criar uma nova conta.
- Visualizar todas as contas existentes.
- Corrigir detalhes da conta.
- Retirar dinheiro de uma conta.
- Depositar dinheiro em uma conta.
As contas e seus detalhes são armazenados em um banco de dados MySQL, permitindo o gerenciamento eficiente e a recuperação das informações da conta.


## Configuração do Banco de Dados
Antes de usar o programa, você precisa configurar um banco de dados MySQL para armazenar informações da conta. Siga estas etapas para configurar o banco de dados:

- Instale o MySQL Server no seu sistema, se ainda não o tiver feito.
- Crie um novo banco de dados chamado account_management.
- Crie uma tabela chamada accounts com as seguintes colunas:
- id (INT, AUTO_INCREMENT, PRIMARY KEY)
- name (VARCHAR)
- type (VARCHAR)
- balance (DOUBLE)
- debtor (VARCHAR)
- account_number (INT)
- Certifique-se de que seu servidor MySQL esteja em execução e acessível.


## Como Usar
Siga estas etapas para usar o programa Java:

Certifique-se de ter Java e um Kit de Desenvolvimento Java (JDK) instalados no seu sistema.
Clone ou baixe os arquivos do projeto do repositório.
Abra o projeto no Visual Studio Code.
Navegue até o arquivo App.java, que contém o método principal para executar o programa.
Compile e execute o programa executando o método principal em App.java.
Siga as instruções exibidas na interface de linha de comando para realizar várias operações em contas, como criar, visualizar, corrigir, retirar e depositar dinheiro.

