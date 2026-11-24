import java.util.Random;
import java.util.Scanner;

public class Main {

    static final int N = 50;

    static void wypelnijTablice(int[] tab, int n) {
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            tab[i] = rnd.nextInt(100) + 1;
        }
    }

    static int szukajZWartownikiem(int[] tab, int n, int szukana) {
        tab[n] = szukana;

        int i = 0;
        while (tab[i] != szukana) {
            i++   ;
        }

        if (i == n) {
            return -1;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] tab = new int[N + 1];

        wypelnijTablice(tab, N);

        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbe calkowita do wyszukania: ");
        int szukana = sc.nextInt();

        System.out.println("\nZawartosc tablicy:");
        for (int i = 0; i < N; i++) {
            System.out.print(tab[i]);
            if (i < N - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int wynik = szukajZWartownikiem(tab, N, szukana);

        System.out.println("\nWynik wyszukiwania:");
        if (wynik == -1) {
            System.out.println("Liczby " + szukana + " nie ma w tablicy.");
        } else {
            System.out.println("Liczba " + szukana + " znajduje sie pod indeksem "  +   wynik + ".");
        }

        sc.close();
    }
}
