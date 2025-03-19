public class PilhaVetores {
    private int qt;
    private Integer[] vetor;
    
    //construtor
    PilhaVetores(int tam){
        this.qt = 0;
        this.vetor = new Integer[tam];
    }

    void empilha(int valor){
        if (qt < vetor.length){
            vetor[qt] = valor;
            qt++;            
        }
    }

    Integer desempilha(){
        if(qt != 0){
            qt--;
            return vetor[qt];
        }
        return null;
    }

    boolean ehVazia() {
        return qt == 0;
    }

    void imprime(){
        for(int i=0; i<qt; i++){
            System.out.print(vetor[i] + "->");
        }
        System.out.println();
    }

}