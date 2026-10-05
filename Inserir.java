// 4) Insere um número na árvore binária (de busca: menores à esquerda, maiores à direita)
public class Inserir {

    static No inserir(No no, int valor) {
        if (no == null) return new No(valor);
        if (valor < no.valor) no.esq = inserir(no.esq, valor);
        else if (valor > no.valor) no.dir = inserir(no.dir, valor);
        return no; // valores repetidos são ignorados
    }

    static void emOrdem(No no) {
        if (no == null) return;
        emOrdem(no.esq);
        System.out.print(no.valor + " ");
        emOrdem(no.dir);
    }

    public static void main(String[] args) {
        No raiz = null;
        for (int v : new int[]{50, 30, 70, 20, 40, 10}) raiz = inserir(raiz, v);
        emOrdem(raiz); // 10 20 30 40 50 70
        System.out.println();
    }
}
