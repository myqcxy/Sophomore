package First;

import java.io.IOException;

public class First {

	public static void main(String[] args) {
		try {
			Runtime.getRuntime().exec("F:\\qq\\Bin\\QQScLauncher.exe");
			} catch (IOException e) {
			e.printStackTrace();
			}
	}

}
