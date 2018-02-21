package bullshit;
import java.util.*;

public class Calculator {

	private char[] numProp;
	private byte nrDet;
	private String numProd;
	private ArrayList<Float> masa;
	private ArrayList<Short> an;
	private ArrayList<Double> pret;
	private static int nrCalc;
	private Integer id ;
	private static String path;
	private String npath;

	Scanner inp;

	Calculator(){
		inp = new Scanner(System.in);
		System.out.println("numele proprietarului:");
		numProp = inp.next().toCharArray();
		System.out.println("nr Detalii:");
		nrDet = inp.nextByte();
		System.out.println("numele producatorului");
		numProd = inp.next();
		System.out.println("masa calculatorului");
		masa = new ArrayList<Float>(nrDet);
		for(int i=0;i<nrDet;i++) {
			System.out.print("masa compononet>");
			masa.add(inp.nextFloat());
		}
		an = new ArrayList<Short>(nrDet);
		System.out.println("anul de productie");
		for(int i=0;i<nrDet;i++) {
			System.out.print("an prouctie compononet>");
			an.add(inp.nextShort());
		}
		pret = new ArrayList<Double>(nrDet);
		System.out.println("pretul calculatorului");
		for(int i=0;i<nrDet;i++) {
			System.out.print("pret compononet>");
			pret.add(inp.nextDouble());
		}
		id = nrCalc;
		nrCalc++;
	}
	
	Calculator(char[] n){
		inp = new Scanner(System.in);
		numProp = n;
		System.out.println("nr Detalii:");
		nrDet = inp.nextByte();
		System.out.println("numele producatorului");
		numProd = inp.next();
		System.out.println("masa calculatorului");
		masa = new ArrayList<Float>(nrDet);
		for(int i=0;i<nrDet;i++) {
			System.out.print("masa compononet>");
			masa.add(inp.nextFloat());
		}
		an = new ArrayList<Short>(nrDet);
		System.out.println("anul de productie");
		for(int i=0;i<nrDet;i++) {
			System.out.print("an prouctie compononet>");
			an.add(inp.nextShort());
		}
		pret = new ArrayList<Double>(nrDet);
		System.out.println("pretul calculatorului");
		for(int i=0;i<nrDet;i++) {
			System.out.print("pret compononet>");
			pret.add(inp.nextDouble());
		}
		id = nrCalc;
		nrCalc++;
	}

	Calculator(byte p){
		inp = new Scanner(System.in);
		System.out.println("numele proprietarului:");
		numProp = inp.next().toCharArray();
		nrDet = p;
		System.out.println("numele producatorului");
		numProd = inp.next();
		System.out.println("masa calculatorului");
		masa = new ArrayList<Float>(nrDet);
		for(int i=0;i<nrDet;i++) {
			System.out.print("masa compononet>");
			masa.add(inp.nextFloat());
		}
		an = new ArrayList<Short>(nrDet);
		System.out.println("anul de productie");
		for(int i=0;i<nrDet;i++) {
			System.out.print("an prouctie compononet>");
			an.add(inp.nextShort());
		}
		pret = new ArrayList<Double>(nrDet);
		System.out.println("pretul calculatorului");
		for(int i=0;i<nrDet;i++) {
			System.out.print("pret compononet>");
			pret.add(inp.nextDouble());
		}
		id = nrCalc;
		nrCalc++;
	}

	Calculator(String p){
		path = p;
		npath = getNPath();
		numProp = this.readFile().toCharArray();
		nrDet = Byte.parseByte(this.readFile());
		numProd = this.readFile();
		masa = new ArrayList<Float>(nrDet);
		for(int i=0;i<nrDet;i++) {
			masa.add(Float.parseFloat(this.readFile()));
		}
		an = new ArrayList<Short>(nrDet);
		for(int i=0;i<nrDet;i++) {
			an.add(Short.parseShort(this.readFile()));
		}
		pret = new ArrayList<Double>(nrDet);
		for(int i=0;i<nrDet;i++) {
			pret.add(Double.parseDouble(this.readFile()));
		}
		id = nrCalc;
		nrCalc++;
	}
	
	Calculator(Calculator ob){
		this.setProp(ob.getProp().toString());
		this.setProducator(ob.getProducator());
		this.setAn(getAn());
		this.setMasa(getMasa());
		this.setNrDet(getNrDet());
		this.setPret(getPret());
	}
	
	private String getNPath() {
		String n = "";
		char[] ar = path.toCharArray();
		for(int i = 0; i <= path.lastIndexOf("/"); i++)
			n += ar[i];
		return n;
	}

	public void setProp(String n) {
		numProp = n.toCharArray();
	}

	public char[] getProp() {
		return numProp;
	}
	
