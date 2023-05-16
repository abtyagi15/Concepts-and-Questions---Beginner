import java.util.Scanner;
public class DeletingAnElementInArray {
    public static void main(String args[]){
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int sizeOfArray = inputScanner.nextInt();
        Integer[] fullArray = new Integer[sizeOfArray];

        System.out.print("Enter the elements of an array : ");
        for(int index=0;index<fullArray.length;index++){
            fullArray[index] = inputScanner.nextInt();
        }
        
        System.out.print("Enter the element value which need to be removed from the array : ");
        int removingElementValue = inputScanner.nextInt();

        for(int index=0;index<fullArray.length-1;index++){
            if(fullArray[index]==removingElementValue){
                fullArray[index]=fullArray[index+1];
            }
            else{
                continue;
            }
        }
        fullArray[fullArray.length-1] = null;

        System.out.print("Updated array is : ");
        for(int index=0;index<fullArray.length;index++){
            if(fullArray[index]!=null){
                System.out.print(fullArray[index]+" ");
            }
            else{
                break;
            }
        }


        inputScanner.close();
    }
}
