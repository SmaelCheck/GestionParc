package entities;

/***********************************************************************
 * Module:  Component.java
 * Author:  admin
 * Purpose: Defines the Class Component
 ***********************************************************************/

import java.util.*;

/** @pdOid e597fe8e-b837-44a6-b05f-17eb1408928a */
public class Component {
   /** @pdOid c5900ad6-b2fb-45ea-9317-0d952e7c6609 */
   private int id;
   /** @pdOid cce35247-5680-43ab-bf29-d54b6fba0643 */
   private String brand;
   /** @pdOid 9872ad71-a62c-4cd7-a627-1be5c90a08a4 */
   private String model;
   /** @pdOid 08c2220a-faae-4ded-8400-f015ab5e2570 */
   private String serieNumber;
   /** @pdOid 7a674cb0-b2de-4cdc-bcf9-d5a1d6df87ef */
   private String manufacter;
   
   /** @pdRoleInfo migr=no name=Machine assc=association14 mult=0..1 side=A */
   public Machine machine;
   
   
   /** @pdGenerated default parent getter */
   public Machine getMachine() {
      return machine;
   }
   
   /** @pdGenerated default parent setter
     * @param newMachine */
   public void setMachine(Machine newMachine) {
      if (this.machine == null || !this.machine.equals(newMachine))
      {
         if (this.machine != null)
         {
            Machine oldMachine = this.machine;
            this.machine = null;
            oldMachine.removeComponent(this);
         }
         if (newMachine != null)
         {
            this.machine = newMachine;
            this.machine.addComponent(this);
         }
      }
   }

}