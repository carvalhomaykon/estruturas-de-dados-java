import java.util.Scanner;

public class Pilha {

    /*
     * Criação da classe pilha
     * Ela terá um valor e um ponteiro para a próxima pilha
     * 
     * A pilha organizados os dados de forma sequencial seguindo a política LIFO (Last In First Out) - O primeiro a entrar é o primeiro a sair
     * Um exemplo prático de pilha seria uma pilha de pratos, na qual o primeiro pratos a entrar será o último a sair.
     */

    // A classe pilha guardará um valor e um ponteiro para a próxima pilha
    private static class PILHA{
        public int num;
        public PILHA prox;
    }

    // Arquivo main
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Sempre que uma pilha for iniciada o ponteiro irá apontar para null
        PILHA topo = null;
        // Ponteiro auxiliar
        PILHA aux;
        int opcao;

        do{
            System.out.println("-- MENU DE OPÇÕES -- \n");
            System.out.println("1 - Inserir na pilha");
            System.out.println("2 - Consultar toda pilha");
            System.out.println("3 - Remover da pilha");
            System.out.println("4 - Esvaziar a pilha");
            System.out.println("5 - Sair");
            System.out.print("Digite sua opção: ");
            opcao = sc.nextInt();
            if (opcao < 1 || opcao > 5){
                System.out.println("Opção inválida!");
            }
            if (opcao == 1){
                System.out.println("Digite o número para inserir na pilha: ");
                int num_inserir = sc.nextInt(); // Recebe o valor digitado pelo usuário
                PILHA novo = new PILHA(); // Instancia um novo objeto da classe pilha
                novo.num = num_inserir; // Atribui o valor da entrada ao novo objeto
                novo.prox = topo; // O ponteiro do novo objeto aponta para o topo da pilha
                topo = novo; // O topo da pilha é o novo objeto
                System.out.println("Número inserido com sucesso!");
            }
            if (opcao == 2){
                if (topo == null){
                    System.out.println("Pilha está vazia");
                }
                else{
                    System.out.println("Consultando a Pilha: ");
                    aux = topo; // Definir o auxiliar como o topo
                    // Enquanto o auxiliar for diferente de null
                    // Continue printando os valores
                    while (aux != null){
                        System.out.println(aux.num); // Imprime o valor do auxiliar
                        aux = aux.prox; // Passa o auxiliar para o próximo
                    }
                }
            }
            if (opcao == 3){
                if (topo == null){
                    System.out.println("Pilha está vazia");
                }
                else{
                    System.out.println("Número " + topo.num + " removido da pilha.");
                    topo = topo.prox; // Passa o topo para o próximo
                    // E consequentemente o valor é removido
                }

            }
            if (opcao == 4){
                if (topo == null){
                    System.out.println("Pilha está vazia");
                }
                else{
                    System.out.println("Removendo todos os valores da pilha");
                    topo = null; // Esvazia a pilha
                    // Na linguagem Java, para esvaziar uma pilha, basta deixar o topo null
                }
            }
        } while (opcao != 5);
    }

}
