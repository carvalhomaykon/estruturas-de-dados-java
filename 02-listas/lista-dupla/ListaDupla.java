package lista;

public class ListaDupla {

    public static void main(String[] args) {


        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.inserirInicio(20);
        lista.inserirInicio(40);
        lista.inserirFinal(100);
        lista.inserirFinal(80);

        lista.removerInicio(); // Remove o 40

        lista.removerFinal(); // Remove o 80

        lista.exibir();

    }

}

class NodeDupla{

    int valor;
    NodeDupla proximo;
    NodeDupla anterior;

     public NodeDupla(int valor) {
         this.valor = valor;
         this.proximo = null;
         this.anterior = null;
     }

}

class ListaDuplamenteEncadeada{

    NodeDupla head;
    NodeDupla cauda;

    public void inserirInicio(int valor){
        NodeDupla no = new NodeDupla(valor);
        if (head == null){
            head = no;
            cauda = no;
        }
        else{
            no.proximo = head;
            head.anterior = no;
            head = no;
        }
    }

    public void inserirFinal(int valor){
        NodeDupla no = new NodeDupla(valor);
        if (head == null){
            head = no;
            cauda = no;
        }
        else{
            cauda.proximo = no;
            no.anterior = cauda;
            cauda = no;
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
            head.anterior = null;
        }
    }

    public void removerFinal(){
        if (head == null){
            System.out.println("Lista vazia");
        }
        else if (head == cauda){
            head = null;
            cauda = null;
        }
        else{
            cauda = cauda.anterior;
            cauda.proximo = null;
        }
    }

    public void exibir(){
        if (head == null){
            System.out.println("Lista Vazia");
        }
        else{
            NodeDupla aux = head;
            System.out.print("null <--> ");
            while (aux != null){
                System.out.print(aux.valor + " <--> ");
                aux = aux.proximo;
            }
            System.out.print("null");
        }
    }

}
