
import java.util.Calendar;
import java.util.Scanner;

public class calendar {
	int a;
	public calendar(int a) {
		super();
		this.a = a;
	}
	static void showThis(){
		Calendar calendar = Calendar.getInstance();
	//	int year = calendar.d
		calendar.set(calendar.get(calendar.YEAR), calendar.get(calendar.MONTH),1);
		int first = calendar.get(calendar.DAY_OF_WEEK) - 1;
	//	System.out.println(calendar.get(calendar.MONTH));
		int days = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
		System.out.println("本月日历为：");
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		for(int i = 0;i < first;i++)
			System.out.print("\t");
		for(int i = 1;i <= days;i++,first++){
			if(first%7==0)
				System.out.print("\n");
			System.out.print(i +"\t");
		}
		System.out.println();
	}
	static void show(int year, int month){
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month-1,1);
		int first = calendar.get(calendar.DAY_OF_WEEK) - 1;
		int days = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		for(int i = 0;i < first;i++)
			System.out.print("\t");
		for(int i = 1;i <= days;i++,first++){
			if(first%7==0)
				System.out.print("\n");
			System.out.print(i +"\t");
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showThis();
		while(true){
			System.out.println("请输入日期的年：");
			Scanner in = new Scanner(System.in);
			int year = in.nextInt();
			System.out.println("请输入日期的月：");
			int month = in.nextInt();
			show(year,month);
			System.out.println("\n");
		}
		
	
	}

}
