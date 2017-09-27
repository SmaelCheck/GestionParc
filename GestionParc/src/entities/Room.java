package entities;

/***********************************************************************
 * Module:  Room.java
 * Author:  admin
 * Purpose: Defines the Class Room
 ***********************************************************************/

import java.util.*;

/** @pdOid dd7c27f6-b6ad-436c-a50e-3d36e006a58d */
public class Room extends Model {
   /** @pdOid a0ab7027-2459-477a-9c4d-8f980a8cb0fc */
   private int id;
   /** @pdOid 72c519e3-c246-4817-a2ee-3af9e3f20722 */
   private String name;
   /** @pdOid 9198010c-139d-4701-a893-dcf9970aedbe */
   private int capacity;
   /** @pdOid 73104293-347c-4bfb-ae0d-ca293aae6e58 */
   private String assignment;
   
   /** @pdRoleInfo migr=no name=Machine assc=association10 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<Machine> machines;
   /** @pdRoleInfo migr=no name=Building assc=association11 mult=1..1 side=A */
   public Building building;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Machine> getMachine() {
      if (machines == null)
         machines = new java.util.HashSet<Machine>();
      return machines;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMachine() {
      if (machines == null)
         machines = new java.util.HashSet<Machine>();
      return machines.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMachine */
   public void setMachine(java.util.Collection<Machine> newMachine) {
      removeAllMachine();
      for (java.util.Iterator iter = newMachine.iterator(); iter.hasNext();)
         addMachine((Machine)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMachine */
   public void addMachine(Machine newMachine) {
      if (newMachine == null)
         return;
      if (this.machines == null)
         this.machines = new java.util.HashSet<Machine>();
      if (!this.machines.contains(newMachine))
      {
         this.machines.add(newMachine);
         newMachine.setRoom(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldMachine */
   public void removeMachine(Machine oldMachine) {
      if (oldMachine == null)
         return;
      if (this.machines != null)
         if (this.machines.contains(oldMachine))
         {
            this.machines.remove(oldMachine);
            oldMachine.setRoom((Room)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMachine() {
      if (machines != null)
      {
         Machine oldMachine;
         for (java.util.Iterator iter = getIteratorMachine(); iter.hasNext();)
         {
            oldMachine = (Machine)iter.next();
            iter.remove();
            oldMachine.setRoom((Room)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Building getBuilding() {
      return building;
   }
   
   /** @pdGenerated default parent setter
     * @param newBuilding */
   public void setBuilding(Building newBuilding) {
      if (this.building == null || !this.building.equals(newBuilding))
      {
         if (this.building != null)
         {
            Building oldBuilding = this.building;
            this.building = null;
            oldBuilding.removeRoom(this);
         }
         if (newBuilding != null)
         {
            this.building = newBuilding;
            this.building.addRoom(this);
         }
      }
   }

}