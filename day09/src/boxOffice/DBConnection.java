package boxOffice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DBConnection {
	// (1)writer
	private final String FILE = "boxOffice.txt";
	public BufferedWriter insert() throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter(FILE));
		return bw;
	}
	
	public BufferedWriter append() throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter(FILE));
		return bw;
	}
	// (2) reader
	/**
	 * 
	 * @return
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public BufferedReader get() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(FILE));
		return br;
	}
	
}
