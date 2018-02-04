import java.util.Scanner;
class Bullshit{
	private String name;
	private byte age;
	private String number;
	private double[] grades;
	Scanner input;
	Bullshit(){
		input = new Scanner(System.in);
		System.out.println("give the student's name:");
		name = input.next();
		age = 0;
		number = "";
		System.out.println("how many grades does he/she have?");
		 grades= new double[input.nextInt()];
		System.out.println("give " + name + "'s grades:");
		//b.set_grades();
		set_grades();
	}

	Bullshit(String n,int x){
		input = new Scanner(System.in);
		name = n;
		age = 0;
		number = "";
		 grades= new double[x];
	}

	Bullshit(byte n,int x){
		input = new Scanner(System.in);
		name = "";
		age = n;
		number = "";
		 grades= new double[x];
	}

	Bullshit(int n){
		input = new Scanner(System.in);
		name = "";
		age = 0;
		number = "";
		 grades= new double[n];
	}

	Bullshit(String n, String nr, int x){
		input = new Scanner(System.in);
		name = n;
		age = 0;
		number = nr;
		 grades= new double[x];
	}

	Bullshit(String n, byte n1, String n2, int n3){
		input = new Scanner(System.in);
		name = n;
		age = n1;
		number = n2;
		grades = new double[n3];
	}

	public String get_name(){
		return name;
	}

	public String get_number(){
		return number;
	}

	public byte get_age(){
		return age;
	}

	public double[] get_grades(){
		return grades;
	}
	public void set_name(String s){
		name = s;
	}
	public void set_grades(){
		for (int i = 0; i < grades.length; i++)
			 grades[i] = input.nextDouble();
	}

}
