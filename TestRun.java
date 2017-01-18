
import java.util.*;

public class TestRun {

	Cd cd;
	Video video;
	ArrayList items;

	public TestRun(){
		this.runTestOne();
		System.out.println();
		this.runTestTwo();
		System.out.println();
		//this.runTestThree();		
	}

	/**
	 * This is very straight forward. The static type of cd is Cd and the dynamic type is also Cd.
	 * There is no ambiguity about which print() version will be invoked
	 *
	 */
	private void runTestOne(){
		
		System.out.println("Test One");
		
		System.out.println("CD print out:");
		cd = new Cd("Vertigo", 120, true, "solid", "Metallica", 12);
		cd.print();
		
		System.out.println();
		
		System.out.println("Video print out");
		video = new Video("Jaws", 110, true, "classic", "Steven Speilberg");
		video.print();
	}
		
	/**
	 * if a Cd or Video object is cast as an Item then at run time the print() method corresponding to the
	 * dynamic type of the item object is the version of the print method that is invoked (if it exists).
	 * If the print() method does not exist in the class of the dynamic type then at run time Java will
	 * recursively look up through the inheritance heirarchy until it finds the method, or returns a method
	 * not found exception if it does not exist atall.
	 *
	 */
	private void runTestTwo(){
		
		System.out.println("Test Two");
		
		items = new ArrayList();
		items.add(cd);
		items.add(video);
		
		for(Iterator it = items.iterator(); it.hasNext(); ){
			//Variable thisItem has static type Item. The dynamic type depends on which element is next.
			Item thisItem = (Item) it.next();
			thisItem.print();
			System.out.println();
		}		
	}

	/**
	 * private attributes of the superclass Item are inherited and accessible by the subclsses.
	 * 
	 * Inheritance has nothing to do with visibility.
	 * When a subclass inherits a member from a superclass it can legally refer to that member
	 * (provided the member is either public or protected)
	 */
	

	public static void main(String[] args) {
		TestRun thisTestRun = new TestRun();
	}
	
}
