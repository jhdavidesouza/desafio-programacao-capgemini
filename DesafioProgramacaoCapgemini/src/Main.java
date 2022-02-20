import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1º questão do desafio
        /*
        * Temos um dado tamanho N.
        *
        * O programa retorna uma escada
        * com base e altura iguais a N.
        *
        * A última linha não tem espaços.
        * */

        //criando construtor para leitura de entradas
        /*
        * e atribuindo à 'leitor'
        * */
        Scanner leitor = new Scanner(System.in);
        //criando um menu de interação para que o usuário escolha a questão que quer iniciar
        System.out.println("Olá!");
        System.out.println("Bem-vind@ ao menu de questões!");
        System.out.println("Escolha uma das questões e digite o número dela:\n");
        boolean escolhaContinuarNoMenu;
        do {
            System.out.println("SAIR DO PROGRAMA - Digite 0");
            System.out.println("Questão 1 - Criador de Escada - Digite 1");
            System.out.println("Questão 2 - Verificador de Senha Segura - Digite 2");
            System.out.println("Questão 3 - Verificador de Anagramas em Substrings - Digite 3");
            System.out.print("Digite aqui: ");

            char escolhaDoMenu = leitor.next().charAt(0);

            switch (escolhaDoMenu) {
                case '0':
                    System.out.println("\nVocê escolheu sair do programa.\nAté mais!\n");
                    escolhaContinuarNoMenu = false;
                    break;
                case '1':
                    System.out.println("\nVocê escolheu a Questão 1 - Criador de Escada\n");
                    escolhaContinuarNoMenu = true;
                    criadorDeEscada();
                    break;
                case '2':
                    System.out.println("\nVocê escolheu a Questão 2 - Verificador de Senha Segura\n");
                    escolhaContinuarNoMenu = true;
                    verificadorDeSenha();
                    break;
                case '3':
                    System.out.println("\nVocê escolheu a Questão 3 - Verificador de Anagramas em Substrings\n");
                    escolhaContinuarNoMenu = true;
                    verificadorDeSubanagramas();
                    break;
                default:
                    System.out.println("\nO número informado não corresponde à nenhuma opção.");
                    System.out.println("Por favor, digite uma das opções informadas!\n");
                    escolhaContinuarNoMenu = true;
            }
            if (escolhaContinuarNoMenu) {
                System.out.println("\n...Retornando ao Menu de Opções...\n");
            }
            //o menu irá se repetir logo após o término de um método
            //até que o usuário digite 0 para sair do programa
        } while (escolhaContinuarNoMenu);




    }
    //*************  MÉTODOS ABAIXO  *******************************************************************************************
    //*************  MÉTODOS ABAIXO  *******************************************************************************************
    //*************  MÉTODOS ABAIXO  *******************************************************************************************
    public static void criadorDeEscada() {
        Scanner leitorq1 = new Scanner(System.in);
        //Vamos informar ao usuário
        /*
        * Para que ele informe o tamanho da
        * escada que ele quer criar
        *
        * Informando também que o número tem
        * que ser maior do que 0
        **/
        System.out.println("Bem-vind@ à Questão 1 - Criador de Escada\n");
        System.out.println("Por favor, informe um número " +
                "maior que zero para criarmos sua escada:");
        //criando variável para receber tamanho n
        int tamanhoN = leitorq1.nextInt();
        //dependendo do escopo que se quer chegar
        // podemos trocar o tipo 'int' para tipo 'long'

        /*
         * vamos declarar variáveis
                * que recebam o número de espaços iniciais
         * e o número de asteriscos iniciais
         *
         * mais tarde eles irão mudar
                * por causa das iterações, que vão
                * diminuir a quantidade de espaços
         * e aumentar a quantidade de asteriscos
         **/
        //quantidade de espaços
        /*se o usuário não informar valor 0,
         *sempre seguirá o padrão inicial de
         *ter o tamanho informado pelo usuário
         *menos 1, e esse mesmo 1 é a quantidade
         * inicial de asteriscos
         **/
        int quantidadeDeEspacos = tamanhoN - 1;
        int quantidadeDeAsteriscos = 1;
        /*
         * agora precisamos evitar que alguns
         * possíveis erros do usuário prejudiquem
         * o andamento do programa
         *
         * sabemos que informamos uma mensagem
         * ao usuário pedindo a ele que
         * informe um número maior do que zero
         *
         * mas ainda assim, ele pode digitar 0
         * ou algo menor do 0
         *
         * vamos impedir que o programa
         * prossiga caso leiam-se esses valores
         **/

        //como sabemos que o usuário pode tanto
        /*errar quanto acertar na entrada do programa,
         *
         * é importante iniciarmos um loop
         * que repita a ação de informar o valor
         * até que esse valor seja maior do que zero
         *
         * e depois continue o programa
         **/

        //como sabemos que o parâmetro para um 'while' iniciar é que
        // sua condição seja verdadeira, então não precisamos colocar um if aqui, por enquanto
        while (tamanhoN <= 0) {
            System.out.println("Ops! Infelizmente, não podemos");
            System.out.println("criar a sua escada, pois não");
            System.out.println("é possível realizar os cálculos");
            System.out.println("com números menores ou iguais a zero!\n");
            //informando ao usuário o que ele digitou
            System.out.println("Você digitou esse número: " + tamanhoN + "\n");
            System.out.println("Por favor, digite um número maior que zero:");
            tamanhoN = leitorq1.nextInt();
        }

        //agora, após sair desse loop condicional, deixaremos o programa
        //sempre interativo ao usuário para ele, ao menos, ver o que ele informou de correto
        System.out.println("\nEntendi! Você quer que criemos uma escada de base e altura: " + tamanhoN + "\n");
        System.out.println("Aqui está:\n");

        //Lembrando da declaração de variáveis iniciais
        /*
        * Entendemos que a quantidade de espaços inicia com o tamanho informado menos 1
        * e a quantidade de asteriscos iniciaria em 1 até chegar ao tamanho desejado
        *
        * Também falamos que o quantidade de espaços diminui
        * ao mesmo tempo que a quantidade de asteriscos aumenta
        *
        * então iniciaremos um loop,
        * para que repita as ações de imprimir asteriscos e espaços
        * nos requisitos informados pela questão
        **/

        //aqui o primeiro parâmetro não precisa existir
        /*
        * pois os valores já foram inicializados acima
        **/
        //queremos que a quantidade de asteriscos aumente até
        // o tamanho desejado
        for (; quantidadeDeAsteriscos <= tamanhoN;
            //nisso temos a condição para que o loop encerre
            //no momento em que o tamanho desejado for alcançado
             quantidadeDeAsteriscos++, quantidadeDeEspacos--) {
            //da mesma forma, vemos que cada que uma linha for impressa
            //os asteriscos aumentam e os espaços diminuem

            //abaixo, temos o loop que faz com que os espaços sejam impressos
            //antes que os asteriscos e em uma linha só
            for (int criaEspaco = 1;
                 criaEspaco <= quantidadeDeEspacos;
                 criaEspaco++) {
                System.out.print(" ");
            }
            //abaixo temos o loop que, depois dos espaços serem impressos
            //iniciará a impressão dos asteriscos em uma linha só
            for (int criaAsterisco = 1;
                 criaAsterisco <= quantidadeDeAsteriscos;
                 criaAsterisco++) {
                /*
                 *para que se crie uma nova linha,
                 *a quantidade de asteriscos dentro do loop
                 * tem que ser alcançada.
                 *
                 * só ali que a linha deve ser quebrada
                 */
                if (criaAsterisco == quantidadeDeAsteriscos) {
                    System.out.println("*");
                } else {
                    System.out.print("*");
                }
            }
        }
        //programa espera o usuário fazer esta ação abaixo, apenas para deixar a informação
        //na tela mais controlada e menos abrupta
        System.out.print("------------" +
                "Para continuar, pressione qualquer tecla e depois pressione ENTER:" +
                "------------");
        leitorq1.next();
        System.out.println();
    }

    public static void verificadorDeSenha() {
        Scanner leitorq2 = new Scanner(System.in);
        //Vamos informar ao usuário
        /*
         * Para que ele informe a senha a ser verificada
         *
         * E também informar os requisitos necessários
         **/
        System.out.println("Bem-vind@ à Questão 2 - Verificador de Senha Segura\n");
        System.out.println("Para que sua senha seja considerada segura,");
        System.out.println("você precisa atender estes requisitos:\n");
        System.out.println("1. A senha tem no mínimo 6 caracteres\n" +
                            "Exemplo: a1b2c3 - possui 6 caracteres");
        System.out.println("2. A senha tem no mínimo 1 digito (número)\n" +
                            "Exemplo: abcde1 - possui 1 digito (número) e 6 caracteres");
        System.out.println("3. A senha tem no mínimo 1 letra minúscula\n" +
                            "Exemplo: ABCDe1 - possui 1 letra minúscula, 1 digito e 6 caracteres");
        System.out.println("4. A senha tem no mínimo 1 letra maiúscula\n" +
                            "Exemplo: Abcde1 - possui 1 letra maiúscula, minúscula, 1 digito e 6 caracteres");
        System.out.println("5. A senha tem no mínimo 1 caracter especial\n" +
                            "\t! @ # $ % ^ & * ( ) - +\n" +
                            "Exemplo: Ab#de1 - possui 1 caracter especial, maiúsculo, minúscula, 1 digito e 6 caracteres");
        System.out.print("\n\nDigite a senha para ser verificada: ");

        //usuário então escreve a senha que será armazenada dentro da variável declarada
        String senha = leitorq2.next();

        //criando uma string de caracteres especiais para ser verificada posteriormente
        //e ajudar no funcionamento do requisito 5.
        String caracteresEspeciais = "!@#$%^&*()-+";
        //criando uma string com todos os caracteres dos requisitos necessários
        // para evitar que o usuário digite outros caracteres senão aqueles que
        // atendem os requisitos
        //por exemplo: < > ; / ´ ~ [ { } ] , entre outros
        String caracteresValidos = "0123456789" +
                                   "abcdefghijklmnopqrstuvwxyzç" +
                                   "ABCDEFGHIJKLMNOPQRSTUVWXYZÇ" +
                                   caracteresEspeciais;

        //iniciar variável para que ela armazene o tamanho da senha digitada
        int tamanhoDaSenha = senha.length();
        //iniciamos uma variável que armazene o tamanho da string de char especiais
        int tamanhoDosCaracteresEspeciais = caracteresEspeciais.length();
        //iniciamos uma variável que armazene o tamanho da string de char válidos
        int tamanhoDosCaracteresValidos = caracteresValidos.length();
        //iniciar variáveis de valor lógico para que funcionem como sinalizador e retornem 'true'
        // caso os requisitos delas sejam atendidos
        boolean senhaTemTamanhoMinimo = tamanhoDaSenha >= 6;//1. se a senha for maior ou igual a 6
        boolean senhaTemDigito = false;//2. se a senha possuir ao menos 1 digito
        boolean senhaTemMinusculo = false;//3. se a senha possui ao menos 1 letra minúscula
        boolean senhaTemMaiusculo = false;//4. se a senha possui ao menos 1 letra maiúscula
        boolean senhaTemEspecial = false;//5. se a senha possui ao menos 1 char especial
        //pode acontecer do usuário criar uma senha com um caracter inválido
        // e deixar um bug no nosso programa
        boolean senhaTemInvalido = false; //sinalizador que mudará para 'true' caso haja char inválido

        //.charAt(X) é um método que retorna o caracter encontrado na posição X de um
        // array ou string, esse método facilitará o processamento dos dados e verificação
        // dos requisitos abaixo

        //criando um loop que analisa se algum dos caracteres da senha
        // é diferente do caracteres possíveis e válidos
        // determinando se há caracteres inválidos ou não
        for (int indexDaSenha = 0;
                indexDaSenha < tamanhoDaSenha;
                indexDaSenha++) {
            //para cada index da senha a ser analisada
            //o loop abaixo irá verificar se o index da senha
            //é diferente de qualquer caracter que tenha dentro
            // da string de caracteres disponiveis
            int contadorDeCharIgual = 0;
            //criamos esse contador para verificar no loop abaixo
            // se houve algum caracter que fosse igual a algum dos caracteres válidos
            for (int indexCaracteresValidos = 0;
                 indexCaracteresValidos < tamanhoDosCaracteresValidos;
                 indexCaracteresValidos++) {
                //verificaremos se aquele caracter é igual a algum dos
                //caracteres válidos
                if (senha.charAt(indexDaSenha) == caracteresValidos.charAt(indexCaracteresValidos)) {
                    //caso ele seja igual a algum
                    //quer dizer que o caracter é válido e podemos prosseguir para o próximo
                    // index da senha
                    contadorDeCharIgual++;//se houver igual, adicionamos um
                }
            }
            if (contadorDeCharIgual == 0) {
                //se não houve caracter igual a ele, quer dizer
                // que aquele caracter não é válido
                //portanto há um caracter inválido na senha
                senhaTemInvalido = true;
            }
        }

        //2. A senha tem no minimo 1 digito
        //criando um loop que investiga índice por índice se há um digito na senha
        for (int indexDaSenha = 0; indexDaSenha < tamanhoDaSenha; indexDaSenha++) {
                if (Character.isDigit(senha.charAt(indexDaSenha))) {
                    //método isDigit() retorna 'true' caso o caracter seja um número
                    //portanto a senha tem um digito
                    senhaTemDigito = true;
                }
        }

        //3. A senha tem no mínimo 1 letra minúscula
        //criando um loop que investiga índice por índice se há uma letra minuscula na senha
        for (int indexDaSenha = 0; indexDaSenha < tamanhoDaSenha; indexDaSenha++) {
            if (Character.isLowerCase(senha.charAt(indexDaSenha))) {
                //método isLowerCase() retorna 'true' caso aquele caracter seja minúsculo
                //portanto a senha tem um caracter minusculo
                senhaTemMinusculo = true;
            }
        }

        //4. A senha tem no mínimo 1 letra maiúscula
        //criando um loop que investiga índice por índice se há uma letra maiuscula na senha
        for (int indexDaSenha = 0; indexDaSenha < tamanhoDaSenha; indexDaSenha++) {
            if (Character.isUpperCase(senha.charAt(indexDaSenha))) {
                //método isUpperCase() retorna 'true' caso aquele caracter seja maiúsculo
                //portanto a senha tem um caracter maiúsculo
                senhaTemMaiusculo = true;
            }
        }

        //5. A senha tem no mínimo 1 caracter especial
        //criando um loop que investiga índice por índice se há um char especial na senha
        //*****Queremos que ele inicialize com o índice da senha
        // e que cada caracter daquele índice seja comparado com
        // todos os índices da string de char especiais
        for (int indexDaSenha = 0;
             indexDaSenha < tamanhoDaSenha;
             indexDaSenha++) {
            //aqui iniciamos o loop que pega o índice atual do loop anterior
            //e compara com cada índice da string de char especiais
            for (int indexDosCaracteresEspeciais = 0;
                 indexDosCaracteresEspeciais < tamanhoDosCaracteresEspeciais;
                 indexDosCaracteresEspeciais++) {
                //aqui abaixo, comparamos o caracter no index da senha informada
                // com o caracter no index da string de char especiais
                if (senha.charAt(indexDaSenha) == caracteresEspeciais.charAt(indexDosCaracteresEspeciais)) {
                    //caso haja ao menos um char especial
                    // o sinalizador criado no início do programa será 'true'
                    senhaTemEspecial = true;
                }
            }
        }

        //com todos os sinalizadores já condicionados
        //fazemos a verificação de invalidez da senha
        //*****Caso não haja caracter inválido na senha
        // começamos a analisar os requisitos
        if (senhaTemInvalido){
            System.out.println("\nSua senha não foi aprovada.\n" +
                                "Sua senha possui algum caracter inválido!");
            System.out.println("Lembrando que os caracteres válidos são estes abaixo:\n" +
                                "0 1 2 3 4 5 6 7 8 9\n" +
                                "a b c d e f g h i j k l m n o p q r s t u v w x y z ç\n" +
                                "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z Ç\n" +
                                "! @ # $ % ^ & * ( ) - +\n");
        } else {
            if (senhaTemTamanhoMinimo &&
                    senhaTemDigito &&
                    senhaTemMinusculo &&
                    senhaTemMaiusculo &&
                    senhaTemEspecial) {
                //caso todos os requisitos sejam verdadeiros, a senha é segura e
                //o usuário pode saber disso pela mensagem abaixo
                System.out.println("\nSua senha está aprovada.\nSua senha é segura!");
            } else {
                //caso um deles seja falso, este 'senão' será acionado
                // assim uma mensagem de erro será apresentada
                // juntamente com todos os requisitos que NÃO foram atendidos
                System.out.println("\nSua senha não foi aprovada.\nVerifique o que está faltando nela:\n");
                if (!senhaTemTamanhoMinimo) {
                    System.out.println("Requisito 1. Sua senha precisa ter no mínimo 6 caracteres");
                    System.out.println("Coloque mais " + (6 - tamanhoDaSenha) + " caracteres em sua senha!\n");
                }
                if (!senhaTemDigito) {
                    System.out.println("Requisito 2. Sua senha precisa ter no mínimo 1 digito");
                    System.out.println("Coloque um digito em sua senha!");
                    System.out.println("Lista de digitos possíveis: 0 1 2 3 4 5 6 7 8 9\n");
                }
                if (!senhaTemMinusculo) {
                    System.out.println("Requisito 3. Sua senha precisa ter no mínimo 1 caracter minúsculo");
                    System.out.println("Coloque um caracter minúsculo em sua senha!");
                    System.out.println("Lista de caracteres minúsculos:\n" +
                            "a b c d e f g h i j\n" +
                            "k l m n o p q r s t\n" +
                            "u v w z y z ç\n");
                }
                if (!senhaTemMaiusculo) {
                    System.out.println("Requisito 4. Sua senha precisa ter no mínimo 1 caracter maiúsculo");
                    System.out.println("Coloque um caracter maiúsculo em sua senha!");
                    System.out.println("Lista de caracteres maiúsculos:\n" +
                            "A B C D E F G H I J\n" +
                            "K L M N O P Q R S T\n" +
                            "U V W X Y Z Ç\n");
                }
                if (!senhaTemEspecial) {
                    System.out.println("Requisito 5. Sua senha precisa ter no mínimo 1 caracter especial");
                    System.out.println("Coloque um caracter especial em sua senha!");
                    System.out.println("Lista de caracteres especiais disponíveis:\n" +
                            "! @ # $ % ^ & * ( ) - +\n");
                }
            }
        }
        //programa espera o usuário fazer esta ação abaixo, apenas para deixar a informação
        //na tela mais controlada e menos abrupta
        System.out.print("------------" +
                "Para continuar, pressione qualquer tecla e depois pressione ENTER:" +
                "------------");
        leitorq2.next();
        System.out.println();
    }

    public static void verificadorDeSubanagramas() {
        Scanner leitorq3 = new Scanner(System.in);

        //este procedimento achará todos os possíveis
        //pares de substrings que são anagramas de uma string qualquer

        //Informando ao usuário
        System.out.println("Bem-vind@ à Questão 3 - Verificador de Anagramas em Substrings!");
        System.out.print("Informe uma palavra qualquer: ");
        //lendo a string informada pelo usuário
        String stringLida = leitorq3.next();

        //variável que inicializa com o tamanho da stringLida menos 1 e vai decrementando-se -1
        // e servirá para informar qual o tipo de tamanho de palavra que será analisado
        // por exemplo:
        // tamanhoDaPalavra == 1, quer dizer que apenas letras serão analisadas
        // tamanhoDaPalavra == 2, quer dizer que todos os pares possíveis de letras na palavra serão analisadas
        // e assim por diante
        int tamanhoDaPalavra = stringLida.length() - 1;

        Arrays.sort();

        //informando os resultados ao usuário depois do processamento de dados
        System.out.println("\nEstes são os pares de substrings que são anagramas:");
        System.out.println("Array de Substrings");
        System.out.println("Nos índices: " + "Array de Índices");
        System.out.println("Na palavra que você informou: " + stringLida);

        //programa espera o usuário fazer esta ação abaixo, apenas para deixar a informação
        //na tela mais controlada e menos abrupta
        System.out.print("------------" +
                            "Para continuar, pressione qualquer tecla e depois pressione ENTER:" +
                            "------------");
        leitorq3.next();
        System.out.println();
    }
}
