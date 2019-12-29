import java.io.*;
public class CopyText
{
	public static void  main(String args[])throws IOException
	{
		copy1();
	}
  /**
	 * @throws IOException
	 */
	 static void copy1() throws IOException{
		FileReader f1=new FileReader("f:\\myfile1.txt");
		FileWriter f2=new FileWriter("f:\\myfile2.txt");
		int buf;
		while((buf=f1.read())!=-1)
		{
			f2.write(buf);
		}
		f1.close();
		f2.close();
	}
}
