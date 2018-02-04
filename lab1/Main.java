import java.util.Scanner;
public class Main{
	public static double getMed(double[] n){
		double med = 0;
		for(int i = 0; i<n.length; i++)
			med += n[i];
		return med/n.length;
	}

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("how many students do you have?");
		int s = input.nextInt();
		Bullshit[] shit;
		if(s > 0){
			shit = new Bullshit[s];
			for (int i = 0; i < shit.length; i++)
				shit[i] = new Bullshit();
		}
		else {
			shit = new Bullshit[1];
			shit[0] = new Bullshit();
		}
		System.out.println("Student & AvrGrade:");
			double medg = 0;
		for(int i = 0; i < shit.length; i++){
			System.out.println(shit[i].get_name() + " & " + getMed(shit[i].get_grades()));
			medg += getMed(shit[i].get_grades());
		}
		medg /= shit.length;
		System.out.println("GenAvg = " + medg);
	}
}
