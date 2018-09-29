
import java.util.Scanner;

/*inputs three integers from the user and displays the sum, average, product, smallest
and largest of the numbers.*/
public class CompareThree {

	public static void main(String[] args) {
		int firstNumber =0;
		int secondNumber=0;
		int thirdNumber=0;
		int sum=0;
		double average=0.0;
		int product = 0;
		int largest=0;
		int smallest=0;
		System.out.println("Enter a number: ");
		Scanner inputScanner = new Scanner(System.in);
		firstNumber = inputScanner.nextInt();
		System.out.println("Enter another number: ");
		secondNumber = inputScanner.nextInt();
		System.out.println("Enter a third number: ");
		thirdNumber = inputScanner.nextInt();
		inputScanner.close();
		sum = firstNumber + secondNumber + thirdNumber;
		average = sum / 3 ;
		product = firstNumber * secondNumber * thirdNumber;
		
		if(firstNumber > secondNumber && firstNumber > thirdNumber)
		{
			largest = firstNumber;
			if(secondNumber > thirdNumber) 
			{				
				smallest = thirdNumber;
				System.out.print(largest + "is largest. " + smallest + " is smallest." );
			}
			else
			{
				smallest = secondNumber;
				System.out.print(largest + "is largest. " + smallest + " is smallest." );
			}
			
		}
		else if(secondNumber > firstNumber && secondNumber > thirdNumber)
		{
			largest = secondNumber;
			if(firstNumber> thirdNumber)
			{
				smallest = thirdNumber;
				System.out.print(largest + "is largest. " + smallest + " is smallest.");
			}
			else
			{
				smallest = firstNumber;
				System.out.print(largest + "is largest. " + smallest + " is smallest.");
			}

		}
		else if(thirdNumber > firstNumber && thirdNumber > secondNumber)
		{
			largest = thirdNumber;
			if(firstNumber > secondNumber) 
			{
				smallest = secondNumber;
				System.out.print(largest + "is largest. " + smallest + " is smallest.");
			}
			else	
			{
				smallest = firstNumber;
				System.out.print(largest + "is largest. " + smallest + " is smallest.");
			}
		}
		else
		{
			System.out.print(" All three numbers are equal.");
		}
		System.out.print(firstNumber + "," + secondNumber + " and " + thirdNumber + " Added: " + sum + " Multiplied: " + product + " Average: " + average);
	}

}
