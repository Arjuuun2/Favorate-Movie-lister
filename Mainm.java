import java.io.*;

public class Mainm {

	public static void main(String a[]) {
		
		MyGenericClassX<Integer> myInt =new MyGenericClassX<>(1);
		MyGenericClassX<Double> myDouble =new MyGenericClassX<>(1.4);
		MyGenericClassX<String> myString =new MyGenericClassX<>("hello world");
		
		
		
		//System.out.println(myInt.gValue());
		//System.out.println(myDouble.gValue());
		//System.out.println(myString.gValue());
		myInt.gValue();
		myDouble.gValue();
		myString.gValue();
		
	}
}
