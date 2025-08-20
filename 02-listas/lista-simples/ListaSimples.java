package lista;

public class ListaSimples {

    public static void main(String[] args) {
        ListaSimplementeEncadeada list = new ListaSimplementeEncadeada();

        list.inserirInicio(1);
        list.inserirInicio(2);
        list.inserirFinal(3);

        list.remover();

        list.exibirLista();
    }

}

class Node{
    int valor;
    Node proximo;

    public Node(int valor){
        this.valor = valor;
        this.proximo = null;
    }
}

class ListaSimplementeEncadeada {

    Node head;
    Node cauda;

    public void inserirInicio(int valor){
        Node novo = new Node(valor);
        if (head == null){
            head = novo;
            cauda = novo;
        }
        else{
            novo.proximo = head;
            head = novo;
        }
    }

    public void inserirFinal(int valor){
        Node novo = new Node(valor);
        if (head == null){
            head = novo;
            cauda = novo;
        }
        else{
            cauda.proximo = novo;
            cauda = novo;
        }
    }

    public void remover(){
        if (head == null){
            System.out.println("Lista vazia");
        }
        else{
            head = head.proximo;
            if (head == null){ // lista ficou vazia
                cauda = null;
            }
        }
    }

    public void exibirLista(){
        Node atual = head;
        if (atual == null) {
            System.out.println("Lista vazia");
        }
        else{
            while (atual != null){
                System.out.print(atual.valor + " -> ");
                atual = atual.proximo;
            }
            System.out.println("null");
        }
    }

}