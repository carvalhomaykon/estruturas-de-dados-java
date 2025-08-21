package lista;

public class ListaCircularDupla {
    public static void main(String[] args) {

        ListaDuplaCircular lista = new ListaDuplaCircular();

        lista.inserirInicio(90);
        lista.inserirInicio(110);
        lista.inserirInicio(30);
        lista.inserirFim(40);

        lista.exibirLista();

        lista.removerInicio();
        lista.removerFim();

        lista.exibirLista();

    }
}

class NodeCircularDupla{

    int valor;
    NodeCircularDupla proximo;
    NodeCircularDupla anterior;

    public NodeCircularDupla (int valor){
        this.valor = valor;
        this.proximo = null;
        this.anterior = null;
    }

}

class ListaDuplaCircular{

    NodeCircularDupla head;
    NodeCircularDupla cauda;

    public void inserirInicio(int valor){
        NodeCircularDupla novo = new NodeCircularDupla(valor);
        if (head == null){
            head = novo;
            cauda = novo;
            head.proximo = head;
            head.anterior = head;
        } else{
            novo.proximo = head;
            novo.anterior = cauda;
            head.anterior = novo;
            cauda.proximo = novo;
            head = novo;
        }
    }

    public void inserirFim(int valor){
        NodeCircularDupla novo = new NodeCircularDupla(valor);
        if (head == null){
            head = novo;
            cauda = novo;
            head.proximo = head;
            head.anterior = head;
        } else{
            novo.anterior = cauda;
            novo.proximo = head;
            cauda.proximo = novo;
            head.anterior = novo;
            cauda = novo;
        }
    }

    public void removerInicio(){
        if (head == null){
            System.out.println("Lista vazia");
        }
        else if (head == cauda){
            head = null;
            cauda = null;
        }
        else{
            head = head.proximo;
            head.anterior = cauda;
            cauda.proximo = head;
        }
    }

    public void removerFim(){
        if (head == null){
            System.out.println("Lista vazia");
        }
        else if (head == cauda){
            head = null;
            cauda = null;
        }
        else{
            cauda = cauda.anterior;
            cauda.proximo = head;
            head.anterior = cauda;
        }
    }

    public void exibirLista(){
        if (head == null){
            System.out.println("Lista vazia");
        }
        else{
            System.out.println("-- MOSTRAR LISTA --");
            NodeCircularDupla no = head;

            do{
                System.out.print(no.valor + " <--> ");
                no = no.proximo;
            } while (no != head);

            System.out.println("(header)");
            System.out.println();
        }
    }
}
