import java.util.ArrayList;
import javax.swing.*;

public class contactDataBase {
    static ArrayList<ContactDTO> contactList= new ArrayList<ContactDTO>();

    static {
    }

    public static boolean saveContact(ContactDTO contactDto){
        return contactList.add(contactDto);
    }
    
     //public void searchRecord (){
     //if(customerList.isEmpty()==false){
		// System.out.print("Ok");
    	// JOptionPane.showMessageDialog("Enter Name To Search.");    	 
       //for (int i=0; i< customerList.size(); i++){    	   
         //CustomerDTO s = (CustomerDTO)customerList.get(i);
            // if (stxtId.getText().equals(s.id)){
					//System.out.print("Ok1");
            	     //JOptionPane.showMessageDialog(null,customerList[i]<CustomerDTO>);      
                //}else{
          		//JOptionPane.showMessageDialog(null, "....SOrry ther is No any record ....");
          //}
      //}
  //}
//}
 
}
