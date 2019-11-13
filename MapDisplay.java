import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
	private static int amountOfPeople;

	// TODO: Finish implementing this...
	private static final long serialVersionUID = 1L;

	JPanel titlePanel = new JPanel();
	JPanel instructionPanel = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel pageNumberPanel = new JPanel();
	JPanel coordinatesPanel = new JPanel();
	JButton startButton = new JButton("Start!");
	JButton nextButton = new JButton("Next ->");
	JButton calculateButton = new JButton("Calculate Distance");
	JButton quitButton = new JButton("Quit Program");
	JTextField instructionBox = new JTextField();
	JTextField pageNumber = new JTextField();
	SpinnerNumberModel spinnerModel = new SpinnerNumberModel(3, 1, 10, 1);
	JSpinner spinner = new JSpinner(spinnerModel);
	JLabel title = new JLabel("Meeting Place Finder");
	HashMap<String, Point> locations = new HashMap<>();
	JPanel field;
	ArrayList<JPanel> fields;
	JTextField person;

	public MapDisplay(String header) {
		
		//Use html
		
		super(header);
		currentPage = 0;
		
		this.setSize(700, 200);
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(3, 0));
		
		titlePanel.add(title);
		this.add(titlePanel);
		
		instructionBox.setEditable(false);
		instructionBox.setText("Welcome! This program will be able to determine, based on the amount of people, a location for everyone to meet at.");
		instructionPanel.add(instructionBox);
		this.add(instructionPanel);
		
		startButton.addActionListener(this);
		panel2.add(startButton);
		this.add(panel2);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (currentPage == 1) { //Move to second page of inputs
			amountOfPeople = (Integer)spinner.getValue();
			this.setSize(800, 500);
			this.setVisible(true);
			this.setResizable(false);
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLayout(new GridLayout(amountOfPeople + 4, 0));

			titlePanel.add(title);
			this.add(titlePanel);

			instructionPanel.remove(spinner);
			instructionBox.setEditable(false);
			instructionBox.setText("Insert the coordinates of each person:");
			instructionPanel.add(instructionBox);
			this.add(instructionPanel);
			
			fields = new ArrayList<JPanel>();
			for (int i = 1; i <= amountOfPeople; i++) {
				field = new JPanel();
				person = new JTextField();
				person.setText("Person " + i + ": ");
				person.setEditable(false);
				JTextField coordinates = new JTextField();
				coordinates.setEditable(true);
				coordinates.setColumns(20);
				field.add(person);
				field.add(coordinates);
				fields.add(field);
				this.add(field);
			}

			panel2.remove(nextButton);
			calculateButton.addActionListener(this);
			panel2.add(calculateButton);
			this.add(panel2);

			pageNumber.setEditable(false);
			currentPage = 2;
			pageNumber.setText("" + currentPage);
			pageNumberPanel.add(pageNumber);
			this.add(pageNumberPanel);

		} else if (currentPage == 2) { //Move to output page
			
			for (JPanel item: fields) {
				this.remove(item);
			}
			
			this.setSize(600, 450);
			this.setVisible(true);
			this.setResizable(false);
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLayout(new GridLayout(4, 0));

			titlePanel.add(title);
			this.add(titlePanel);

			instructionBox.setEditable(false);
			instructionBox.setText("This is the best meeting location for the group:");
			instructionBox.remove(spinner);
			instructionPanel.add(instructionBox);
			this.add(instructionPanel);

			panel2.remove(calculateButton);
			quitButton.addActionListener(this);
			panel2.add(quitButton);
			this.add(panel2);

			pageNumber.setEditable(false);
			currentPage = 3;
			pageNumber.setText("" + currentPage);
			pageNumberPanel.add(pageNumber);
			this.add(pageNumberPanel);

		} else if (currentPage == 0) { //Move to first page of inputs
			this.setSize(300, 300);
			this.setVisible(true);
			this.setResizable(false);
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLayout(new GridLayout(4, 0));

			titlePanel.add(title);
			this.add(titlePanel);

			instructionBox.setEditable(false);
			instructionBox.setText("Insert the number of people:");
			instructionPanel.add(instructionBox);
			instructionPanel.add(spinner);
			this.add(instructionPanel);

			panel2.remove(startButton);
			nextButton.addActionListener(this);
			panel2.add(nextButton);
			this.add(panel2);
			
			pageNumber.setEditable(false);
			currentPage = 1;
			pageNumber.setText("" + currentPage);
			pageNumberPanel.add(pageNumber);
			this.add(pageNumberPanel);
		} else if (currentPage == 3) {
			this.dispose();
		}
	}

}