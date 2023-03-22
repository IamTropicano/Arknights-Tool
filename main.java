import java.util.regex.*;
import java.io.*;
import java.util.Scanner;
public class main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		String line = "Blemishine,6,Defender,Guardian,2,90";
		
		
		FileInputStream file = new FileInputStream("OPERATORS_LIST.txt");   
	      Scanner scanner = new Scanner(file);  
	      Operator[] squad = new Operator[10];
	      int i = squad.length;
	      while(scanner.hasNextLine())
	      {
	    	  squad[squad.length-i] = readLine(scanner.nextLine());
	    	  i-=1;
	      }
	      scanner.close();   	
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
