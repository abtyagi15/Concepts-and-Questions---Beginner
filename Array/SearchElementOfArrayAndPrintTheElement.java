import java.util.Scanner;

public class SearchElementOfArrayAndPrintTheElement {
    public static void main(String args[]){
        Scanner scanObj = new Scanner(System.in); 
        System.out.println("Enter the size of the array");
        int sizeOfArray = scanObj.nextInt();
        int myArray [] = new int[sizeOfArray];

        System.out.println("Enter the elements of the array, each element should be unique");
        for(int looper=0;looper<myArray.length;looper++)
        {
            myArray[looper] = scanObj.nextInt();
        }
        
        
        System.out.println("Enter the elements which need to be searched in the array");
        int elementToBeFind = scanObj.nextInt();

        for(int looper=0;looper<myArray.length;looper++)
        {
            if(myArray[looper] == elementToBeFind){
                System.out.println("The asked element is present in the array \n" + "The index of the element is : " + looper);
                break;
            }
            else{
                continue;
            }
        }
        System.out.println("The element is not present in the array");
        
        scanObj.close();
    }
}
