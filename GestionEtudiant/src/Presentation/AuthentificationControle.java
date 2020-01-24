package Presentation;

                   
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AuthentificationControle implements ActionListener{
AuthentificationIhm s;
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Merci tous le monde  "  + s.log.getText());
		
		authentificationdao aa  = new authentificationdao();
		
		
				if (aa.login(s.log.getText(), s.pas.getText()))
					
		{
					s.msg.setText("Succes");
			s.msg.setForeground(Color.GREEN);
			s.pas.setText("");
			AjoutIhm oo = new AjoutIhm();
		}
		else {
			s.msg.setForeground(Color.RED);
			s.msg.setText("Failed");
		}
	}
    public AuthentificationControle(AuthentificationIhm e) {
	     s = e;

}
}
