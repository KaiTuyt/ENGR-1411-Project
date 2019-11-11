import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Hashtable;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class MapDisplay extends JFrame implements ActionListener{
	
	private static final int AMOUNT_OF_LOCATIONS = 8;

	// TODO: Finish implementing this...
	private static final long serialVersionUID = 1L;
	
	JPanel panel0 = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	JButton nextButton = new JButton("Next ->");
	JButton calcuclatebutton = new JButton("Calculate Distance");
	JTextField firstBox = new JTextField();
	JTextField secondBox = new JTextField();
	SpinnerNumberModel spinnerModel = new SpinnerNumberModel(3, 1, 10, 1);
	JSpinner spinner = new JSpinner(spinnerModel);
	JLabel title = new JLabel("Meeting Finder");
	HashMap<String, Point> locations = new HashMap<>();
	
	public MapDisplay(String header) {
		
		super(header);
		setSize(400, 400);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(5, 0));
		
		panel0.add(title);
		add(panel0);
		
		firstBox.setEditable(false);
		firstBox.setText("Insert the number of people:");
		panel1.add(firstBox);
		panel1.add(spinner);
		add(panel1);
		
		nextButton.addActionListener(this);
		panel2.add(nextButton);
		add(panel2);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}