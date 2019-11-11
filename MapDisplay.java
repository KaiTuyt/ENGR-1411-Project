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

public class MapDisplay extends JFrame implements ActionListener {

	private static final int AMOUNT_OF_LOCATIONS = 8;
	private static int currentPage;

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
	JLabel title = new JLabel("Meeting Place Finder");
	HashMap<String, Point> locations = new HashMap<>();

	public MapDisplay(String header) {

		super(header);
		currentPage = 1;

		if (currentPage == 1) {
			this.setSize(300, 300);
			this.setVisible(true);
			this.setResizable(false);
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLayout(new GridLayout(4, 0));

			panel0.add(title);
			this.add(panel0);

			firstBox.setEditable(false);
			firstBox.setText("Insert the number of people:");
			panel1.add(firstBox);
			panel1.add(spinner);
			this.add(panel1);

			nextButton.addActionListener(this);
			panel2.add(nextButton);
			this.add(panel2);
			secondBox.setEditable(false);
			secondBox.setText("" + currentPage);
			panel3.add(secondBox);
			this.add(panel3);
		}
		if (currentPage == 2) {
			this.setSize(400, 400);
			this.setVisible(true);
			this.setResizable(false);
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLayout(new GridLayout(3, 0));

			panel0.add(title);
			this.add(panel0);

			firstBox.setEditable(false);
			firstBox.setText("Insert the number of people:");
			panel1.add(firstBox);
			panel1.add(spinner);
			this.add(panel1);

			nextButton.addActionListener(this);
			panel2.add(nextButton);
			this.add(panel2);
			
			secondBox.setEditable(false);
			secondBox.setText("" + currentPage);
			panel3.add(secondBox);
			this.add(panel3);
		}
		if (currentPage == 3) {

		}

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (currentPage == 1) {
			currentPage = 2;
			secondBox.setText("" + currentPage);
		} else if (currentPage == 2) {
			currentPage = 3;
			secondBox.setText("" + currentPage);
		} else {
			currentPage = 1;
			secondBox.setText("" + currentPage);
		}
	}

}