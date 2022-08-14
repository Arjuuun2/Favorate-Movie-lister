import java.io.*;
import java.util.*;
public class GenericsPractize {

	public static void main(String a[]) {
		
		Integer[] intArray= {1,2,3,4,5};
		Double doubleArray[]= {1.2,2.4,3.5};
		String stringArray[]= {"f","u","g","e"};
		Character charArray[]= {'a','r','j','u'};
		
		
		
		//getsArray(doubleArray);
		getsArray(stringArray);
		//getsArray(charArray);
		
		
	}
	
	public static  void  getsArray(String array[] ){
		for(String x:array) {
			System.out.println(x);
		}
		System.out.println();
	}
	
	
	
}
