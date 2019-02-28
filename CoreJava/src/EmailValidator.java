
public class EmailValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String email= "zubair@mail.com";
		//System.out.println(s1.indexOf('o'));
  //    int n=email.length();
 int i=email.indexOf('@');
// int k=email.lastIndexOf('@');
 int j=email.indexOf('.');
// int m=j-i;
 if((i==email.lastIndexOf('@')) && ((i>=4) && (j>=8)) && ((j-i)>=4) && ((email.length())-(j+1))>=2)
 {
    		 System.out.println("valid");
    		  
 }
 else
 {
	 System.out.println("invalid");
 }
        
	}

}
