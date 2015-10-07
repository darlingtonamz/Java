import java.util.Scanner;
public class MyJavaa{
	public static Scanner in = new Scanner(System.in);
	
	public static void add(int first, int second){
		System.out.println("Addition Result: " + (first + second));
	}
	public static void multiply(int first, int second){
		System.out.println("Multiplication Result: " + (first * second));
	}
	public static void divide(int first, int second){
		System.out.println("Division Result: " + (first / second));
	}
	public static void subtract(int first, int second){
		System.out.println("Subraction Result: " + (first - second));
	}
	public static void main (String[] args){
		System.out.print("First number? ");
		int a = in.nextInt();
		System.out.print("Second number? ");
		int b = in.nextInt();

		System.out.print("What to do? \n '1' - Add\n'2' - Subtract\n'3' - Multiply\n'4' - Divide\nSelect one? ");
		int resp = in.nextInt();
		if (resp == 1) {
			add(a,b);			
		}else if (resp == 2) {
			subtract(a,b);
		}else if(resp == 3){
			multiply(a,b);
		}else if(resp == 4){
			divide(a,b);
		}else{
			System.out.println("Wrong input!");
		}
	}
}