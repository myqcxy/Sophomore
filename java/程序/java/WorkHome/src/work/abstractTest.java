package work;

public abstract class abstractTest {
	abstract void run();
	public void test(){
		long startTime = System.nanoTime();
		for(int i = 0;i < 1e5;i++)
		run();
		long endTime = System.nanoTime();
		System.out.println("运行时间为：" + (endTime - startTime) + "ns");
	}
}
