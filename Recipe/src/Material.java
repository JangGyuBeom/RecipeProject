import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JCheckBox;

public class Material extends Price {
   public static ArrayList<String> Material = new ArrayList<String>();
   ArrayList<String> fName = new ArrayList<String>();
   public static int allSumMaterialPrice = 0;

   CookConnection cc = new CookConnection();

  
   public void SearchM(JCheckBox checkBox, JCheckBox checkBox_1, JCheckBox checkBox_2, JCheckBox checkBox_3,
         JCheckBox checkBox_4, JCheckBox checkBox_5, JCheckBox checkBox_6, JCheckBox checkBox_7,
         JCheckBox checkBox_8, JCheckBox checkBox_9, JCheckBox checkBox_10, JCheckBox checkBox_11,
         JCheckBox checkBox_12, JCheckBox checkBox_13, JCheckBox checkBox_14, JCheckBox checkBox_15,
         JCheckBox checkBox_16, JCheckBox checkBox_17, JCheckBox checkBox_18, JCheckBox checkBox_19,
         JCheckBox checkBox_20, JCheckBox checkBox_21, JCheckBox checkBox_22, JCheckBox checkBox_23,
         JCheckBox checkBox_24, JCheckBox checkBox_25, JCheckBox checkBox_26, JCheckBox checkBox_27,
         JCheckBox checkBox_28, JCheckBox checkBox_29, JCheckBox checkBox_30, JCheckBox checkBox_31,
         JCheckBox checkBox_32, JCheckBox checkBox_33, JCheckBox checkBox_34, JCheckBox checkBox_35,
         JCheckBox checkBox_36, JCheckBox checkBox_37, JCheckBox checkBox_38, JCheckBox checkBox_39,
         JCheckBox checkBox_40, JCheckBox checkBox_41, JCheckBox checkBox_42, JCheckBox checkBox_43,
         JCheckBox checkBox_44, JCheckBox checkBox_45, JCheckBox checkBox_46, JCheckBox checkBox_47,
         JCheckBox checkBox_48, JCheckBox checkBox_49, JCheckBox checkBox_50, JCheckBox checkBox_51,
         JCheckBox checkBox_52, JCheckBox checkBox_53, JCheckBox checkBox_54, JCheckBox checkBox_55) {

      if (checkBox.isSelected()) {
         Material.add(checkBox.getText());
      }
      if (checkBox_1.isSelected()) {
         Material.add(checkBox_1.getText());
      }
      if (checkBox_2.isSelected()) {
         Material.add(checkBox_2.getText());
      }
      if (checkBox_3.isSelected()) {
         Material.add(checkBox_3.getText());
      }
      if (checkBox_4.isSelected()) {
         Material.add(checkBox_4.getText());
      }
      if (checkBox_5.isSelected()) {
         Material.add(checkBox_5.getText());
      }
      if (checkBox_6.isSelected()) {
         Material.add(checkBox_6.getText());
      }
      if (checkBox_7.isSelected()) {
         Material.add(checkBox_7.getText());
      }
      if (checkBox_8.isSelected()) {
         Material.add(checkBox_8.getText());
      }
      if (checkBox_9.isSelected()) {
         Material.add(checkBox_9.getText());
      }
      if (checkBox_10.isSelected()) {
         Material.add(checkBox_10.getText());
      }
      if (checkBox_11.isSelected()) {
         Material.add(checkBox_11.getText());
      }
      if (checkBox_12.isSelected()) {
         Material.add(checkBox_12.getText());
      }
      if (checkBox_13.isSelected()) {
         Material.add(checkBox_13.getText());
      }
      if (checkBox_14.isSelected()) {
         Material.add(checkBox_14.getText());
      }
      if (checkBox_15.isSelected()) {
         Material.add(checkBox_15.getText());
      }
      if (checkBox_16.isSelected()) {
         Material.add(checkBox_16.getText());
      }
      if (checkBox_17.isSelected()) {
         Material.add(checkBox_17.getText());
      }
      if (checkBox_18.isSelected()) {
         Material.add(checkBox_18.getText());
      }
      if (checkBox_19.isSelected()) {
         Material.add(checkBox_19.getText());
      }
      if (checkBox_20.isSelected()) {
         Material.add(checkBox_20.getText());
      }
      if (checkBox_21.isSelected()) {
         Material.add(checkBox_21.getText());
      }
      if (checkBox_22.isSelected()) {
         Material.add(checkBox_22.getText());
      }
      if (checkBox_23.isSelected()) {
         Material.add(checkBox_23.getText());
      }
      if (checkBox_24.isSelected()) {
         Material.add(checkBox_24.getText());
      }
      if (checkBox_25.isSelected()) {
         Material.add(checkBox_25.getText());
      }
      if (checkBox_26.isSelected()) {
         Material.add(checkBox_26.getText());
      }
      if (checkBox_27.isSelected()) {
         Material.add(checkBox_27.getText());
      }
      if (checkBox_28.isSelected()) {
         Material.add(checkBox_28.getText());
      }
      if (checkBox_29.isSelected()) {
         Material.add(checkBox_29.getText());
      }
      if (checkBox_30.isSelected()) {
         Material.add(checkBox_30.getText());
      }
      if (checkBox_31.isSelected()) {
         Material.add(checkBox_31.getText());
      }
      if (checkBox_32.isSelected()) {
         Material.add(checkBox_32.getText());
      }
      if (checkBox_33.isSelected()) {
         Material.add(checkBox_33.getText());
      }
      if (checkBox_34.isSelected()) {
         Material.add(checkBox_34.getText());
      }
      if (checkBox_35.isSelected()) {
         Material.add(checkBox_35.getText());
      }
      if (checkBox_36.isSelected()) {
         Material.add(checkBox_36.getText());
      }
      if (checkBox_37.isSelected()) {
         Material.add(checkBox_37.getText());
      }
      if (checkBox_38.isSelected()) {
         Material.add(checkBox_38.getText());
      }
      if (checkBox_39.isSelected()) {
         Material.add(checkBox_39.getText());
      }
      if (checkBox_40.isSelected()) {
         Material.add(checkBox_40.getText());
      }
      if (checkBox_41.isSelected()) {
         Material.add(checkBox_41.getText());
      }
      if (checkBox_42.isSelected()) {
         Material.add(checkBox_42.getText());
      }
      if (checkBox_43.isSelected()) {
         Material.add(checkBox_43.getText());
      }
      if (checkBox_44.isSelected()) {
         Material.add(checkBox_44.getText());
      }
      if (checkBox_45.isSelected()) {
         Material.add(checkBox_45.getText());
      }
      if (checkBox_46.isSelected()) {
          Material.add(checkBox_45.getText());
      }
      if (checkBox_47.isSelected()) {
          Material.add(checkBox_45.getText());
      }
      if (checkBox_48.isSelected()) {
          Material.add(checkBox_45.getText());
      }
      if (checkBox_49.isSelected()) {
          Material.add(checkBox_45.getText());
      }
      if (checkBox_50.isSelected()) {
          Material.add(checkBox_45.getText());
      }
      if (checkBox_51.isSelected()) {
          Material.add(checkBox_45.getText());
      }
      if (checkBox_52.isSelected()) {
          Material.add(checkBox_45.getText());
      }
      if (checkBox_53.isSelected()) {
          Material.add(checkBox_45.getText());
      }
      if (checkBox_54.isSelected()) {
          Material.add(checkBox_45.getText());
      }
      if (checkBox_55.isSelected()) {
          Material.add(checkBox_45.getText());
      }
      
      
   }

   
   public void SearchM(JCheckBox checkBox, JCheckBox checkBox_1, JCheckBox checkBox_2, JCheckBox checkBox_3,
	         JCheckBox checkBox_4, JCheckBox checkBox_5, JCheckBox checkBox_6, JCheckBox checkBox_7,
	         JCheckBox checkBox_8, JCheckBox checkBox_9, JCheckBox checkBox_10, JCheckBox checkBox_11,
	         JCheckBox checkBox_12, JCheckBox checkBox_13, JCheckBox checkBox_14, JCheckBox checkBox_15,
	         JCheckBox checkBox_16, JCheckBox checkBox_17, JCheckBox checkBox_18, JCheckBox checkBox_19,
	         JCheckBox checkBox_20, JCheckBox checkBox_21, JCheckBox checkBox_22, JCheckBox checkBox_23,
	         JCheckBox checkBox_24, JCheckBox checkBox_25, JCheckBox checkBox_26, JCheckBox checkBox_27,
	         JCheckBox checkBox_28, JCheckBox checkBox_29, JCheckBox checkBox_30) {
	   if (checkBox.isSelected()) {
	         Material.add(checkBox.getText());
	      }
	   if (checkBox_1.isSelected()) {
	         Material.add(checkBox_1.getText());
	      }
	   if (checkBox_2.isSelected()) {
	         Material.add(checkBox_2.getText());
	      }
	   if (checkBox_3.isSelected()) {
	         Material.add(checkBox_3.getText());
	      }
	   if (checkBox_4.isSelected()) {
	         Material.add(checkBox_4.getText());
	      }
	   if (checkBox_5.isSelected()) {
	         Material.add(checkBox_5.getText());
	      }
	   if (checkBox_6.isSelected()) {
	         Material.add(checkBox_6.getText());
	      }
	   if (checkBox_7.isSelected()) {
	         Material.add(checkBox_7.getText());
	      }
	   if (checkBox_8.isSelected()) {
	         Material.add(checkBox_8.getText());
	      }
	   if (checkBox_9.isSelected()) {
	         Material.add(checkBox_9.getText());
	      }
	   if (checkBox_10.isSelected()) {
	         Material.add(checkBox_10.getText());
	      }
	   if (checkBox_11.isSelected()) {
	         Material.add(checkBox_11.getText());
	      }
	   if (checkBox_12.isSelected()) {
	         Material.add(checkBox_12.getText());
	      }
	   if (checkBox_13.isSelected()) {
	         Material.add(checkBox_13.getText());
	      }
	   if (checkBox_14.isSelected()) {
	         Material.add(checkBox_14.getText());
	      }
	   if (checkBox_15.isSelected()) {
	         Material.add(checkBox_15.getText());
	      }
	   if (checkBox_16.isSelected()) {
	         Material.add(checkBox_16.getText());
	      }
	   if (checkBox_17.isSelected()) {
	         Material.add(checkBox_17.getText());
	      }
	   if (checkBox_18.isSelected()) {
	         Material.add(checkBox_18.getText());
	      }
	   if (checkBox_19.isSelected()) {
	         Material.add(checkBox_19.getText());
	      }
	   if (checkBox_20.isSelected()) {
	         Material.add(checkBox_20.getText());
	      }
	   if (checkBox_21.isSelected()) {
	         Material.add(checkBox_21.getText());
	      }
	   if (checkBox_22.isSelected()) {
	         Material.add(checkBox_22.getText());
	      }
	   if (checkBox_23.isSelected()) {
	         Material.add(checkBox_23.getText());
	      }
	   if (checkBox_24.isSelected()) {
	         Material.add(checkBox_24.getText());
	      }
	   if (checkBox_25.isSelected()) {
	         Material.add(checkBox_25.getText());
	      }
	   if (checkBox_26.isSelected()) {
	         Material.add(checkBox_26.getText());
	      }
	   if (checkBox_27.isSelected()) {
	         Material.add(checkBox_27.getText());
	      }
	   if (checkBox_28.isSelected()) {
	         Material.add(checkBox_28.getText());
	      }
	   if (checkBox_29.isSelected()) {
	         Material.add(checkBox_29.getText());
	      }
	   if (checkBox_30.isSelected()) {
	         Material.add(checkBox_30.getText());
	      }
   }

   
   public void SearchM(JCheckBox checkBox, JCheckBox checkBox_1, JCheckBox checkBox_2, JCheckBox checkBox_3,
	         JCheckBox checkBox_4, JCheckBox checkBox_5, JCheckBox checkBox_6, JCheckBox checkBox_7,
	         JCheckBox checkBox_8, JCheckBox checkBox_9, JCheckBox checkBox_10, JCheckBox checkBox_11,
	         JCheckBox checkBox_12, JCheckBox checkBox_13, JCheckBox checkBox_14, JCheckBox checkBox_15,
	         JCheckBox checkBox_16, JCheckBox checkBox_17, JCheckBox checkBox_18, JCheckBox checkBox_19,
	         JCheckBox checkBox_20, JCheckBox checkBox_21, JCheckBox checkBox_22, JCheckBox checkBox_23,
	         JCheckBox checkBox_24, JCheckBox checkBox_25, JCheckBox checkBox_26, JCheckBox checkBox_27,
	         JCheckBox checkBox_28, JCheckBox checkBox_29, JCheckBox checkBox_30, JCheckBox checkBox_31,
	         JCheckBox checkBox_32, JCheckBox checkBox_33, JCheckBox checkBox_34, JCheckBox checkBox_35) {
	   if (checkBox.isSelected()) {
	         Material.add(checkBox.getText());
	      }
	   if (checkBox_1.isSelected()) {
	         Material.add(checkBox_1.getText());
	      }
	   if (checkBox_2.isSelected()) {
	         Material.add(checkBox_2.getText());
	      }
	   if (checkBox_3.isSelected()) {
	         Material.add(checkBox_3.getText());
	      }
	   if (checkBox_4.isSelected()) {
	         Material.add(checkBox_4.getText());
	      }
	   if (checkBox_5.isSelected()) {
	         Material.add(checkBox_5.getText());
	      }
	   if (checkBox_6.isSelected()) {
	         Material.add(checkBox_6.getText());
	      }
	   if (checkBox_7.isSelected()) {
	         Material.add(checkBox_7.getText());
	      }
	   if (checkBox_8.isSelected()) {
	         Material.add(checkBox_8.getText());
	      }
	   if (checkBox_9.isSelected()) {
	         Material.add(checkBox_9.getText());
	      }
	   if (checkBox_10.isSelected()) {
	         Material.add(checkBox_10.getText());
	      }
	   if (checkBox_11.isSelected()) {
	         Material.add(checkBox_11.getText());
	      }
	   if (checkBox_12.isSelected()) {
	         Material.add(checkBox_12.getText());
	      }
	   if (checkBox_13.isSelected()) {
	         Material.add(checkBox_13.getText());
	      }
	   if (checkBox_14.isSelected()) {
	         Material.add(checkBox_14.getText());
	      }
	   if (checkBox_15.isSelected()) {
	         Material.add(checkBox_15.getText());
	      }
	   if (checkBox_16.isSelected()) {
	         Material.add(checkBox_16.getText());
	      }
	   if (checkBox_17.isSelected()) {
	         Material.add(checkBox_17.getText());
	      }
	   if (checkBox_18.isSelected()) {
	         Material.add(checkBox_18.getText());
	      }
	   if (checkBox_19.isSelected()) {
	         Material.add(checkBox_19.getText());
	      }
	   if (checkBox_20.isSelected()) {
	         Material.add(checkBox_20.getText());
	      }
	   if (checkBox_21.isSelected()) {
	         Material.add(checkBox_21.getText());
	      }
	   if (checkBox_22.isSelected()) {
	         Material.add(checkBox_22.getText());
	      }
	   if (checkBox_23.isSelected()) {
	         Material.add(checkBox_23.getText());
	      }
	   if (checkBox_24.isSelected()) {
	         Material.add(checkBox_24.getText());
	      }
	   if (checkBox_25.isSelected()) {
	         Material.add(checkBox_25.getText());
	      }
	   if (checkBox_26.isSelected()) {
	         Material.add(checkBox_26.getText());
	      }
	   if (checkBox_27.isSelected()) {
	         Material.add(checkBox_27.getText());
	      }
	   if (checkBox_28.isSelected()) {
	         Material.add(checkBox_28.getText());
	      }
	   if (checkBox_29.isSelected()) {
	         Material.add(checkBox_29.getText());
	      }
	   if (checkBox_30.isSelected()) {
	         Material.add(checkBox_30.getText());
	      }
	   if (checkBox_31.isSelected()) {
	         Material.add(checkBox_31.getText());
	      }
	   if (checkBox_32.isSelected()) {
	         Material.add(checkBox_32.getText());
	      }
	   if (checkBox_33.isSelected()) {
	         Material.add(checkBox_33.getText());
	      }
	   if (checkBox_34.isSelected()) {
	         Material.add(checkBox_34.getText());
	      }
	   if (checkBox_35.isSelected()) {
	         Material.add(checkBox_35.getText());
	      }
   }

   
   public void SearchM(JCheckBox checkBox, JCheckBox checkBox_1, JCheckBox checkBox_2, JCheckBox checkBox_3,
	         JCheckBox checkBox_4, JCheckBox checkBox_5, JCheckBox checkBox_6, JCheckBox checkBox_7,
	         JCheckBox checkBox_8, JCheckBox checkBox_9, JCheckBox checkBox_10, JCheckBox checkBox_11,
	         JCheckBox checkBox_12, JCheckBox checkBox_13, JCheckBox checkBox_14, JCheckBox checkBox_15,
	         JCheckBox checkBox_16, JCheckBox checkBox_17, JCheckBox checkBox_18, JCheckBox checkBox_19,
	         JCheckBox checkBox_20, JCheckBox checkBox_21) {
	  if (checkBox.isSelected()) {
	          Material.add(checkBox.getText());
	       }
	  if (checkBox_1.isSelected()) {
	          Material.add(checkBox_1.getText());
	       }
	  if (checkBox_2.isSelected()) {
	          Material.add(checkBox_2.getText());
	       }
	  if (checkBox_3.isSelected()) {
	          Material.add(checkBox_3.getText());
	       }
	  if (checkBox_4.isSelected()) {
	          Material.add(checkBox_4.getText());
	       }
	  if (checkBox_5.isSelected()) {
	          Material.add(checkBox_5.getText());
	       }
	  if (checkBox_6.isSelected()) {
	          Material.add(checkBox_6.getText());
	       }
	  if (checkBox_7.isSelected()) {
	          Material.add(checkBox_7.getText());
	       }
	  if (checkBox_8.isSelected()) {
	          Material.add(checkBox_8.getText());
	       }
	  if (checkBox_9.isSelected()) {
	          Material.add(checkBox_9.getText());
	       }
	  if (checkBox_10.isSelected()) {
	          Material.add(checkBox_10.getText());
	       }
	  if (checkBox_11.isSelected()) {
	          Material.add(checkBox_11.getText());
	       }
	  if (checkBox_12.isSelected()) {
	          Material.add(checkBox_12.getText());
	       }
	  if (checkBox_13.isSelected()) {
	          Material.add(checkBox_13.getText());
	       }
	  if (checkBox_14.isSelected()) {
	          Material.add(checkBox_14.getText());
	       }
	  if (checkBox_15.isSelected()) {
	          Material.add(checkBox_15.getText());
	       }
	  if (checkBox_16.isSelected()) {
	          Material.add(checkBox_16.getText());
	       }
	  if (checkBox_17.isSelected()) {
	          Material.add(checkBox_17.getText());
	       }
	  if (checkBox_18.isSelected()) {
	          Material.add(checkBox_18.getText());
	       }
	  if (checkBox_19.isSelected()) {
	          Material.add(checkBox_19.getText());
	       }
	  if (checkBox_20.isSelected()) {
	          Material.add(checkBox_20.getText());
	       }
	  if (checkBox_21.isSelected()) {
	          Material.add(checkBox_21.getText());
	       } 
   }

   
   public void SearchM(JCheckBox checkBox, JCheckBox checkBox_1, JCheckBox checkBox_2, JCheckBox checkBox_3,
	         JCheckBox checkBox_4, JCheckBox checkBox_5, JCheckBox checkBox_6, JCheckBox checkBox_7,
	         JCheckBox checkBox_8, JCheckBox checkBox_9, JCheckBox checkBox_10, JCheckBox checkBox_11,
	         JCheckBox checkBox_12, JCheckBox checkBox_13, JCheckBox checkBox_14, JCheckBox checkBox_15,
	         JCheckBox checkBox_16, JCheckBox checkBox_17, JCheckBox checkBox_18, JCheckBox checkBox_19,
	         JCheckBox checkBox_20, JCheckBox checkBox_21, JCheckBox checkBox_22, JCheckBox checkBox_23,
	         JCheckBox checkBox_24, JCheckBox checkBox_25, JCheckBox checkBox_26, JCheckBox checkBox_27,
	         JCheckBox checkBox_28, JCheckBox checkBox_29){
	   if (checkBox.isSelected()) {
	          Material.add(checkBox.getText());
	       }
	   if (checkBox_1.isSelected()) {
	          Material.add(checkBox_1.getText());
	       }
	   if (checkBox_2.isSelected()) {
	          Material.add(checkBox_2.getText());
	       }
	   if (checkBox_3.isSelected()) {
	          Material.add(checkBox_3.getText());
	       }
	   if (checkBox_4.isSelected()) {
	          Material.add(checkBox_4.getText());
	       }
	   if (checkBox_5.isSelected()) {
	          Material.add(checkBox_5.getText());
	       }
	   if (checkBox_6.isSelected()) {
	          Material.add(checkBox_6.getText());
	       }
	   if (checkBox_7.isSelected()) {
	          Material.add(checkBox_7.getText());
	       }
	   if (checkBox_8.isSelected()) {
	          Material.add(checkBox_8.getText());
	       }
	   if (checkBox_9.isSelected()) {
	          Material.add(checkBox_9.getText());
	       }
	   if (checkBox_10.isSelected()) {
	          Material.add(checkBox_10.getText());
	       }
	   if (checkBox_11.isSelected()) {
	          Material.add(checkBox_11.getText());
	       }
	   if (checkBox_12.isSelected()) {
	          Material.add(checkBox_12.getText());
	       }
	   if (checkBox_13.isSelected()) {
	          Material.add(checkBox_13.getText());
	       }
	   if (checkBox_14.isSelected()) {
	          Material.add(checkBox_14.getText());
	       }
	   if (checkBox_15.isSelected()) {
	          Material.add(checkBox_15.getText());
	       }
	   if (checkBox_16.isSelected()) {
	          Material.add(checkBox_16.getText());
	       }
	   if (checkBox_17.isSelected()) {
	          Material.add(checkBox_17.getText());
	       }
	   if (checkBox_18.isSelected()) {
	          Material.add(checkBox_18.getText());
	       }
	   if (checkBox_19.isSelected()) {
	          Material.add(checkBox_19.getText());
	       }
	   if (checkBox_20.isSelected()) {
	          Material.add(checkBox_20.getText());
	       }
	   if (checkBox_21.isSelected()) {
	          Material.add(checkBox_21.getText());
	       }
	   if (checkBox_22.isSelected()) {
	          Material.add(checkBox_22.getText());
	       }
	   if (checkBox_23.isSelected()) {
	          Material.add(checkBox_23.getText());
	       }
	   if (checkBox_24.isSelected()) {
	          Material.add(checkBox_24.getText());
	       }
	   if (checkBox_25.isSelected()) {
	          Material.add(checkBox_25.getText());
	       }
	   if (checkBox_26.isSelected()) {
	          Material.add(checkBox_26.getText());
	       }
	   if (checkBox_27.isSelected()) {
	          Material.add(checkBox_27.getText());
	       }
	   if (checkBox_28.isSelected()) {
	          Material.add(checkBox_28.getText());
	       }
	   if (checkBox_29.isSelected()) {
	          Material.add(checkBox_29.getText());
	       }
     
    }
    
   
   public void SearchM(JCheckBox checkBox, JCheckBox checkBox_1, JCheckBox checkBox_2, JCheckBox checkBox_3,
	         JCheckBox checkBox_4, JCheckBox checkBox_5, JCheckBox checkBox_6, JCheckBox checkBox_7,
	         JCheckBox checkBox_8, JCheckBox checkBox_9, JCheckBox checkBox_10, JCheckBox checkBox_11,
	         JCheckBox checkBox_12, JCheckBox checkBox_13, JCheckBox checkBox_14, JCheckBox checkBox_15,
	         JCheckBox checkBox_16, JCheckBox checkBox_17, JCheckBox checkBox_18, JCheckBox checkBox_19,
	         JCheckBox checkBox_20, JCheckBox checkBox_21, JCheckBox checkBox_22, JCheckBox checkBox_23,
	         JCheckBox checkBox_24, JCheckBox checkBox_25, JCheckBox checkBox_26, JCheckBox checkBox_27,
	         JCheckBox checkBox_28, JCheckBox checkBox_29, JCheckBox checkBox_30, JCheckBox checkBox_31,
	         JCheckBox checkBox_32, JCheckBox checkBox_33, JCheckBox checkBox_34, JCheckBox checkBox_35,
	         JCheckBox checkBox_36, JCheckBox checkBox_37, JCheckBox checkBox_38, JCheckBox checkBox_39,
	         JCheckBox checkBox_40, JCheckBox checkBox_41, JCheckBox checkBox_42) {
	   if (checkBox.isSelected()) {
	         Material.add(checkBox.getText());
	      }
	   if (checkBox_1.isSelected()) {
	         Material.add(checkBox_1.getText());
	      }
	   if (checkBox_2.isSelected()) {
	         Material.add(checkBox_2.getText());
	      }
	   if (checkBox_3.isSelected()) {
	         Material.add(checkBox_3.getText());
	      }
	   if (checkBox_4.isSelected()) {
	         Material.add(checkBox_4.getText());
	      }
	   if (checkBox_5.isSelected()) {
	         Material.add(checkBox_5.getText());
	      }
	   if (checkBox_6.isSelected()) {
	         Material.add(checkBox_6.getText());
	      }
	   if (checkBox_7.isSelected()) {
	         Material.add(checkBox_7.getText());
	      }
	   if (checkBox_8.isSelected()) {
	         Material.add(checkBox_8.getText());
	      }
	   if (checkBox_9.isSelected()) {
	         Material.add(checkBox_9.getText());
	      }
	   if (checkBox_10.isSelected()) {
	         Material.add(checkBox_10.getText());
	      }
	   if (checkBox_11.isSelected()) {
	         Material.add(checkBox_11.getText());
	      }
	   if (checkBox_12.isSelected()) {
	         Material.add(checkBox_12.getText());
	      }
	   if (checkBox_13.isSelected()) {
	         Material.add(checkBox_13.getText());
	      }
	   if (checkBox_14.isSelected()) {
	         Material.add(checkBox_14.getText());
	      }
	   if (checkBox_15.isSelected()) {
	         Material.add(checkBox_15.getText());
	      }
	   if (checkBox_16.isSelected()) {
	         Material.add(checkBox_16.getText());
	      }
	   if (checkBox_17.isSelected()) {
	         Material.add(checkBox_17.getText());
	      }
	   if (checkBox_18.isSelected()) {
	         Material.add(checkBox_18.getText());
	      }
	   if (checkBox_19.isSelected()) {
	         Material.add(checkBox_19.getText());
	      }
	   if (checkBox_20.isSelected()) {
	         Material.add(checkBox_20.getText());
	      }
	   if (checkBox_21.isSelected()) {
	         Material.add(checkBox_21.getText());
	      }
	   if (checkBox_22.isSelected()) {
	         Material.add(checkBox_22.getText());
	      }
	   if (checkBox_23.isSelected()) {
	         Material.add(checkBox_23.getText());
	      }
	   if (checkBox_24.isSelected()) {
	         Material.add(checkBox_24.getText());
	      }
	   if (checkBox_25.isSelected()) {
	         Material.add(checkBox_25.getText());
	      }
	   if (checkBox_26.isSelected()) {
	         Material.add(checkBox_26.getText());
	      }
	   if (checkBox_27.isSelected()) {
	         Material.add(checkBox_27.getText());
	      }
	   if (checkBox_28.isSelected()) {
	         Material.add(checkBox_28.getText());
	      }
	   if (checkBox_29.isSelected()) {
	         Material.add(checkBox_29.getText());
	      }
	   if (checkBox_30.isSelected()) {
	         Material.add(checkBox_30.getText());
	      }
	   if (checkBox_31.isSelected()) {
	         Material.add(checkBox_31.getText());
	      }
	   if (checkBox_32.isSelected()) {
	         Material.add(checkBox_32.getText());
	      }
	   if (checkBox_33.isSelected()) {
	         Material.add(checkBox_33.getText());
	      }
	   if (checkBox_34.isSelected()) {
	         Material.add(checkBox_34.getText());
	      }
	   if (checkBox_35.isSelected()) {
	         Material.add(checkBox_35.getText());
	      }
	   if (checkBox_36.isSelected()) {
	         Material.add(checkBox_36.getText());
	      }
	   if (checkBox_37.isSelected()) {
	         Material.add(checkBox_37.getText());
	      }
	   if (checkBox_38.isSelected()) {
	         Material.add(checkBox_38.getText());
	      }
	   if (checkBox_39.isSelected()) {
	         Material.add(checkBox_39.getText());
	      }
	   if (checkBox_40.isSelected()) {
	         Material.add(checkBox_40.getText());
	      }
	   if (checkBox_41.isSelected()) {
	         Material.add(checkBox_41.getText());
	      }
	   if (checkBox_42.isSelected()) {
	         Material.add(checkBox_42.getText());
	      }
   }

 
   public void SearchM(JCheckBox checkBox, JCheckBox checkBox_1, JCheckBox checkBox_2, JCheckBox checkBox_3,
	         JCheckBox checkBox_4, JCheckBox checkBox_5, JCheckBox checkBox_6, JCheckBox checkBox_7,
	         JCheckBox checkBox_8, JCheckBox checkBox_9, JCheckBox checkBox_10, JCheckBox checkBox_11,
	         JCheckBox checkBox_12, JCheckBox checkBox_13, JCheckBox checkBox_14, JCheckBox checkBox_15,
	         JCheckBox checkBox_16, JCheckBox checkBox_17, JCheckBox checkBox_18, JCheckBox checkBox_19,
	         JCheckBox checkBox_20, JCheckBox checkBox_21, JCheckBox checkBox_22, JCheckBox checkBox_23,
	         JCheckBox checkBox_24, JCheckBox checkBox_25, JCheckBox checkBox_26, JCheckBox checkBox_27,
	         JCheckBox checkBox_28, JCheckBox checkBox_29, JCheckBox checkBox_30, JCheckBox checkBox_31,
	         JCheckBox checkBox_32, JCheckBox checkBox_33, JCheckBox checkBox_34) {

	   if (checkBox.isSelected()) {
	         Material.add(checkBox.getText());
	      }
	   if (checkBox_1.isSelected()) {
	         Material.add(checkBox_1.getText());
	      }
	   if (checkBox_2.isSelected()) {
	         Material.add(checkBox_2.getText());
	      }
	   if (checkBox_3.isSelected()) {
	         Material.add(checkBox_3.getText());
	      }
	   if (checkBox_4.isSelected()) {
	         Material.add(checkBox_4.getText());
	      }
	   if (checkBox_5.isSelected()) {
	         Material.add(checkBox_5.getText());
	      }
	   if (checkBox_6.isSelected()) {
	         Material.add(checkBox_6.getText());
	      }
	   if (checkBox_7.isSelected()) {
	         Material.add(checkBox_7.getText());
	      }
	   if (checkBox_8.isSelected()) {
	         Material.add(checkBox_8.getText());
	      }
	   if (checkBox_9.isSelected()) {
	         Material.add(checkBox_9.getText());
	      }
	   if (checkBox_10.isSelected()) {
	         Material.add(checkBox_10.getText());
	      }
	   if (checkBox_11.isSelected()) {
	         Material.add(checkBox_11.getText());
	      }
	   if (checkBox_12.isSelected()) {
	         Material.add(checkBox_12.getText());
	      }
	   if (checkBox_13.isSelected()) {
	         Material.add(checkBox_13.getText());
	      }
	   if (checkBox_14.isSelected()) {
	         Material.add(checkBox_14.getText());
	      }
	   if (checkBox_15.isSelected()) {
	         Material.add(checkBox_15.getText());
	      }
	   if (checkBox_16.isSelected()) {
	         Material.add(checkBox_16.getText());
	      }
	   if (checkBox_17.isSelected()) {
	         Material.add(checkBox_17.getText());
	      }
	   if (checkBox_18.isSelected()) {
	         Material.add(checkBox_18.getText());
	      }
	   if (checkBox_19.isSelected()) {
	         Material.add(checkBox_19.getText());
	      }
	   if (checkBox_20.isSelected()) {
	         Material.add(checkBox_20.getText());
	      }
	   if (checkBox_21.isSelected()) {
	         Material.add(checkBox_21.getText());
	      }
	   if (checkBox_22.isSelected()) {
	         Material.add(checkBox_22.getText());
	      }
	   if (checkBox_23.isSelected()) {
	         Material.add(checkBox_23.getText());
	      }
	   if (checkBox_24.isSelected()) {
	         Material.add(checkBox_24.getText());
	      }
	   if (checkBox_25.isSelected()) {
	         Material.add(checkBox_25.getText());
	      }
	   if (checkBox_26.isSelected()) {
	         Material.add(checkBox_26.getText());
	      }
	   if (checkBox_27.isSelected()) {
	         Material.add(checkBox_27.getText());
	      }
	   if (checkBox_28.isSelected()) {
	         Material.add(checkBox_28.getText());
	      }
	   if (checkBox_29.isSelected()) {
	         Material.add(checkBox_29.getText());
	      }
	   if (checkBox_30.isSelected()) {
	         Material.add(checkBox_30.getText());
	      }
	   if (checkBox_31.isSelected()) {
	         Material.add(checkBox_31.getText());
	      }
	   if (checkBox_32.isSelected()) {
	         Material.add(checkBox_32.getText());
	      }
	   if (checkBox_33.isSelected()) {
	         Material.add(checkBox_33.getText());
	      }
	   if (checkBox_34.isSelected()) {
	         Material.add(checkBox_34.getText());
	      }
   }
   
   public void sumMaterialPrice() {
      allSumMaterialPrice = 0;
      int price = getPrice();
      allSumMaterialPrice += price;
      for (int i = 0; i < Material.size(); i++) {
         allSumMaterialPrice += cc.sumMaterial_SQL("select mat_price from material where mat_name = '" + Material.get(i) + "';");
      }
   }

   public Vector<String> isSearchM(Vector<String> vec) {
      int price = getPrice();
      ResultSet rset;
      int sumprice;
      int cookprice;
   
      rset = cc.makeDR_SQL("select f_name from cook where f_price between " + price + " and " + allSumMaterialPrice + ";");
      try {
         while (rset.next()) {
            fName.add(rset.getString(1));
            
         }
         for (int i = 0; i < fName.size(); i++) {
            sumprice = 0;
            for (int j = 0; j < Material.size(); j++) {
               sumprice += cc.sumMaterial_SQL(fName.get(i), Material.get(j));
            }
            cookprice = cc.sumMaterial_SQL("select f_price from cook where f_name = '" + fName.get(i) + "';");
            
            if (price >= cookprice - sumprice) {
               if(!vec.contains(fName.get(i))){
                  vec.addElement(fName.get(i));
               }
            }
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }
      return vec;
   }

}