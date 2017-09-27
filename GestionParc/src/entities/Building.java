package entities;
/***********************************************************************
 * Module:  Building.java
 * Author:  admin
 * Purpose: Defines the Class Building
 ***********************************************************************/

import java.util.*;

public class Building extends Model {

	private int id;
	private String name;
	private int nbMaxRoom;
	public ArrayList<Room> rooms;
	public ZipCode zipCode;
	public Park park;

	public ArrayList<Room> getRooms() {
		if (rooms == null)
			rooms = new ArrayList<Room>();
		return rooms;
	}

	public java.util.Iterator getIteratorRoom() {
		if (rooms == null)
			rooms = new ArrayList<Room>();
		return rooms.iterator();
	}

	public void setRooms(ArrayList<Room> newRoom) {
		removeAllRoom();
		for (java.util.Iterator iter = newRoom.iterator(); iter.hasNext();)
			addRoom((Room) iter.next());
	}

	public void addRoom(Room newRoom) {
		if (newRoom == null)
			return;
		if (this.rooms == null)
			this.rooms = new ArrayList<Room>();
		if (!this.rooms.contains(newRoom)) {
			this.rooms.add(newRoom);
			newRoom.setBuilding(this);
		}
	}

	public void removeRoom(Room oldRoom) {
		if (oldRoom == null)
			return;
		if (this.rooms != null)
			if (this.rooms.contains(oldRoom)) {
				this.rooms.remove(oldRoom);
				oldRoom.setBuilding((Building) null);
			}
	}

	public void removeAllRoom() {
		if (rooms != null) {
			Room oldRoom;
			for (java.util.Iterator iter = getIteratorRoom(); iter.hasNext();) {
				oldRoom = (Room) iter.next();
				iter.remove();
				oldRoom.setBuilding((Building) null);
			}
		}
	}

	public Park getPark() {
		return park;
	}

	public void setPark(Park newPark) {
		if (this.park == null || !this.park.equals(newPark)) {
			if (this.park != null) {
				Park oldPark = this.park;
				this.park = null;
				oldPark.removeBuilding(this);
			}
			if (newPark != null) {
				this.park = newPark;
				this.park.addBuilding(this);
			}
		}
	}

	//@Override
	//public ArrayList list();

}