/*
 * Created on 12-Oct-2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */

/**
 * @author Dan
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class Video extends Item{
	
	private String director;

	public Video(String title, int playingTime, boolean got, String comment, String director){
		super(title, playingTime, got, comment);
		this.director = director;
	}
	
	public void print(){
		super.print();
		System.out.println("Director: " +director);
	}
}
