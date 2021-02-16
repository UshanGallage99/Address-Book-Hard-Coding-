import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
class SaveContactForm extends JFrame {
	SaveContactForm(){
	  setSize(700,300); 
       setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        JPanel headerPanel= new JPanel();
        JLabel titleLabel= new JLabel("Address Book");
        titleLabel.setFont(new Font("Arial",Font.BOLD + Font.ITALIC,17));
        headerPanel.add(titleLabel);
        add("North",headerPanel);

        JPanel contentWrapPanel= new JPanel(new GridLayout(5,1,5,5));

        JPanel firstNamePanel= new JPanel(new GridLayout(1,2,0,0));
        JPanel lastNamePanel= new JPanel(new GridLayout(1,2,0,0));
        JPanel addressPanel= new JPanel(new GridLayout(1,2,0,0));
        JPanel contactPanel= new JPanel(new GridLayout(1,2,0,0));
        JPanel mailPanel= new JPanel(new GridLayout(1,2,0,0));

        JLabel lblfirstName= new JLabel("First Name");
        JTextField txtfirstName= new JTextField(15);

        JLabel lbllastName= new JLabel("Last Name");
        JTextField txtlastName= new JTextField(15);

        JLabel lblAddress= new JLabel("Address");
        JTextField txtAddress= new JTextField(15);

        JLabel lblContact= new JLabel("Contact");
        JTextField txtContact= new JTextField(15);
        
        JLabel lblemail= new JLabel("Email Address");
        JTextField txtemail= new JTextField(20);

        firstNamePanel.add(lblfirstName);
        firstNamePanel.add(txtfirstName);

        lastNamePanel.add(lbllastName);
        lastNamePanel.add(txtlastName);

        addressPanel.add(lblAddress);
        addressPanel.add(txtAddress);

        contactPanel.add(lblContact);
        contactPanel.add(txtContact);
        
        mailPanel.add(lblemail);
        mailPanel.add(txtemail);

        contentWrapPanel.add(firstNamePanel);
        contentWrapPanel.add(lastNamePanel);
        contentWrapPanel.add(addressPanel);
        contentWrapPanel.add(contactPanel);
        contentWrapPanel.add(mailPanel);
        add("Center",contentWrapPanel);

        JPanel btnPanel= new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton addToContact= new JButton("Add To Contact");
        addToContact.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                ContactDTO tempDTO= new ContactDTO(
                  txtfirstName.getText(),
                  txtlastName.getText(),
                  txtAddress.getText(),
                  txtContact.getText(),
                  txtemail.getText()
                  );

                System.out.println(tempDTO);

                if (contactDataBase.saveContact(tempDTO)){
					txtfirstName.setText("");
					txtlastName.setText("");
                    txtAddress.setText("");
                    txtContact.setText("");
					txtemail.setText("");
					JOptionPane.showMessageDialog(null,"Saved !");

                }else{
                    JOptionPane.showMessageDialog(null,"Try Again !");
                }
            }
        });

        btnPanel.add(addToContact);
        
        JButton searchContact=new JButton("Search Contact");
        searchContact.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				SearchContactForm sc=new SearchContactForm();
				sc.setVisible(true);	
			}
		});  
		btnPanel.add(searchContact); 
		 
		JButton updateContact=new JButton("Update Contact");
		updateContact.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				UpdateContactForm uc=new UpdateContactForm();
				uc.setVisible(true);	
			}
		}); 
        btnPanel.add(updateContact);
        
		JButton deleteContact=new JButton("Delete Contact");
		deleteContact.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				DeleteContactForm dc=new DeleteContactForm();
				dc.setVisible(true);	
			}
		}); 
        btnPanel.add(deleteContact);
        
		JButton viewContact=new JButton("View Contact");
		 viewContact.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				 ContactViewForm cv = new ContactViewForm();
				 cv.setVisible(true);	
			}
		});
		btnPanel.add(viewContact);
        add("South",btnPanel);
	}
}
class SearchContactForm extends JFrame {
	SearchContactForm(){
		setSize(500,175); 
		setTitle("Search Contact");
        setLocationRelativeTo(null); 

        JPanel headerPanel= new JPanel();
        JLabel stitleLabel= new JLabel("Search Contact");
        stitleLabel.setFont(new Font("Arial",Font.BOLD + Font.ITALIC,17));
        headerPanel.add(stitleLabel);
        add("North",headerPanel);

        JPanel contentsWrapPanel= new JPanel(new GridLayout(2,1,5,5));

        JPanel fnPanel= new JPanel(new GridLayout(1,2,0,0));
        JPanel lnPanel= new JPanel(new GridLayout(1,2,0,0));

        JLabel slblId= new JLabel("First Name");
        JTextField stxtId= new JTextField(15);

        JLabel slblName= new JLabel("Last Name");
        JTextField stxtName= new JTextField(15);

        fnPanel.add(slblId);
        fnPanel.add(stxtId);

        lnPanel.add(slblName);
        lnPanel.add(stxtName);
        
        contentsWrapPanel.add(fnPanel);
        contentsWrapPanel.add(lnPanel);
         
        add("Center",contentsWrapPanel);

        JPanel sbtnPanel= new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton search= new JButton("Search");
        search.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				JOptionPane.showMessageDialog(null,"Ready !");	
			}
		}); 
        sbtnPanel.add(search);
		add("South",sbtnPanel);
       }

}
class UpdateContactForm extends JFrame {
	UpdateContactForm(){
		setSize(500,200); 
		setTitle("Update Contact");
        setLocationRelativeTo(null);
         
        JPanel headerPanel= new JPanel();
        JLabel utitleLabel= new JLabel("Update Contact");
        utitleLabel.setFont(new Font("Arial",Font.BOLD + Font.ITALIC,17));
        headerPanel.add(utitleLabel);
        add("North",headerPanel);

        JPanel ucontentsWrapPanel= new JPanel(new GridLayout(3,1,5,5));

        JPanel fnPanel= new JPanel(new GridLayout(1,2,0,0));
        JPanel lnPanel= new JPanel(new GridLayout(1,2,0,0));
        JPanel ncPanel= new JPanel(new GridLayout(1,2,0,0));
 

        JLabel slblId= new JLabel("First Name");
        JTextField stxtId= new JTextField(15);

        JLabel slblName= new JLabel("Last Name");
        JTextField stxtName= new JTextField(15);
        
        JLabel newContact= new JLabel("New Contact");
        JTextField ntxtContact= new JTextField(15);

        fnPanel.add(slblId);
        fnPanel.add(stxtId);

        lnPanel.add(slblName);
        lnPanel.add(stxtName);
        
        ncPanel.add(newContact);
        ncPanel.add(ntxtContact);
        
        ucontentsWrapPanel.add(fnPanel);
        ucontentsWrapPanel.add(lnPanel);
        ucontentsWrapPanel.add(ncPanel);
         
        add("Center",ucontentsWrapPanel);

        JPanel ubtnPanel= new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton update= new JButton("Update");
        update.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				JOptionPane.showMessageDialog(null,"Updated !");	
			}
		}); 
        ubtnPanel.add(update);   
        add("South",ubtnPanel);
       }

}
class DeleteContactForm extends JFrame {
	DeleteContactForm(){
		setSize(500,175); 
		setTitle("Delete Contact");
        setLocationRelativeTo(null);
         

        JPanel headerPanel= new JPanel();
        JLabel stitleLabel= new JLabel("Delete Contact");
        stitleLabel.setFont(new Font("Arial",Font.BOLD + Font.ITALIC,17));
        headerPanel.add(stitleLabel);
        add("North",headerPanel);

        JPanel dcontentsWrapPanel= new JPanel(new GridLayout(2,1,5,5));

        JPanel fnPanel= new JPanel(new GridLayout(1,2,0,0));
        JPanel lnPanel= new JPanel(new GridLayout(1,2,0,0));

        JLabel slblId= new JLabel("First Name");
        JTextField stxtId= new JTextField(15);

        JLabel slblName= new JLabel("Last Name");
        JTextField stxtName= new JTextField(15);

        fnPanel.add(slblId);
        fnPanel.add(stxtId);

        lnPanel.add(slblName);
        lnPanel.add(stxtName);
        
        dcontentsWrapPanel.add(fnPanel);
        dcontentsWrapPanel.add(lnPanel);
         
        add("Center",dcontentsWrapPanel);

        JPanel dbtnPanel= new JPanel(new FlowLayout(FlowLayout.RIGHT));
        

        JButton delete= new JButton("Delete");
		delete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				JOptionPane.showMessageDialog(null,"Deleted !");	
			}
		}); 
        dbtnPanel.add(delete);
        add("South",dbtnPanel);
       }

}
class ContactViewForm extends JFrame {
	ContactViewForm(){
		setSize(500, 300);
		setLocationRelativeTo(null);
		setTitle("Contact List"); 
		
		 String[] header= new String[]{"First Name","Last Name","Address","Contact","Email Address"};
		 DefaultTableModel dtm= new DefaultTableModel(header,0);
         JTable tbl= new JTable(dtm);
         JScrollPane p= new JScrollPane(tbl);
         add("Center",p);
		 tbl.setModel(dtm);
         dtm.setColumnIdentifiers(header);   
 
			for(ContactDTO tempDTO:contactDataBase.contactList){
                  dtm.addRow(new String[]{tempDTO.getFirstName(),tempDTO.getLastName(),tempDTO.getAddress(),tempDTO.getContact(),tempDTO.getEmail()});
              }
	}
}
class Demo{
    public static void main(String[] args) {

        SaveContactForm form= new SaveContactForm();
		form.setVisible(true);
 

    }
}
