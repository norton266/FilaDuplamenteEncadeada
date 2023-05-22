public class Fila extends ListaDupla{

    Fila(){
        this.inicio = null;
        this.fim = null;
    }

    public void inserirInicio(int info){
        No no = new No(info);
        no.info = info;
        no.anterior = null;
        no.proximo = inicio;

        if(inicio != null){
            inicio.anterior = no;
        }
        inicio = no;

        if(tamanho == 0){
            fim = inicio;
        }
        tamanho++;
    }

    public int retirarInicio(){
        if(inicio == null){
            return -1;
        }
        int out = inicio.info;
        inicio = inicio.proximo;
        if(inicio != null){
            inicio.anterior = null;
        } else {
            fim = null;
        }
        tamanho--;
        return out;
    }

    public void imprimirInicioAoFim(){
        No atual = inicio;
        System.out.println("Elementos da lista: ");
        while(atual != null){
            System.out.println(atual.info + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}
