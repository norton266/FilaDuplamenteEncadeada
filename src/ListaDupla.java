public class ListaDupla {
    No inicio;
    No fim;
    int tamanho;

    public ListaDupla(){
        this.inicio = null;
        this.fim = null;
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

    public void inserirMeio(int indice, int info){
        if(indice <= 0){
            inserirInicio(info);
        } else if (indice >= tamanho){
            inserirFim(info);
        } else {
            No local = inicio;
            for(int i = 0; i < indice - 1; i++){
                local = local.proximo;
            }
            No no = new No(info);
            no.info = info;
            no.anterior = local;
            no.proximo = local.proximo;
            local.proximo = no;
            no.proximo.anterior = no;
            tamanho++;
        }
    }

    public int retirarMeio(int indice){
        if(indice < 0 || indice >= tamanho || inicio == null){
            return -1;
        } else if(indice == 0){
            return retirarInicio();
        } else if(indice == tamanho -1){
            return retirarFim();
        }
        No local = inicio;
        for(int i = 0; i < indice; i++){
            local = local.proximo;
        }
        if(local.anterior != null){
            local.anterior.proximo = local.proximo;
        }
        if(local.proximo != null){
            local.proximo.anterior = local.anterior;
        }
        tamanho--;
        return local.info;
    }
}
