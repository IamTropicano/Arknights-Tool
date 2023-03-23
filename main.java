import java.util.regex.*;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;
import java.util.Scanner;
public class main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("OPERATORS_LIST.txt");   
	    Scanner scanner = new Scanner(file); 
	    ArrayList<Operator> squad = new ArrayList<Operator>();
	    while(scanner.hasNextLine()) { 
	    	squad.add(readLine(scanner.nextLine()));
	    }
	    scanner.close(); 
	    Random random = new Random();
	    int nb;
	    nb = random.nextInt(squad.size());
	    System.out.println(squad.get(nb));
	}
	public static Operator readLine(String line) {
        Pattern pattern = Pattern.compile("([\\w' | \\w- ]+),(\\d),(\\w+),([\\w- ]+),(\\d+),(\\d+)");
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            for (int i = 0; i <= matcher.groupCount(); i++) {
                matcher.group(i);
            }
        }
		return new Operator(matcher.group(1),Integer.parseInt(matcher.group(2)),matcher.group(3),matcher.group(4),Integer.parseInt(matcher.group(5)),Integer.parseInt(matcher.group(6)));
	}
}