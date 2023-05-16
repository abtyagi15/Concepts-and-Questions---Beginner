import java.util.Scanner;

public class IncreasingSizeOfArray {
    public static void main(String args[]) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the initial array size : ");
        int initialArraySize = inputScanner.nextInt();
        int originalArray[] = new int[initialArraySize];

        System.out.print("Enter the elements of the array : ");
        for (int index = 0; index < originalArray.length; index++) {
            originalArray[index] = inputScanner.nextInt();
        }

        System.out.println("Please enter the desired size of the array after increasing it : ");
        int newSizeOfArray = inputScanner.nextInt();

        int newArray [] = new int[newSizeOfArray];

        for (int index = 0; index < originalArray.length; index++){
            newArray[index] = originalArray[index];
        }
        originalArray = newArray;

        System.out.print("Updated array is of length : "+originalArray.length +" and its elements are : ");
        for (int arrayElement : originalArray){
            System.out.print(arrayElement + " ");
        }
        System.out.print("\nHere zero represents that those elements are empty");

        inputScanner.close();
    }
}



