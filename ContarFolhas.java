// 3) Conta o número de folhas (nós sem filhos) de uma árvore binária
public class ContarFolhas {

    static int contarFolhas(No no) {
        if (no == null) return 0;
        if (no.esq == null && no.dir == null) return 1;
        return contarFolhas(no.esq) + contarFolhas(no.dir);
    }

    public static void main(String[] args) {
        No raiz = null;
        for (int v : new int[]{50, 30, 70, 20, 40, 10}) raiz = Inserir.inserir(raiz, v);
        System.out.println("Folhas: " + contarFolhas(raiz)); // 3 (10, 40, 70)
    }
}
