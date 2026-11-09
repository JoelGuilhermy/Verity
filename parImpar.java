import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] a = new int[20];
        int[] b = new int[20];
        int posPar = 0;
        int posImpar = b.length - 1;

        for (int i = 0; i < a.length; i++) {
            System.out.print("Digite o valor de A " + (i + 1) + ": ");
            a[i] = ler.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                b[posPar] = a[i];
                posPar++;
            } else {
                b[posImpar] = a[i];
                posImpar--;
            }
        }

        System.out.println("Vetor B:");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        ler.close();
    }
}
