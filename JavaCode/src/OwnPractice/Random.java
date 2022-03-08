package OwnPractice;

public class Random {

    public static void main(String[] args) {
        int[] p = {1, 4, 6, 4, 5};
        int humpty = 0;
        for (int q = 0; q < p.length - 1; q++) {
            System.out.println("p[" + q + "]=" + p[q] + q);
            if (p[q] > p[q + 1]) {
                humpty = p[q];
            }
        }
        System.out.println("Humpty says: " + humpty);
    }
}
