import java.io.*;
import java.util.*;


public class LinkedlistvsArrayList {

	public static void main(String[] ar) {
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("how many movies do you want to add to list");
		int nofmovie=input.nextInt();
		
		System.out.println("please enter your favourite movies");
		
		LinkedList<String> list=new LinkedList<>();
		
		for(int i=0;i<nofmovie;i++) {
		list.add(input.nextLine());
		
		}
		
		
		
		
		System.out.println("which movie do you want to add to this list");
		
		String addmovie=input.next();
		list.add(addmovie);
		
		System.out.println("do you want to delete any movie from the list");
		
		String yesorno=input.next();
		
		if(yesorno.contains("yes")) {
		System.out.println("which movie");
		String deletemovie=input.next();
		list.remove(deletemovie);
		}else {
			System.out.print("ok. your movie list is :");
		}
		for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
		}
		
		
		
	}
	
	
}
