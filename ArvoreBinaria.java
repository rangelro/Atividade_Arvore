// Árvore binária de busca: guarda a raiz e usa as operações das outras classes
public class ArvoreBinaria {
    No raiz;

    void inserir(int valor) { raiz = Inserir.inserir(raiz, valor); }
    void deletar(int valor) { raiz = Deletar.deletar(raiz, valor); }
    int altura() { return Altura.altura(raiz); }
    int contarNos() { return ContarNos.contarNos(raiz); }
    int contarFolhas() { return ContarFolhas.contarFolhas(raiz); }
    void emOrdem() { Inserir.emOrdem(raiz); System.out.println(); }

    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        for (int v : new int[]{50, 30, 70, 20, 40, 10}) arvore.inserir(v);
        arvore.emOrdem(); // 10 20 30 40 50 70
        if (arvore.altura() != 3 || arvore.contarNos() != 6 || arvore.contarFolhas() != 3)
            throw new AssertionError("falhou antes de deletar");
        arvore.deletar(50);
        arvore.emOrdem(); // 10 20 30 40 70
        if (arvore.contarNos() != 5) throw new AssertionError("falhou ao deletar");
    }
}
