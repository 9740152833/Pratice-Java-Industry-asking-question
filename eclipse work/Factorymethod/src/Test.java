import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the the which type light ");
		String s=sc.next();
		Iswich s1=LightFactory.getlight(s);
		if(s1!=null){
			s1.sOn();
			s1.sOff();
		}

	}

}
