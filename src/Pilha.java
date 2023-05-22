public class Pilha extends ListaDupla{

    Pilha(){
        this.inicio = null;
        this.fim = null;
    }

    public void inserirFim(int info){
        No no = new No(info);
        no.info = info;
        no.proximo = null;
        no.anterior = fim;
        if(fim != null){
            fim.proximo = no;
        }
        fim = no;
        if(tamanho == 0){
            inicio = fim;
        }
        tamanho++;
    }

    public int retirarFim(){
        if(fim == null){
            return -1;
        }
        int out = fim.info;
        fim = fim.anterior;
        if(fim != null){
            fim.proximo = null;
        } else {
            inicio = null;
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
