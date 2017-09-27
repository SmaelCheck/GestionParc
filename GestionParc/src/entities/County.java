package entities;

/***********************************************************************
 * Module:  County.java
 * Author:  Smael
 * Purpose: Defines the Class County
 ***********************************************************************/

import java.util.*;

/** @pdOid 7fb7ecea-47ab-4420-bb0d-fd460b023ed3 */
public class County extends Model {
   /** @pdOid c2e17664-133e-43b2-8ae4-6ecef2d48c38 */
   private int id;
   /** @pdOid 744c6e6f-d9f8-420f-8042-44ae11ec42f3 */
   private String name;
   
   /** @pdRoleInfo migr=no name=Park assc=association9 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<Park> parks;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Park> getPark() {
      if (parks == null)
         parks = new java.util.HashSet<Park>();
      return parks;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorPark() {
      if (parks == null)
         parks = new java.util.HashSet<Park>();
      return parks.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newPark */
   public void setPark(java.util.Collection<Park> newPark) {
      removeAllPark();
      for (java.util.Iterator iter = newPark.iterator(); iter.hasNext();)
         addPark((Park)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newPark */
   public void addPark(Park newPark) {
      if (newPark == null)
         return;
      if (this.parks == null)
         this.parks = new java.util.HashSet<Park>();
      if (!this.parks.contains(newPark))
         this.parks.add(newPark);
   }
   
   /** @pdGenerated default remove
     * @param oldPark */
   public void removePark(Park oldPark) {
      if (oldPark == null)
         return;
      if (this.parks != null)
         if (this.parks.contains(oldPark))
            this.parks.remove(oldPark);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllPark() {
      if (parks != null)
         parks.clear();
   }

}