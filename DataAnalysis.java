import java.util.Scanner;

public class DataAnalysis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //  SINGLE DIMENSIONAL ARRAY
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] data = new int[n];


        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }

        // Variables for calculations
        int sum = 0;
        int max = data[0];
        int min = data[0];

        // Traversing array
        for (int i = 0; i < n; i++) {
            sum += data[i];

            if (data[i] > max)
                max = data[i];

            if (data[i] < min)
                min = data[i];
        }

        double average = (double) sum / n;

        //  MANUAL SORTING (ASCENDING)
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (data[i] > data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }

        //  FORMATTED OUTPUT
        System.out.println("\n----- DATA ANALYSIS RESULT -----");
        System.out.println("Sum       : " + sum);
        System.out.println("Average   : " + average);
        System.out.println("Maximum   : " + max);
        System.out.println("Minimum   : " + min);

        System.out.print("Sorted Data: ");
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }

        //  MULTI-DIMENSIONAL ARRAY
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("\n\n2D Array (Matrix):");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //  EXCEPTION HANDLING
        try {
            System.out.println("\nAccessing invalid index:");
            System.out.println(data[n]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception handled: Array index out of bounds!");
        }


    }
}
