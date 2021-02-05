package CSV;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

	public static void main(String[] args) throws IOException{
		
		File csvFile = new File("C:\\Users\\Gjonaj\\Desktop\\Test222.csv");
		BufferedReader br = new BufferedReader(new FileReader(csvFile));
		String line = "";
		try {
			while((line = br.readLine()) != null) {
				String[] count = line.split(",");
				System.out.println(count[0]+" "+count[1]+" "+count[2]+" "+count[3]);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
