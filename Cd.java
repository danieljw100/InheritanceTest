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
public class Cd extends Item{

	private String band;
	private int numberOfTracks;

	public Cd(String title, int playingTime, boolean got, String comment, String band, int numberOfTracks){
		super(title, playingTime, got, comment);
		this.band = band;
		this.numberOfTracks = numberOfTracks;
	}
	
	public void print(){
		super.print();
		System.out.println("Band: " +band);
		System.out.println("Number Of Tracks: " +numberOfTracks);
	}

}
