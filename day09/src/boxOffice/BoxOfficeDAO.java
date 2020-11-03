package boxOffice;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BoxOfficeDAO {
	DBConnection conn;
	
	// �߰�(��������)
	public void append(int rank,String film_name,String release_date,String income,int audience_cnt,int screen_cnt) throws IOException{
		conn = new DBConnection();
		String datas = "";
		String contents = new String(Files.readAllBytes(Paths.get("boxOffice.txt")));
		
		// �����̱�
		BufferedWriter bw = conn.append();
		datas = contents.charAt(contents.length()-1) == '\n'? "" : "\n";
		datas += contents.split("\n").length+1 + "\t"+ film_name +"\t"+release_date+"\t"+income+"\t"+audience_cnt+"\t"+screen_cnt+"\n";
		
		bw.write(datas);
		bw.close();
	}
	
	// ����(�߰�)
	public void insert(int rank,String film_name,String release_date,String income,int audience_cnt,int screen_cnt) throws IOException{
		String contents = new String(Files.readAllBytes(Paths.get("boxOffice.txt")));
		
		if(rank==contents.split("\n").length+1) {
			append(film_name,release_date,income,audience_cnt,screen_cnt);
			return;
		}
	}
}
