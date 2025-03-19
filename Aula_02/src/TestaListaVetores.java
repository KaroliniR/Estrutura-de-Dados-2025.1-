public class TestaListaVetores {

    public static void main(String[] args) {
        ListaVetores lista = new ListaVetores(5);
        
        lista.insereFinal(10);
        lista.insereFinal(15);
        lista.insereFinal(25);
        lista.insereFinal(30);
        lista.insereFinal(50);

        lista.imprime();

        System.out.println(lista.retiraFinal());
        System.out.println(lista.retiraFinal());

        lista.retiraPos(1);
        lista.insereFinal(60);

        lista.imprime();
    }
}
