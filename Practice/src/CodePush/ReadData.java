package CodePush;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class ReadData {
	public void readtxtfile() throws IOException
	{
		File f=new File("../Practice/Read.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		//int a;
		String s;
		//while((a=fr.read())!=-1)
		while((s=br.readLine())!=null)
			
		{
			//System.out.println((char)a);
			System.out.println(s);
		}
			}
public static void main(String[] args) throws IOException {
ReadData r=new ReadData();	
r.readtxtfile();
}
}
