// 2) Conta o número de nós de uma árvore binária
public class ContarNos {

    static int contarNos(No no) {
        if (no == null) return 0;
        return 1 + contarNos(no.esq) + contarNos(no.dir);
    }

    public static void main(String[] args) {
        No raiz = null;
        for (int v : new int[]{50, 30, 70, 20, 40, 10}) raiz = Inserir.inserir(raiz, v);
        System.out.println("Nós: " + contarNos(raiz)); // 6
    }
}
