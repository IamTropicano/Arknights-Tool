import java.util.regex.*;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
public class main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		String line = "Blemishine,6,Defender,Guardian,2,90";
		
		
		FileInputStream file = new FileInputStream("OPERATORS_LIST.txt");   
	    Scanner scanner = new Scanner(file); 
	    ArrayList<Operator> squad = new ArrayList<Operator>();
	    while(scanner.hasNextLine())
	    { squad.add(readLine(scanner.nextLine())); }
	    scanner.close(); 
	    System.out.println(squad.get(0));
	    
	}
	public static Operator readLine(String line) {
		String name="", type ="", subType = "";
		int rarity =0, elite=0, lvl=0;
		Pattern pattern = Pattern.compile("\\b\\w+\\b");
		Matcher matcher = pattern.matcher(line);
		if(matcher.find())
			name = matcher.group();
		if(matcher.find())
			rarity = Integer.parseInt(matcher.group());
		if(matcher.find())
			type = matcher.group();
		if(matcher.find())
			subType = matcher.group();
		if(matcher.find())
			elite = Integer.parseInt(matcher.group());
		if(matcher.find())
			lvl = Integer.parseInt(matcher.group());
		return new Operator(name,rarity,type,subType,elite,lvl);
	}
}
