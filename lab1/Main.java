package bullshit;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		ArrayList<Calculator> retea = new ArrayList<Calculator>();
		retea.add(new Calculator());
		retea.add(new Calculator("Dan Baltag".toCharArray()));
		byte b = 2;
		retea.add(new Calculator(b));
		System.out.println();
		for(Calculator i:retea)
			i.printCalc();
		System.out.println();
		retea.get(0).compare(retea.get(1));
		System.out.println();
		Calculator.compareMasa(retea.get(1), retea.get(2));
		System.out.println();
		double max = retea.get(0).getPretTot();
		int p = 0;
		for (int i = 1; i < retea.size();i++)
			if(retea.get(i).getPretTot() > max) {
				max = retea.get(i).getPretTot();
				p = i;
			}
		System.out.println();
		String name = "";
		for(char c:retea.get(p).getProp())
			name += c;
		System.out.println(name + " detine cel mai costisitor calculator");
		System.out.println("S-au asamblat " + Calculator.getNrCalc() + " calculatoare");
	}

}
