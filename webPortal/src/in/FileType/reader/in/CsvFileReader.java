package in.FileType.reader.in;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import in.webportal.Model.in.CsvModel;

public class CsvFileReader {
	public static void readCsv(String filePath) throws IOException {
		List<CsvModel> model=new ArrayList<CsvModel>();
		CsvFileReader csv=new CsvFileReader();
		String[] record=null;
		while (true) {
			CsvModel emp = new CsvModel();
			emp.setEmpId(record[0]);
			emp.setName(record[1]);
			model.add(emp);
			System.out.println("Hello welcome ");
			
		}

		
	}
}
