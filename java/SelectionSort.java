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
        print(selectionSort(input));
        scanner.close();    
    }   
    
}