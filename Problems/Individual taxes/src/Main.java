import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCompanies = scanner.nextInt();
        int[] income = new int[numberOfCompanies];
        int[] taxRate = new int[numberOfCompanies];
        double[] tax = new double[numberOfCompanies];
        int max = 0;

        // read incomes
        for (int i = 0 ; i < numberOfCompanies ; i++) {
            income[i] = scanner.nextInt();
        }

        // read taxRate and calculate tax
        for (int i = 0 ; i < numberOfCompanies ; i++) {
            taxRate[i] = scanner.nextInt();
            tax[i] = (double) income[i] * (double) taxRate[i] / 100.0;
            if (i == 0) {
                max = i+1;
            } else if (tax[i] > tax[max-1]) {
                max = i+1;
            }
        }
        System.out.println(max);
    }
}