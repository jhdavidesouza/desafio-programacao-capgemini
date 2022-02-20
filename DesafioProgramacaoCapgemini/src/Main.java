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
        boolean escolhaMenuInvalida = false;
        do {
            System.out.println("SAIR DO MENU - Digite 0");
            System.out.println("Questão 1 - Criador de Escada - Digite 1");
            System.out.println("Questão 2 - Verificador de Senha Segura- Digite 2");
            System.out.println("Questão 3 - Verificador de Subanagramas - Digite 3\n");
            System.out.print("Digite aqui: ");

            int escolhaDoMenu = leitor.nextInt();

            switch (escolhaDoMenu) {
                case 0:
                    System.out.println("\nVocê escolheu sair do menu.\n\nAté mais!\n");
                    escolhaMenuInvalida = false;
                    break;
                case 1:
                    System.out.println("\nVocê escolheu a Questão 1 - Criador de Escada\n");
                    escolhaMenuInvalida = false;
                    criadorDeEscada();
                    break;
                case 2:
                    System.out.println("\nVocê escolheu a Questão 2 - Verificador de Senha Segura\n");
                    escolhaMenuInvalida = false;
                    /*verificadorDeSenha();*/
                    break;
                case 3:
                    System.out.println("\nVocê escolheu a Questão 3 - Verificador de Subanagramas\n");
                    escolhaMenuInvalida = false;
                    /*verificadorDeSubanagramas();*/
                    break;
                default:
                    System.out.println("\nO número informado não corresponde à nenhuma opção.");
                    System.out.println("Por favor, digite uma das opções informadas!\n");
                    escolhaMenuInvalida = true;
            }
        } while (escolhaMenuInvalida);


    }
    //*************  MÉTODOS ABAIXO  *******************************************************************************************
    //*************  MÉTODOS ABAIXO  *******************************************************************************************
    //*************  MÉTODOS ABAIXO  *******************************************************************************************
    public static void criadorDeEscada() {
        Scanner leitor = new Scanner(System.in);
        //Vamos informar ao usuário
        /*
        * Para que ele informe o tamanho da
        * escada que ele quer criar
        *
        * Informando também que o número tem
        * que ser maior do que 0
        **/
        System.out.println("Bem-vind@ à questão 1.\n");
        System.out.println("Por favor, informe um número " +
                "maior que zero para criarmos sua escada:");
        //criando variável para receber tamanho n
        int tamanhoN = leitor.nextInt();
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
            tamanhoN = leitor.nextInt();
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
    }

    public static void verificadorDeSenha() {

    }

    public static void verificadorDeSubanagramas() {

    }
}
