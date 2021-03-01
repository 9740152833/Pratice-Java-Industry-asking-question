
public class TaxApp {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class c = Class.forName(args[0]);
		System.out.println(c.toString());
		Tax ref=(Tax)c.newInstance();
		System.out.println(ref.toString());
		
	}
	static void calculate(Tax t){
		double ct=1000.00;
		double st=t.stateTax();
		System.out.println("total tax ="+ (ct+st));
	}

}
