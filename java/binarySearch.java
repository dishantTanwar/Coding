import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;
import javax.swing.plaf.synth.SynthStyle;

class binarySeach {
    public static int performSearch(int[] input, int num){
        int start = 0;
        int end = input.length - 1;
        int mid = (int) ((end + start) / 2) ;

        while (true) {        
            // end of loop
            if (end == start) {
                // number found
                if(input[start] == num) {
                    return start;
                }
                // not found
                else {
                    return -1;
                }
            }
            if (num < input[mid]) {
                // look in left side of array
                end = mid - 1;
                mid = (int) ((end + start) / 2);            
            } else if (num > input[mid]) {
                // look in right side of array
                start = mid + 1;
                mid = (int) ((end + start) / 2);
            }  
            if(num == input[mid]) {
                // number found
               return  mid;
            }
        }

    }
    public static int binarySeachBetter(int[] input, int num) {
        int start = 0;
        int end = input.length;
        while(start <= end) {
            int mid = (int) ((start + end) / 2);
            if (num > input[mid]) {
                start = mid + 1;
                mid = (int) ((start + end) / 2);
            } else if (num < input[mid]) {
                end = mid - 1;
                mid = (int) ((start + end) / 2);
            } else if (num == input[mid]) {
                return mid;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Hello, this program performs a Binary Search.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size  = scanner.nextInt();
        int input[] = new int[size];
        
        System.out.println("Enter your array : (" + size + " elements)" );
        // get Array from user
        for(int i=0; i < size; i++) {
            input[i]  = scanner.nextInt();                
        }
        // get number to search
        System.out.println("Enter number to find:");
        int num = scanner.nextInt();

        int result = performSearch(input, num);
        int resultBetter = binarySeachBetter(input, num);
        scanner.close();
        if(result == -1 || resultBetter == -1) {
            System.out.println("Number not found");
        } else {
            System.out.println("You num found in index: (simple) " + result);
            System.out.println("You num found in index: (better) " + resultBetter);
        }
        scanner.close();
    }   

}