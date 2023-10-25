import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }
        Main main = new Main();
        System.out.println(main.getPercentGreaterMiddle(array));

        int n = in.nextInt();
        double[][] matrix = main.single(n);
        for (double[] line : matrix) {
            for (double number : line) {
                System.out.print(number);
                System.out.print("\t");
            }
            System.out.println();
        }

        in.nextLine();
        String str = in.nextLine();
        System.out.println(main.capitalize(str));
        in.close();
    }

    public float getPercentGreaterMiddle(int[] numbers) {
        int average = (int)Arrays.stream(numbers).average().getAsDouble();
        int count = 0;

        for (int number : numbers) {
            if (number > average) {
                count++;
            }
        }

        return ((float)count / numbers.length) * 100;
    }

    public double[][] single(int size) {
        double [][] matrix = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = 1;
            }
        }
        return matrix;
    }

    public String capitalize(String str) {
        if (str == null) {
            return null;
        }

        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < 2) {
                continue;
            }
            String firstChar = words[i].substring(0, 1);
            firstChar = firstChar.toUpperCase();
            words[i] = firstChar + words[i].substring(1);
        }
        return String.join(" ", words); // Hello Java
    }
}