	public void setNrDet(byte x) {
		if(x < 0){
			System.err.println("bad input, you have another chance");
		      	nrDet = inp.nextByte();
			this.setNrDet(nrDet);
		}
		nrDet = x;
		if(x > masa.size()){
			int dim = x - masa.size();	
			while(dim-- > 0){
				System.out.print("masa compononet>");
				masa.add(inp.nextFloat());
			}
		}
		if (x < masa.size()){
			int dim = masa.size() - x;
			ArrayList<Float> aux = new ArrayList<Float>();
			for(int i = 0; i < dim; i++)
				aux.add(masa.get(i);
			this.setMasa(aux);
		}

		if(x > an.size()){
			int dim = x - an.size();	
			while(dim-- > 0){
				System.out.print("an compononet>");
				an.add(inp.nextShort());
			}
		}
		if (x < an.size()){
			int dim =an.size() - x;
			ArrayList<Short> aux = new ArrayList<Short>();
			for(int i = 0; i < dim; i++)
				aux.add(an.get(i);
			this.setAn(aux);
		}
		if(x > pret.size()){
			int dim = x - an.size();	
			while(dim-- > 0){
				System.out.print("pret compononet>");
				pret.add(inp.nextDouble());
			}
		}
		if (x < pret.size()){
			int dim = pret.size() - x;
			ArrayList<Double> aux = new ArrayList<Double>();
			for(int i = 0; i < dim; i++)
				aux.add(pret.get(i);
			this.setPret(aux);
		}
	}
	
	public byte getNrDet() {
		return nrDet;
	}
	
	public void setProducator(String s) {
		numProd = s;
	}
	
	public String getProducator() {
		return numProd;
	}
	
	public void setMasa(ArrayList<Float> f) {
		if (f.size()< masa.size())
			return;
			masa = f;
	}
	
	public ArrayList<Float> getMasa() {
		return masa;
	}
	
	public void setAn(ArrayList<Short> f) {
		if (f.size()< an.size())
			return;
			an = f;
	}
	
	public ArrayList<Short> getAn() {
		return an;
	}
	
	public void setPret(ArrayList<Double> f) {
		if (f.size()< pret.size())
			return;
			pret = f;
	}
	
	public ArrayList<Double> getPret() {
		return pret;
	}

	public double getPretTot() {
		double sum = 0;
		for(Double i:pret)
			sum += i;
		return sum;
	}

	public void printCalc() {
		for(char i:numProp)
			System.out.print(i);
		System.out.println();
		System.out.println("nr detalii:" + nrDet);
		System.out.println("nume producator:" + numProd);
		System.out.println("masa:" + masa);
		System.out.println("anul de productie:" + an);
		System.out.println("pret:" + pret);
	}

	public double getMasaTotal() {
		double s = 0;
		for(float i:masa)
			s += i;
		return s;
	}
	
	public double getMedAn() {
		double s = 0;
		for(Double i:pret)
			s += i;
		return s/nrDet;
	}

	public static int getNrCalc() {
		return nrCalc;
	}
	
	public void compare(Calculator obj){
		if (this.getNrDet() > obj.getNrDet()){
			obj.printCalc();
			obj.setNrDet(this.getNrDet());
			obj.setProducator(this.getProducator());
		}
		if (this.getNrDet() < obj.getNrDet()) {
			this.printCalc();
			this.setNrDet(obj.getNrDet());
			this.setProducator(obj.getProducator());
		}
		if (this.getMedAn() > obj.getMedAn()) {
			this.printCalc();
			this.setAn(obj.getAn());
			this.setProducator(obj.getProducator());
		}
		if (this.getMedAn() < obj.getMedAn()) {
			obj.printCalc();
			obj.setAn(this.getAn());
			obj.setProducator(this.getProducator());
		}
		System.out.println("--------------------");
		this.printCalc();
	}

	public static void compareMasa(Calculator obj1, Calculator obj2) {
		double diff = obj1.getMasaTotal() - obj2.getMasaTotal();
		if (diff > 0)
			System.out.println("primul calculator are masa mai mare decat al doilea cu "+diff+" unitati");
		if (diff < 0)
			System.out.println("al doilea calculator are masa mai mare decat primul cu "+diff+" unitati");
		if (diff == 0)
			System.out.println("ambele calculatoare au aceeasi masa " + obj1.getMasaTotal());
	}
	
	public Integer getId() {
		return id;
	}

	public void writeFile() {
		FileMan f = new FileMan(path);
		try {
		ArrayList<String> rows = f.getFile();
		for(String i:rows) {
			System.out.println(i);
		}
		f.writeFile(npath + "F" + this.getId(), rows.get(0));
		for(int i = 1; i < rows.size(); i++)
			f.appendFile(npath + "res", rows.get(i));
		}catch(NullPointerException e) {
			System.err.println(e.getMessage());
		}
	}
	
	private static int pos;
	public String readFile() {
		String res = "";
		try {
			FileMan f = new FileMan(path);
			ArrayList<String> rows = f.getFile();
				return rows.get(pos++);
		}catch(Exception e) {
			System.err.println(e.getMessage());
			return res;
		} 
	}
}
