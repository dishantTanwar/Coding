import java.util.Scanner;
import java.util.function.IntPredicate;

class SelectionSort {
    public static int[] selectionSort(int [] input ) {
        for(int i=0; i < input.length; i++) {
            for(int j=i+1; j < input.length; j++) {
                if (input[i] >   input[j]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            } 
        }
        return input;
    }
    public static void print(int[] input) {
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }

    // Better
    // 3 7 4 2 5 3 1 
    public static int[] selectionSortBetter(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            
            int min = input[i];
            int minIdx = i;
            for (int j = i; j < input.length; j++) {
                if (input[j] < min) {
                    min = input[j];
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                input[minIdx] = input[i];
                input[i] = min;
            }
        }
        return input;
    }
    public static void main(String[] args) {
        System.out.println("Hello, this program performs a Selection Sort.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size  = scanner.nextInt();
        int input[] = new int[size];
        
        System.out.println("Enter your array : (" + size + " elements)" );
        // get Array from user
        for(int i=0; i < size; i++) {
            input[i]  = scanner.nextInt();                
        }
        System.out.println("Selection sort normal");
        print(selectionSort(input));
        System.out.println("Selection sort better");
        print(selectionSort(input));

        scanner.close();    
    }   
    
}