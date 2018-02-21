package bullshit;
import java.util.*;
import java.io.*;

public class FileMan {
	private File f;
	private Scanner fscan;
	private ArrayList<String> rows;
	private String path;
	FileMan(String p){
		try {
			path = p;
			f = new File(path);
			fscan = new Scanner(f); 
			rows = new ArrayList<String>();
			while(fscan.hasNextLine()) {
				rows.add(fscan.nextLine());
			}
			fscan.close();
		}catch(FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
	}
	public ArrayList<String> getFile() {
		return rows;
	}
	public void writeFile(String path, String str){
		try {
			BufferedWriter w = new BufferedWriter(new FileWriter(path));
			w.write(str);
			w.close();
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
	public void appendFile(String path, String str){
		try {
			BufferedWriter w = new BufferedWriter(new FileWriter(path, true));
			w.append("\n" + str);
			w.close();
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
