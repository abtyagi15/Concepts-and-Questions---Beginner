/* In this problem we need to rotate the elements position. Let us suppose there
is an array A which has 10 elements, now we want to shift the position of
each element to left by 1 index and first element should be added in the end
*/
import java.util.Scanner;
public class RotationOfAnArray{
    public static void main(String args[]){
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int sizeOfArray = inputScanner.nextInt();
        int myArray[] = new int[sizeOfArray];

        System.out.print("Enter the array elements : ");
        for(int index=0;index<myArray.length;index++){
            myArray[index]=inputScanner.nextInt();
        }
        int tempVariable = myArray[0];
        for(int index=0;index<myArray.length;index++)
        {
            myArray[index] = (index<myArray.length-1) ? (myArray[index+1]) : (tempVariable) ;
        }
        
        System.out.print("Rotated array is : ");
        for(int newArrayElement : myArray)
        {
            System.out.print(newArrayElement+" ");
        }
        inputScanner.close();
    }
}