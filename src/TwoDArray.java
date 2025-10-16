import java.util.Scanner;

    public class TwoDArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int rows = 2, cols = 3;
            int[][] arr = new int[rows][cols];

//            System.out.println("Enter elements:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("2D Array:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
















