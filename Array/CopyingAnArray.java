import java.util.Scanner;
public class CopyingAnArray {
    public static void main(String args[]){
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int sizeOfArray = inputScanner.nextInt();
        int originalArray[]= new int[sizeOfArray];
        int copiedArray[] = new int[originalArray.length];

        System.out.print("Enter the elements of the array : ");
        for(int index=0;index<originalArray.length;index++){
            originalArray[index]=inputScanner.nextInt();
        }
        for(int index=0;index<copiedArray.length;index++){
            copiedArray[index]=originalArray[index];
        }

        System.out.print("The copied array is : ");
        for(int copiedElements : copiedArray){
            System.out.print(copiedElements + " ");
        }

        inputScanner.close();
    }
    
}
