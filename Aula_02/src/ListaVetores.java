public class ListaVetores {

    private int[] vetor;
    private int quantidade; 

    public ListaVetores(int tam) { 
        vetor = new int[tam];
        quantidade = 0;
    }

    void insereFinal(int i) {
        if (quantidade < vetor.length) {
            vetor[quantidade] = i;
            quantidade++;
        }
    }

    Integer retiraFinal() {
        if (quantidade > 0) {
            int temp = vetor[quantidade - 1];
            quantidade--;
            return temp;
        }
        return null;
    }

    int retiraPos(int pos) {
        if (pos >= 0 && pos < quantidade) {
            int item = vetor[pos];
            for (int i = pos + 1; i < quantidade; i++) {
                vetor[i - 1] = vetor[i];
            }
            quantidade--;
            return item;
        }
        throw new IndexOutOfBoundsException("Posição inválida!");
    }

    void imprime() {
        for (int i = 0; i < quantidade; i++) {
            System.out.print(vetor[i] + " -> ");
        }
        System.out.println();
    }

    void resize(int max) {
        int[] temp = new int[max];
        for (int i = 0; i < quantidade; i++) {
            temp[i] = vetor[i];
        }
        vetor = temp;
    }

    void concatena(ListaVetores listaB) {
        int[] temp = new int[quantidade + listaB.quantidade];
        for (int i = 0; i < quantidade; i++) {
            temp[i] = vetor[i];
        }
        for (int i = 0; i < listaB.quantidade; i++) {
            temp[quantidade + i] = listaB.vetor[i];
        }
        vetor = temp;
        quantidade += listaB.quantidade;
    }
}
