import java.io.*;
public class MyGenericClassX <T>{

	T x;
	
	MyGenericClassX(T x){
		this.x=x;
	}
	
	public void gValue() {
		System.out.println(x); 
		
	} 
	
}
