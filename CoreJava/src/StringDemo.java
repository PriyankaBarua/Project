
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Hello";
		String s2= new String("Hello");
		String s3="Hello";
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		s1=s1+"world";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('o'));
		System.out.println(s1.charAt(5));
		
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3,7));
		
		System.out.println(s1.concat("of java"));
		System.out.println(s1.replace('o','a'));
		
		System.out.println(s1);
	}

}
