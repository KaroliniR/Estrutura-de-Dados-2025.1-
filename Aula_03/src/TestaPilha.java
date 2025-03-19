public class TestaPilha {
    public static void main(String[] args) {
        PilhaVetores p = new PilhaVetores(5);
       
        p.empilha(10);
        p.empilha(15);
        p.empilha(66);
        p.empilha(99);
        p.empilha(135);

        while (!p.ehVazia()) {
            System.out.println(p.desempilha());
        }
    }
}
