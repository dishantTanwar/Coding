import java.util.Scanner;

class BubbleSort {
    // 7 1 5 2 4  3 12
    public static int[] bubbleSort(int[] input) {
        int end = input.length - 1;
        while (end > 0) {
            for (int i = 0; i <= end - 1; i++) {
                if (input[i] > input[i+1]) {
                    int temp = input[i];
                    input[i] = input[i+1];
                    input[i+1] = temp;
                }
            }    
            end--;
        }
        return input;
    } 
    // 7 1 5 2 4  3 12
    public static int[] bubbleSortBetter(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < i - 1; j++) {
                if (input[j] > input[j+1]) {
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
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
    public  static void main(String[] args) {
        System.out.println("Hello, this program performs a Bubble Sort.");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Array Size: ");
        int size  = scanner.nextInt();
        int input[] = new int[size];
        
        System.out.println("Enter your array : (" + size + " elements)" );
        // get Array from user
        for(int i=0; i < size; i++) {
            input[i]  = scanner.nextInt();                
        }
        System.out.println("Bubble sort normal");
        print(bubbleSort(input));
        System.out.println("Bubble sort better");
        print(bubbleSortBetter(input));

        scanner.close();
    }
}