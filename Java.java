import java.util.Scanner;
public class Java{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		/*String fname = getFname();
		String lname = getLname();
		String mname = getMname();
		sayMyName(fname,lname,mname);*/
		double[] arr = {1,2,3,4,5};
		add(arr);
		multiply(arr);
	}

	static void sayMyName(String fname){
		sayMyName(fname,"","");
	}
	static void sayMyName(String fname, String lname){
		sayMyName(fname,"","");
	}
	static void sayMyName(String fname, String lname, String mname){
		System.out.println("Your name is "+fname+" "+mname+" "+lname);
	}

	static String getFname(){
		System.out.println("What's your First name: ");
		return in.nextLine();
	}
	static String getLname(){
		System.out.println("What's your Last name: ");
		return in.nextLine();
	}
	static String getMname(){
		System.out.println("What's your Middle name: ");
		return in.nextLine();
	}

	static void add(double[] val){
		double sum = 0;
		for (int i = 0; i < val.length; i++ ) {
			sum += val[i];
		}
		System.out.println("Sum: "+ sum);
	}
	static void multiply(double[] val){
		double mult = 1;
		for (int i = 0; i < val.length; i++ ) {
			mult *= val[i];
		}
		System.out.println("Mutiplication: "+ mult);
	}
}