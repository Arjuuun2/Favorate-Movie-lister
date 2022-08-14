import java.io.*;
import java.util.*;

public class Main {

	public static void main(String a[]) {
		
		MyGenericClass<Integer> myInt=new MyGenericClass(1);
		MyGenericClass<Double> myDouble=new MyGenericClass(3.14);
		MyGenericClass<String> myString=new MyGenericClass("hello world");
		
		System.out.println(myInt.getValue());
		System.out.println(myDouble.getValue());
		System.out.println(myString.getValue());
		
		
		
	}
}