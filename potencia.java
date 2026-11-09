public class pontencia {
    public static void main(String[] args) {
        int[] a = new int[11];

        for (int i = 0; i < a.length; i++) {
            int pot = 1;

            for (int j = 0; j < i; j++) {
                pot = pot * 2;
            }

            a[i] = pot;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("A[" + i + "] = " + a[i]);
        }
    }
}
