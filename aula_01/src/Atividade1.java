public class Atividade1 {
    public static void main(String[] args) {
        imprimeRec(10);
    }

    public static int fatorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * fatorial(n - 1);
    }

    public static void imprimeRec(int n) {
        if (n > 0)
            imprimeRec(n - 1);
        System.out.println(n);
    }

    public static int potencia(int base, int exp) {
        if (exp == 0)
            return 1;
        else
            return base * potencia(base, exp - 1);
    }

    public static int intervalo(int inicio, int fim) {
        if (inicio <= fim)
            return inicio + intervalo(inicio + 1, fim);
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Atividade1 []";
    }
}
