
public class PrimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0;
int num=0;
String primenumber= "";
 for (i = 1; i <=100; i++) {
	 int counter=0;
	 for (num = i; num>=1;num--) {
		 if(i%num==0)
		 {
			 counter=counter+1;
		 }
	 }
		 if(counter==2)
		 {
			 primenumber= primenumber+i+ " ";
			 
		 }
		 
}
 System.out.println("prime numbers: ");
 System.out.println(primenumber);

	}

}
