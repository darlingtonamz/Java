import java.util.Scanner;
public class Add{
	public static void main (String []args){
		Scanner in  = new Scanner(System.in);
		int result=0; 

		int i = 1;
		while (i <= 10){
			System.out.print("Enter number "+i+": ");
			result += in.nextInt();
			i++;
		}
		
		System.out.println("Your sum is: "+result);

	}
}