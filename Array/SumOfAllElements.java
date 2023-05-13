import java.util.Scanner;

public class SumOfAllElements{
    public static void main(String args[]){
        Scanner scanObj = new Scanner(System.in);
        int sizeOfArray = scanObj.nextInt();
        int wholeArray [] = new int[sizeOfArray];

        //input of array elements
        for(int looper=0;looper<wholeArray.length;looper++){
            wholeArray[looper] = scanObj.nextInt();
        }
       

        int sumOfAllElements = 0;
        //sum of elements code
        for(int looper=0;looper<wholeArray.length;looper++){
            sumOfAllElements = wholeArray[looper] + sumOfAllElements;
            
        }

        System.out.println(sumOfAllElements);

        scanObj.close();
    }
}