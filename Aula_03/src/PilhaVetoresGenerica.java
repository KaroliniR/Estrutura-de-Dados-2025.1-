public class PilhaVetoresGenerica<Item> {
    private int qt;
    private Item[] vetor;
    
    // Construtor
    @SuppressWarnings("unchecked")
    public PilhaVetoresGenerica(int tam) {
        this.qt = 0;
        this.vetor = (Item[]) new Object[tam];
    }

    void empilha(Item valor) {
        if (qt < vetor.length) {
            vetor[qt] = valor;
            qt++;            
        }
    }

    Item desempilha() {
        if (qt != 0) {
            qt--;
            return vetor[qt];
        }
        return null;
    }

    boolean ehVazia() {
        return qt == 0;
    }

    void imprime() {
        for (int i = 0; i < qt; i++) {
            System.out.print(vetor[i] + "->");
        }
    }
}