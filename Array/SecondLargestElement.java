import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String args[]){
        Scanner inputScanner = new Scanner(System.in);
        int sizeOfArray = inputScanner.nextInt();
        int numbersArray[] = new int[sizeOfArray];
        for(int index=0;index<numbersArray.length;index++)
        {
            numbersArray[index] = inputScanner.nextInt();
        }
        int maximumElement = 0;
        int secondMaxElement = 0;
        for(int index=0;index<numbersArray.length;index++){
            if(numbersArray[index]>=maximumElement)
            {
                secondMaxElement = (maximumElement>secondMaxElement) ? maximumElement : secondMaxElement;
                maximumElement = numbersArray[index];
            }
            else{
                secondMaxElement = (secondMaxElement<numbersArray[index]) ? numbersArray[index] : secondMaxElement ;
            }
        }
        System.out.println("The second largest number is : " + secondMaxElement);

        inputScanner.close();
    }
}
