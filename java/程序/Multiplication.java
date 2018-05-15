public class Multiplication{
	public static void main(String []args){
		
		for(int i = 1;i < 10;i++){
			for(int j = 1;j <= i;j++){
				if((i*j)%12==0){
					continue;
				}
				else if((i*j)%28==0){
					
					System.out.println(j+"*"+i+"="+i*j+"  ");
				}
				else{
					System.out.print(j+"*"+i+"="+i*j+"  ");
				}
			}
			System.out.println();
				
		}
				
		
	}
}