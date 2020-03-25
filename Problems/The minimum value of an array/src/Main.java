import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        int min = 0;
        for (int i = 0 ; i < length ; i++) {
            numbers[i] = scanner.nextInt();
            if (i == 0) {
                min = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(min);
    }
}