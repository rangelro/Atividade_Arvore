// 5) Deleta um nó da árvore binária (de busca)
public class Deletar {

    static No deletar(No no, int valor) {
        if (no == null) return null;
        if (valor < no.valor) {
            no.esq = deletar(no.esq, valor);
        } else if (valor > no.valor) {
            no.dir = deletar(no.dir, valor);
        } else {
            // 0 ou 1 filho: o filho (ou null) ocupa o lugar do nó
            if (no.esq == null) return no.dir;
            if (no.dir == null) return no.esq;
            // 2 filhos: copia o menor valor da subárvore direita e remove ele de lá
            No sucessor = no.dir;
            while (sucessor.esq != null) sucessor = sucessor.esq;
            no.valor = sucessor.valor;
            no.dir = deletar(no.dir, sucessor.valor);
        }
        return no;
    }

    public static void main(String[] args) {
        No raiz = null;
        for (int v : new int[]{50, 30, 70, 20, 40, 10}) raiz = Inserir.inserir(raiz, v);
        raiz = deletar(raiz, 20); // nó com 1 filho (10)
        raiz = deletar(raiz, 40); // folha
        raiz = deletar(raiz, 50); // raiz com 2 filhos
        Inserir.emOrdem(raiz); // 10 30 70
        System.out.println();
    }
}
