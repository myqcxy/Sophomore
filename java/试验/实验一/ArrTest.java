public class ArrTest{
	static double sum(double []arr){
		double sum = 0.0;
		for(double i:arr)
			sum+=i;
		return sum;		
	}
	static double average(double []arr){
		double sum = 0.0;
		sum = sum(arr);
		return sum / arr.length;
	}
	public static void main(String []args){
		double []arr = {1,2,3,5,8};
		System.out.println("����ĺ���" + sum(arr)+";�����ƽ��ֵ��" + average(arr));
		
	}
}