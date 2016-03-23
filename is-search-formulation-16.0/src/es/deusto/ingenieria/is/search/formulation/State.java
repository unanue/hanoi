package es.deusto.ingenieria.is.search.formulation;

import java.time.temporal.IsoFields;
import java.util.ArrayList;
import java.util.List;

/**
 * Class defining problem state. It represents a given problem stage or
 * situation.
 */

public class State {
	private List<Integer> list;

	public State() {
		list = new ArrayList<Integer>();
	}

	/**
	 * Returns a string representation of the object. In general, the toString
	 * method returns a string that "textually represents" this object.
	 * 
	 * The result should be a concise but informative representation that is
	 * easy for a person to read. It is recommended that all subclasses override
	 * this method.
	 * 
	 * The toString method for class Object returns a string consisting of the
	 * name of the class of which the object is an instance, the at-sign
	 * character `@', and the unsigned hexadecimal representation of the hash
	 * code of the object.
	 * 
	 * In other words, this method returns a string equal to the value of:
	 * getClass().getName() + '@' + Integer.toHexString(hashCode())
	 * 
	 * @return a string representation of the object.
	 */
	public String toString(int numSoportes) {
		String string = "";
		for(int i=0;i<numSoportes;i++){
			string = string + ("Soporte " + i + ":" +"\n");
			for(int j=(list.size()-1);j>=0;j--){
				if((list.get(j))==i){
					string = string + ("[" + j + "]") + "\n";
				}
			}
		}
		string = string + "\n";
		return string;
	}

	/**
	 * Indicates whether some other object is "equal to" this one.
	 * 
	 * The equals method for class Object implements the most discriminating
	 * possible equivalence relation on objects; that is, for any non-null
	 * reference values x and y, this method returns true if and only if x and y
	 * refer to the same object (x == y has the value true).
	 * 
	 * 
	 * @param obj
	 *            the reference object with which to compare.
	 * @return boolean
	 *         <li><b>true</b> - if this object is the same as the obj argument.
	 *         </li>
	 *         <li><b>false</b> - otherwise.</li>
	 */
	public boolean equals(State finalState) {	
		boolean equals;
		if (finalState != null) {
			List<Integer> listaFinalState = finalState.getList();
			equals = true;
			for (int i = 0; i < listaFinalState.size(); i++) {
				if(listaFinalState.get(i)!=this.list.get(i)){
					equals = false;
				}
					System.out.println("Equals: " + equals);
			}
			return equals;
		} else {
			return false;
		}
		
	}
	public State clone(){

		State clon = new State();
		List<Integer> clonList = new ArrayList<Integer>();
		for(int i = 0; i < this.list.size(); i++) 
		{
			clonList.add(i, list.get(i));
		}
		clon.setList(clonList);
		return clon;
	}

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
		
	}
}