import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.JLabel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class sqlGUI extends JFrame{

	DBConnector co = new DBConnector();
	private JTextField textField;
	
	public sqlGUI(){
		this.setVisible(true);
		this.setSize(1000,600);
	}

}
