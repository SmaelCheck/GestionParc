package entities;

/***********************************************************************
 * Module:  Machine.java
 * Author:  admin
 * Purpose: Defines the Class Machine
 ***********************************************************************/

import java.util.*;

/** @pdOid e4494494-9895-4e83-9ec8-b145af171915 */
public class Machine extends Model {
   /** @pdOid 736a465c-5afa-414e-a0ae-7056cddafd42 */
   private int id;
   /** @pdOid 9af12050-a113-4b91-8522-d13cfdd32593 */
   private String number;
   /** @pdOid fc72823b-5f35-420c-8f0f-fe21e6bc33e0 */
   private String name;
   /** @pdOid 1a04d03a-6b25-4238-831d-0443790a478f */
   private java.util.Date purchasedate;
   /** @pdOid f81eb5a2-dc5d-4405-8663-f3b9c97c0a59 */
   private int warranty;
   /** @pdOid 3c21420b-1103-4551-8d4f-a774e0f1fb12 */
   private String ipmac;
   /** @pdOid 48ce7950-c308-45c5-9f8f-49998dfada1f */
   private String os;
   
   /** @pdRoleInfo migr=no name=TypeMachine assc=association5 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<TypeMachine> typeMachine;
   /** @pdRoleInfo migr=no name=Component assc=association14 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<Component> components;
   /** @pdRoleInfo migr=no name=Room assc=association10 mult=1..1 side=A */
   public Room room;
   
   /** @pdOid bc70eb90-6234-44ef-9c4a-64604649fcca */
   public void displayWarranty() {
      // TODO: implement
   }
   
   /** @pdOid ea3cd3ab-fe5d-4659-94b9-18175ef3b299 */
   public void modifyComponent() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<TypeMachine> getTypeMachine() {
      if (typeMachine == null)
         typeMachine = new java.util.HashSet<TypeMachine>();
      return typeMachine;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTypeMachine() {
      if (typeMachine == null)
         typeMachine = new java.util.HashSet<TypeMachine>();
      return typeMachine.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTypeMachine */
   public void setTypeMachine(java.util.Collection<TypeMachine> newTypeMachine) {
      removeAllTypeMachine();
      for (java.util.Iterator iter = newTypeMachine.iterator(); iter.hasNext();)
         addTypeMachine((TypeMachine)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTypeMachine */
   public void addTypeMachine(TypeMachine newTypeMachine) {
      if (newTypeMachine == null)
         return;
      if (this.typeMachine == null)
         this.typeMachine = new java.util.HashSet<TypeMachine>();
      if (!this.typeMachine.contains(newTypeMachine))
         this.typeMachine.add(newTypeMachine);
   }
   
   /** @pdGenerated default remove
     * @param oldTypeMachine */
   public void removeTypeMachine(TypeMachine oldTypeMachine) {
      if (oldTypeMachine == null)
         return;
      if (this.typeMachine != null)
         if (this.typeMachine.contains(oldTypeMachine))
            this.typeMachine.remove(oldTypeMachine);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTypeMachine() {
      if (typeMachine != null)
         typeMachine.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Component> getComponent() {
      if (components == null)
         components = new java.util.HashSet<Component>();
      return components;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorComponent() {
      if (components == null)
         components = new java.util.HashSet<Component>();
      return components.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newComponent */
   public void setComponent(java.util.Collection<Component> newComponent) {
      removeAllComponent();
      for (java.util.Iterator iter = newComponent.iterator(); iter.hasNext();)
         addComponent((Component)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newComponent */
   public void addComponent(Component newComponent) {
      if (newComponent == null)
         return;
      if (this.components == null)
         this.components = new java.util.HashSet<Component>();
      if (!this.components.contains(newComponent))
      {
         this.components.add(newComponent);
         newComponent.setMachine(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldComponent */
   public void removeComponent(Component oldComponent) {
      if (oldComponent == null)
         return;
      if (this.components != null)
         if (this.components.contains(oldComponent))
         {
            this.components.remove(oldComponent);
            oldComponent.setMachine((Machine)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllComponent() {
      if (components != null)
      {
         Component oldComponent;
         for (java.util.Iterator iter = getIteratorComponent(); iter.hasNext();)
         {
            oldComponent = (Component)iter.next();
            iter.remove();
            oldComponent.setMachine((Machine)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Room getRoom() {
      return room;
   }
   
   /** @pdGenerated default parent setter
     * @param newRoom */
   public void setRoom(Room newRoom) {
      if (this.room == null || !this.room.equals(newRoom))
      {
         if (this.room != null)
         {
            Room oldRoom = this.room;
            this.room = null;
            oldRoom.removeMachine(this);
         }
         if (newRoom != null)
         {
            this.room = newRoom;
            this.room.addMachine(this);
         }
      }
   }

}