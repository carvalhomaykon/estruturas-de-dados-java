package filas;

import java.util.Scanner;

public class Fila {

    private static class FILA{
        private int valor;
        private FILA prox;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        FILA inicio = null;
        FILA fim = null;
        FILA aux;

        int op;

        do{
            System.out.println("--MENU OPÇÃO--");
            System.out.println("1. Inserir na fila");
            System.out.println("2. Remover na fila");
            System.out.println("3. Consultar fila");
            System.out.println("4. Esvazia a fila");
            System.out.println("5. Sair");

            System.out.print("\nDigite a sua opção: ");
            op = sc.nextInt();

            if (op > 5 || op < 1){
                System.out.println("Opção inválida.");
            }

            if (op == 1){
                System.out.print("Digite o número para inserir: ");
                FILA novo = new FILA();
                novo.valor = sc.nextInt();
                novo.prox = null;

                if (inicio == null){
                    inicio = novo;
                    fim = novo;
                }else{
                    fim.prox = novo;
                    fim = novo;
                }
            }
            if (op == 2){
                if (inicio == null){
                    System.out.println("Fila vazia.");
                }
                else{
                    System.out.println("Removendo " + inicio.valor + " da fila");
                    inicio = inicio.prox;
                }
            }
            if (op == 3){
                if (inicio == null){
                    System.out.println("Fila vazia.");
                }
                else{
                    System.out.println("\nConsultando toda a fila.");
                    aux = inicio;
                    while (aux != null){
                        System.out.print(aux.valor + " -> ");
                        aux = aux.prox;
                    }
                    System.out.println("\n");
                }
            }
            if (op == 4){
                if (inicio == null){
                    System.out.println("Fila vazia.");
                }
                else{
                    System.out.println("\nEsvaziando a fila");
                    inicio = null;
                }
            }
        }while (op != 5);
    }
}
