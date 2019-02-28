
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {10,20,30,40,50};
	
		for(int i=0;i<ar.length;i++)
		{
		System.out.println("values: " +ar[i]);
		}
		for (int e : ar) {
			System.out.println(e);
			
		}
		int[][] jaggu = {{1,2},{3,4,5},{6,7,8,9}};
		for (int j = 0; j < jaggu.length; j++) {
			for (int k = 0; k < jaggu[j].length; k++) {
				System.out.print(jaggu[j][k] +"\t"
						 );
				
			}
			 System.out.println();
			
		}
	}

}
