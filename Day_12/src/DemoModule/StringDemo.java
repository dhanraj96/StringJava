package DemoModule;

public class StringDemo {

	public static void main(String[] args) {
		
				//1st string
				String s = "Hello";
				System.out.println("print 1st string: "+s);
				System.out.println("length of 1st string: "+s.length());
				
				//2nd string
				String s1 = new String("World");
				System.out.println("print 2nd string: "+s1);
				s.concat(s1);
				
				
				
				System.out.println("concat 1st and 2nd string: "+s1);
				
				//Join two string
				String s2 = s.concat(s1);
				System.out.println("concat 1st and 2nd string: "+s2);
				
				//3rd string
				String s3 = "Hello";
				System.out.println("print 1st string: "+s3);
				
				//4th string
				String s4 = "HELLO";
				System.out.println("print 1st string: "+s4);
				
				
				
				
				
				

	}

}
