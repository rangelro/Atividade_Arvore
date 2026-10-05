// 1) Altura de uma árvore binária (vazia = -1, só a raiz = 0)
public class Altura {

    static int altura(No no) {
        if (no == null) return -1;
        return 1 + Math.max(altura(no.esq), altura(no.dir));
    }

    public static void main(String[] args) {
        No raiz = null;
        for (int v : new int[]{50, 30, 70, 20, 40, 10}) raiz = Inserir.inserir(raiz, v);
        System.out.println("Altura: " + altura(raiz)); // 3
    }
}
