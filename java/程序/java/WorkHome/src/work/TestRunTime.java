package work;

public class TestRunTime extends abstractTest {

	@Override
	void run() {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1; i < 1000;i++)
			sum += i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestRunTime trt = new TestRunTime();
		trt.test();
	}

}
