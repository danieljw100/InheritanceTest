/*
 * Created on 13-Oct-2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
import java.util.*;
/**
 * @author Dan
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class Database {

	private ArrayList items;

	public Database(){
		items = new ArrayList();
	}

	public void addItem(Item whatItem){
		items.add(whatItem);
	}

	public void list(){
		Iterator it = items.iterator();
		while(it.hasNext()){
			Item thisItem = (Item) it.next();
			thisItem.print();
		}
	}
}

