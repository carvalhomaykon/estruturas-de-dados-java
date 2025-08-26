import java.util.List;

public class ListaCircularSimples {
    public static void main(String[] args) {
        ListaSimplesCircular lista = new ListaSimplesCircular();

        lista.inserirInicio(10);
        lista.inserirInicio(20);
        lista.inserirFinal(30);

        lista.remover();

        lista.inserirFinal(40);

        lista.exibirLista();
    }
}

class NodeCircularSimples{

    int valor;
    NodeCircularSimples proximo;

    public NodeCircularSimples(int valor) {
        this.valor = valor;
        this.proximo = null;
    }

}

class ListaSimplesCircular{

    NodeCircularSimples head;
    NodeCircularSimples cauda;

    public void inserirInicio(int valor){
        NodeCircularSimples novo = new NodeCircularSimples(valor);
        if (head == null){
            head = novo;
            cauda = novo;
            cauda.proximo = novo;
        } else{
          novo.proximo = head;
          head = novo;
            cauda.proximo = head;
        }
    }

    public void inserirFinal(int valor){
        NodeCircularSimples novo = new NodeCircularSimples(valor);
        if (head == null) {
            head = novo;
            cauda = novo;
            cauda.proximo = novo;
        } else{
            cauda.proximo = novo;
            cauda = novo;
            cauda.proximo = head;
        }
    }

    public void remover(){
        if (head == null) {
            System.out.println("Lista vazia");
        }
        else if (head == cauda) {
            head = null;
            cauda = null;
        }
        else {
            head = head.proximo;
            cauda.proximo = head;
        }
    }

    public void exibirLista(){
        if (head == null){
            System.out.println("Lista vazia");
        } else{
            NodeCircularSimples no = head;

            do{
                System.out.print(no.valor + " --> ");
                no = no.proximo;
            } while (no != head);
            System.out.print("(head)");
        }
    }

}
