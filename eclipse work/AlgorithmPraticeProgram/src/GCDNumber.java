
public class GCDNumber {
	public int gcd(int m,int n) {
		
		int r;
		
		while(n!=0) {
			r=m%n;
			m=n;
			n=r;
		}
		return m;
	}

	public static void main(String[] args) {
		
		GCDNumber g = new GCDNumber();
		int result=g.gcd(10, 30);
		System.out.println(result);
		

	}

}
