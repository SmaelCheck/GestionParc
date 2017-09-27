package entities;
/***********************************************************************
 * Module:  Model.java
 * Author:  admin
 * Purpose: Defines the Class Model
 ***********************************************************************/

import java.util.*;
import java.io.*;

public abstract class Model <T>
{
	private ArrayList<T> t = new ArrayList<T>();
	
	public final ArrayList<T> getCollection(){
		return this.t;
	}
	public final  void add(T obj) {
		this.t.add(obj);
	}

	public final void remove(T obj) {
		this.t.remove(obj);
	}
	public final void removeAll() {
		if (t != null) {
			t.removeAll(t);
		}
	}

	public final void sort() {
		
		//ArrayList.sort(t.iterator().next());
		//Collections.sort(t);
	}

	public final boolean isPossibleToAdd(int nbMax, ArrayList<T> col_objet) {
		if (col_objet.size() < nbMax) {
			return true;
		}
		return false;
	}

	//public abstract ArrayList<T> list();
}
