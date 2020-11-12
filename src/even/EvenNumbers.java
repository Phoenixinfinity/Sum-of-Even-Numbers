package even;
import java.util.Scanner;
public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sum of 10 Even Numbers	
		int a,i,Sum=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any Number :");
		a = obj.nextInt();
		i=1;
		do
		{
			if (i%2==0)
			{
				Sum = Sum+i;
			}
			i++;
		}
		while (i<=a);
		System.out.println("\n The Sum of Even Numbers Upto "+a+" = "+Sum);
			
			
		

	}

}
