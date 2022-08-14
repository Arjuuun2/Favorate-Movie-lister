import java.io.*;

public class FileCode {

	public static void main(String a[]) throws IOException {
		File file=new File("filee.txt");
		//if(file.exists()) {
			//System.out.println("this file is exits");
		//}
		//file.getAbsolutePath();
		System.out.println(file.getAbsolutePath());
		FileWriter write=new FileWriter("shetty gaya");
	}
	
	//FileWriter write=new FileWriter("shetty gaya");
}
