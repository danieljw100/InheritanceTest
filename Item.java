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
public class Item {
	
	private String title;
	private int playingTime;
	private boolean got;
	private String comment;
	
	public Item(String title, int playingTime, boolean got, String comment){
		this.title = title;
		this.playingTime = playingTime;
		this.got = got;
		this.comment = comment;
	}
	
	public void print(){
		System.out.println("Title: " +title);
		System.out.println("Playing time: " +playingTime);
		System.out.println("Got?: " +got);
		System.out.println("Comment: " +comment);
	}
}
