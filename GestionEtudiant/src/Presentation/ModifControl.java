package Presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.EtudiantDao;

public class ModifControl  implements ActionListener{
 AjoutIhm nn;             
           
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	 EtudiantDao dao =  new EtudiantDao();
        	 dao.modifiernote(nn.cin.getText());
}
    public ModifControl(AjoutIhm zz)
    	 {
    		 nn=zz;
    	 }	 
         }


