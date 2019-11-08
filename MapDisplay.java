import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MapDisplay extends JFrame{
	
	// TODO: Finish implementing this...
	private static final long serialVersionUID = 1L;
	
	JPanel panel0 = new JPanel();
	JButton button = new JButton("Calculate Distance");
	JTextField firstBox = new JTextField(5);
	JTextField secondBox = new JTextField(5);
	SpinnerNumberModel spinnerModel = new SpinnerNumberModel(10, 0, 100, 1);
	JSpinner spinner = new JSpinner(spinnerModel);
	
	public MapDisplay(String title) {
		super(title);
		setSize(400, 400);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}