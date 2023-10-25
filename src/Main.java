import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] array1 = {3, 3, 3, 6, 8, 1};

        Main main = new Main();
        System.out.println(main.getPercentGreaterMiddle(array1));

        double[][] matrix = main.single(7);

        String test = null;
        System.out.println(main.capitalize(test));
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
