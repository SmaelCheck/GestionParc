package entities;

/***********************************************************************
 * Module:  Park.java
 * Author:  admin
 * Purpose: Defines the Class Park
 ***********************************************************************/

import java.util.*;

public class Park extends Model<Building> {
	private int id;
	private String name;
	private int nbMaxBuilding;
	private String address;
	public ArrayList<Building> buildings;
	
	//public ArrayList<Building> collection;

//	public ArrayList<Building> getBuilding() {
//		if (buildings == null)
//			buildings = new ArrayList<Building>();
//		return buildings;
//	}
	
	public ArrayList<Building> getBuilding() {
		if (buildings == null)
			buildings = super.getCollection();
		return buildings;
	}

//	public ArrayList<Building> getBuilding() {
//	 if (buildings == null)
//		 buildings = ArrayList <Building>();
//	 return buildings.iterator();
//	 }

	public void setBuilding(ArrayList<Building> newBuilding) {
		removeAllBuilding();
		for (java.util.Iterator iter = newBuilding.iterator(); iter.hasNext();)
			addBuilding((Building) iter.next());
	}

	public void addBuilding(Building newBuilding) {
		if (newBuilding == null)
			return;

		if (this.buildings == null)
			this.buildings = new ArrayList<Building>();

		if (!this.buildings.contains(newBuilding)) {
			this.buildings.add(newBuilding);
			newBuilding.setPark(this);
		}
	}

	public void removeBuilding(Building oldBuilding) {
		if (oldBuilding == null)
			return;
		if (this.buildings != null)
			if (this.buildings.contains(oldBuilding)) {
				this.buildings.remove(oldBuilding);
				oldBuilding.setPark((Park) null);
			}
	}

	public void removeAllBuilding() {
		if (buildings != null) {
			Building oldBuilding;

			for (Iterator iter = getBuilding().iterator(); iter.hasNext();) {
				oldBuilding = (Building) iter.next();
				iter.remove();
				oldBuilding.setPark((Park) null);
			}
		}
	}


	
	//isPossibleToAdd(nbMaxBuilding, buildings);

}
