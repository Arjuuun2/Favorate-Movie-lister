import java.io.*;

public class Student implements Serializable {

	public static void main(String ar[]) throws IOException {
		User user=new User();
		user.name="Arjun vj";
		user.password="encrypted223";
		
		FileOutputStream file=new FileOutputStream("exam.ser");
		ObjectOutputStream obj=new ObjectOutputStream(file);
		obj.writeObject(user);
		obj.close();
		file.close();
		
		System.out.println("file exam is saved");
		
	}
	
	
}
