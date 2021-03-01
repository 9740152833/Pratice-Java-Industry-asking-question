import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A {
	public static void main(String[] args) throws IOException {
		String i1 = "D:\\J2ee\\progrms\\Compnay\\student.txt";
		String i2 = "D:\\J2ee\\progrms\\Compnay\\student1.txt";
		BufferedReader br = new BufferedReader(new FileReader(i1));
		BufferedReader br1 = new BufferedReader(new FileReader(i2));
		String line1;
		String line2;
		String index1;
		String index2;
		while ((line2 = br1.readLine()) != null) {
			line1 = br.readLine();
			index1 = line1.split(",")[0];
			index2 = line2.split(",")[0];
			// String i3=line2.split(" ")[1];
			// String i4=line2.split(" ")[2];
			System.out.println(index1 + " " + index2/* +" "+i3+" "+i4 */);
		}
	}
}
