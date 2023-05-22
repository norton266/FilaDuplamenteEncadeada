import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 999;
        int valor, indice;
        ListaDupla l = new ListaDupla();
        Fila f = new Fila();
        Pilha p = new Pilha();

        while(opcao != 0){
            System.out.println("1 - Adicionar valores em Lista duplamente encadeada.");
            System.out.println("2 - Remover valores em Lista duplamente encadeada.");
            System.out.println("3 - Listar valores em Lista duplamente encadeada");
            System.out.println("4 - Adicionar valores em Fila.");
            System.out.println("5 - Remover valores em Fila.");
            System.out.println("6 - Listar valores em Fila.");
            System.out.println("7 - Adicionar valores em Pilha.");
            System.out.println("8 - Remover valores em Pilha.");
            System.out.println("9 - Listar valores em Pilha.");
            System.out.println("0 - Encerrar.");

            opcao = input.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("1 - Adicionar elemento no início da lista.");
                    System.out.println("2 - Adicionar elemento no meio da lista.");
                    System.out.println("3 - Adicionar elemento no fim da lista.");

                    opcao = input.nextInt();
                    if(opcao == 1){
                        System.out.println("Digite o valor a ser adicionado ao início da lista:");
                        l.inserirInicio(valor = input.nextInt());
                    } else if(opcao == 2){
                        System.out.println("Digite o valor a ser adicionado ao meio da lista:");
                        l.inserirMeio(indice = input.nextInt(), valor = input.nextInt());
                    } else if(opcao == 3){
                        System.out.println("Digite o valor a ser adicionado ao fim da lista:");
                        l.inserirFim(valor = input.nextInt());
                    }
                    break;
                case 2:
                    System.out.println("1 - Remover elemento no início da lista.");
                    System.out.println("2 - Remover elemento no meio da lista.");
                    System.out.println("3 - Remover elemento no fim da lista.");

                    opcao = input.nextInt();
                    if(opcao == 1){
                        l.retirarInicio();
                    } else if(opcao == 2){
                        System.out.println("Digite o índice do valor a ser removido:");
                        l.retirarMeio(indice = input.nextInt());
                    } else if(opcao == 3){
                        l.retirarFim();
                    }
                    break;
                case 3:
                    l.imprimirInicioAoFim();
                    break;
                case 4:
                    System.out.println("Digite o valor a ser adicionado:");
                    f.inserirInicio(valor = input.nextInt());
                    break;
                case 5:
                    f.retirarFim();
                    break;
                case 6:
                    f.imprimirInicioAoFim();
                    break;
                case 7:
                    System.out.println("Digite o valor a ser adicionado:");
                    p.inserirFim(valor = input.nextInt());
                    break;
                case 8:
                    p.retirarFim();
                    break;
                case 9:
                    p.imprimirInicioAoFim();
                    break;
                case 0:
                    System.out.println("Saindo do programa!");
                    System.exit(0);
                default:
                    System.out.println("Digite uma opção válida!");
            }
        }

    }
}