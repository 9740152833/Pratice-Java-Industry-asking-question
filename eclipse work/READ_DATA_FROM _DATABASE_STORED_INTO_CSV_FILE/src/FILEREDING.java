import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FILEREDING extends READFILE {
	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter(new File("F:\\J2ee\\progrms\\READ_DATA_FROM _DATABASE_STORED_INTO_CSV_FILE\\student.csv"));
			READFILE rd = new READFILE();
			pw.write(rd.toString());
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
