import java.util.Scanner;

public class MaximumElementInArray {
    public static void main(String args[]) {
        Scanner scanObj = new Scanner(System.in);
        int sizeOfArray = scanObj.nextInt();
        int myArray [] = new int[sizeOfArray];
        int maximumElement = 0 ;
        for(int index=0;index<myArray.length;index++)
        {
            myArray[index] = scanObj.nextInt();
            maximumElement = (myArray[index]>=maximumElement) ? myArray[index] : maximumElement;
        }
        System.out.println(maximumElement);
        
        
        
        scanObj.close();
    }

}
