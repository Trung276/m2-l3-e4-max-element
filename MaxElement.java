import java.util.Scanner;
public class MaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu ma tran: ");
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Nhap vao phan tu");
                matrix[i][j] = scanner.nextInt();
            }
        }
        int max = 0;
        int x = 0;
        int y = 0;
        System.out.println("Ma tran cua ban:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                    x = i;
                    y = j;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("Gia tri cua phan tu lon nhat la: " + max + "(" + x + ", " + y + ")");

    }
}
