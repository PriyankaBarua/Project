
public class SortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {3,1,4,5,2};
 for (int i = 0; i < ar.length; i++) {
	//int  min=i;
	 for (int j = 0; j<ar.length-1; j++) {
if(ar[j]>ar[j+1])
		 {
		 int temp=ar[j];
		 ar[j]=ar[j+1];
		 ar[j+1]=temp;
		 }
//min=j;
		 
	}
	
}
	for (int j= 0; j< ar.length; j++) {
		 System.out.println(ar[j]);
	}
	}
}
