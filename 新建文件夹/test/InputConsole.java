

import java.io.Console;

public class InputConsole {

	public static void main(String[] args) {
		Console a = System.console();
		if(a==null){
			System.out.println("not found");
			System.exit(0);
		}
			
		String line = null;
		while((line = a.readLine()) != null){
			if(line.equalsIgnoreCase("exit")) break;
			System.out.printf(">>>%-10s%n", line);
		}
			
	}

}
