

public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.

    public static void print(int[][] arr){
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers

    public static int sum(int[][] arr){
        int sum = 0;
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                sum+=arr[row][col];
            }
        }
        return sum;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.

    public static double average(int[][] arr){
        int sum = sum(arr);
        int num = arr.length*arr[0].length;
        return ((double) sum/num);
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.

    public static int minimum(int[][] arr){
        int min = arr[0][0];
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col] < min)
                    min = arr[row][col];
            }
        }
        return min;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.

    public static int maximum(int[][] arr){
        int max = arr[0][0];
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col] > max)
                    max = arr[row][col];
            }
        }
        return max;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.


    public static int evenCountStandard(int[][] arr){
        int num = 0;
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col]%2==0)
                    num++;
            }
        }
        return num;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.


    public static int evenCountEnhanced(int[][] arr){
        int num = 0;
        for (int[] row: arr) {
            for (int col: row) {
                if (col%2==0)
                    num++;
            }
        }
        return num;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.

    public static boolean allPositive(int[][] arr){
        for (int[] row: arr) {
            for (int col: row) {
                if (col<0) return false;
            }
        }
        return true;
    }
    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.

    public static int[] rowSums(int[][] arr){
        int[] output = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for (int col: arr[i]){
                sum += col;
            }
            output[i] = sum;
        }
        return output;
    }
    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.

    public static int[] colSums(int[][] arr){
        int[] output = new int[arr.length];
        for(int i = 0; i < arr[0].length; i++){
            int sum = 0;
            for (int[] row: arr){
                sum += row[i];
            }
            output[i] = sum;
        }
        return output;

    }
}