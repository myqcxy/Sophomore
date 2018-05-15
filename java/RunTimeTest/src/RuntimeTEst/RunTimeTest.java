package RuntimeTEst;

public abstract class RunTimeTest {
	abstract void run();

	public void test(int n) {
		long startTime = System.nanoTime();
		for (int i = 0; i < n; i++)
			run();
		long endTime = System.nanoTime();
		System.out.println("����ʱ��Ϊ��" + 1.0 * (endTime - startTime) / n);
	}

}
