import java.util.function.Function;
import java.util.Scanner;
class playground {
    public static void reverseRead() {
        String str = "A B C D E F G";
        int end = str.length();
        for (int i = str.length() - 1; i >= 0; i--) {

            if(str.charAt(i) == ' ') {
                System.out.print(str.substring(i+1, end) + " ");
                end = i;
            }
            if (i == 0) {
                System.out.println(str.substring(i, end));
            }
        }
    }
    public static int[][] sumMatrixRows() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of rows");
        int rows = sc.nextInt();

        System.out.println("Enter no. of columns");
        int cols = sc.nextInt();

       int[][] mat = new int[rows][cols];
       
       // add row
       //  0 1 2 3
       //  4 5 6 7
       for (int i = 0; i < rows; i++) {
        System.out.println("Enter row " + i); 
        for (int j = 0; j < cols; j++) {
            mat[i][j] = sc.nextInt();
        }
    }
       for (int i = 0; i < rows; i++) {
           int rowSum = 0;
           for (int j = 0; j < cols; j++) {
               rowSum += mat[i][j];
           }
           System.out.println("Sum of row " + (i+1) + " : " + rowSum);


       }

       sc.close();
       return mat;

    }
    public static void spiralPrint() {
        int[][] mat = {{1, 2, 3, 4},
                       {14, 15, 16, 5},
                       {13, 20, 17, 6},
                       {12, 19, 18, 7},
                       {11, 10, 9, 8}};
        int rowStart = 0;
        int rowEnd = mat.length - 1;

        int colStart = 0;
        int colEnd = mat[0].length - 1;                       
     
        while ((rowEnd - rowStart) > 0 && (colEnd - colStart) >0) {
            
            // left to right
            for (int j = 0; j <= colEnd; j++) {
                System.out.print(mat[rowStart][j] + " ");
            }
            rowStart++;
            // top to bottom
            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.print(mat[i][colEnd] + " ");
            }
            colEnd--;
            // right to left
            for (int k = colEnd; k >= colStart; k--) {
                System.out.print(mat[rowEnd][k] + " ");
            }
            rowEnd--;
            // bottom to up
            for (int l = rowEnd; l >= rowStart; l--) {
                System.out.print(mat[l][colStart] + " ");
            }
            colStart++;
        }

                             
    }

    public static void main(String[] args) {
    //   reverseRead();
    spiralPrint();


    }   
}