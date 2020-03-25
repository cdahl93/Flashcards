import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] A = new int[length];
        for (int i = 0 ; i < length ; i++) {
            if (i != length-1) {
                A[i+1] = scanner.nextInt();
            } else {
                A[0] = scanner.nextInt();
            }
        }
        for (int i = 0 ; i < length ; i++) {
            System.out.print(A[i] + " ");
        }
    }
}