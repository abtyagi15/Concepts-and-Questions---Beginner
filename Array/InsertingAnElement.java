import java.util.Scanner;
public class InsertingAnElement {
    public static void main(String args[]){
        Scanner inputScanner = new Scanner(System.in);
        Integer[] fullArray = new Integer[10];
        fullArray[0]=5;
        fullArray[1]=9;
        fullArray[2]=6;
        fullArray[3]=12;
        fullArray[4]=7;
        fullArray[5]=10;

        System.out.println("Enter the value of the element and the index you want to add it in (index should be less than 6)");
        int newElementValue=inputScanner.nextInt();
        int newElementIndex=inputScanner.nextInt();

        for(int index=0;index<fullArray.length;index++){
            if(fullArray[index]==null){
                for(int newIndex=index;newIndex>newElementIndex;newIndex--){
                    fullArray[newIndex]=fullArray[newIndex-1];
                }
                fullArray[newElementIndex]=newElementValue;
                break;
            }
            else{
                continue;
            }
        }
        System.out.println("Updated array is : ");
        for(int index=0;index<fullArray.length;index++){
            if(fullArray[index] != null)
            System.out.print(fullArray[index] + " ");

            else
            break;
        }


        inputScanner.close();
        
        

    }
}
