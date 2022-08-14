
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serial implements Serializable {

	public static void main(String ar[]) throws IOException {
		User user=new User();
		user.name="Arjun vj";
		user.password="encrypted223";
		
		FileOutputStream file=new FileOutputStream("System.ser");
		ObjectOutputStream obj=new ObjectOutputStream(file);
		obj.writeObject(user);
		obj.close();
		file.close();
		
		System.out.println("file exam is saved");
		
	}
	
	
}
