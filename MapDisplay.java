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
	JPanel buttonPanel = new JPanel();
	JPanel pageNumberPanel = new JPanel();
	JPanel coordinatesPanel = new JPanel();
	JPanel errorPanel = new JPanel();
	JLabel errorStatus = new JLabel();
	JButton startButton = new JButton("Start!");
	JButton nextButton = new JButton("Next ->");
	JButton calculateButton = new JButton("Calculate Distance");
	JButton quitButton = new JButton("Quit Program");
	JTextField instructionBox = new JTextField();
	JLabel pageNumber = new JLabel();
	SpinnerNumberModel spinnerModel = new SpinnerNumberModel(3, 1, 10, 1);
	JSpinner spinner = new JSpinner(spinnerModel);
	JLabel title = new JLabel("<html><h2>Meeting Place Finder</h2></html>");
	HashMap<String, Point> locations = new HashMap<>();
	JPanel personCoordinates;
	ArrayList<JPanel> personCoordinatesList;
	JLabel personLabel;
	JTextField latitude;
	JTextField latCoordinates;
	JTextField longitude;
	JTextField longCoordinates;

	public MapDisplay(String header) {

		// NOTE: Use <html> to make stuff look fancy :)

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
		instructionBox.setText(
				"Welcome! This program will be able to determine, based on the amount of people, a location for everyone to meet at.");
		instructionPanel.add(instructionBox);
		this.add(instructionPanel);

		startButton.addActionListener(this);
		buttonPanel.add(startButton);
		this.add(buttonPanel);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (currentPage == 1) { // Move to second page of inputs
			amountOfPeople = (Integer) spinner.getValue();

			this.setSize(800, 575);
			this.setVisible(true);
			this.setResizable(false);
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLayout(new GridLayout(amountOfPeople + 4, 0));

			titlePanel.add(title);
			this.add(titlePanel);

			instructionPanel.remove(spinner);
			instructionBox.setEditable(false);
			instructionBox.setText("Insert the coordinates of each person.");
			instructionPanel.add(instructionBox);
			this.add(instructionPanel);

			personCoordinatesList = new ArrayList<JPanel>();
			for (int i = 1; i <= amountOfPeople; i++) {
				personCoordinates = new JPanel();
				personLabel = new JLabel("<html><i>Person " + i + ": </i></hmtl>");

				latitude = new JTextField("Latitude: ");
				latitude.setEditable(false);

				latCoordinates = new JTextField();
				latCoordinates.setEditable(true);
				latCoordinates.setColumns(20);

				longitude = new JTextField("Longitude: ");
				longitude.setEditable(false);

				longCoordinates = new JTextField();
				longCoordinates.setEditable(true);
				longCoordinates.setColumns(20);

				personCoordinates.add(personLabel);
				personCoordinates.add(latitude);
				personCoordinates.add(latCoordinates);
				personCoordinates.add(longitude);
				personCoordinates.add(longCoordinates);
				personCoordinatesList.add(personCoordinates);

				this.add(personCoordinates);
			}

			buttonPanel.remove(nextButton);
			calculateButton.addActionListener(this);
			buttonPanel.add(calculateButton);
			this.add(buttonPanel);

			currentPage = 2;
			pageNumber.setText("" + currentPage);
			pageNumberPanel.add(pageNumber);
			this.add(pageNumberPanel);

		} else if (currentPage == 2) { // Move to output page

			int count = 0;
			for (JPanel item : personCoordinatesList) {
				Point p = new Point();
				try {
					p.setLocation(Double.valueOf(latCoordinates.getText()), Double.valueOf(longCoordinates.getText()));
				} catch (Exception E) { //Incorrect formatting

					this.setSize(300, 300);
					this.setVisible(true);
					this.setResizable(false);
					this.setLocationRelativeTo(null);
					this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					this.setLayout(new GridLayout(4, 0));

					titlePanel.add(title);
					this.add(titlePanel);
					
				}
				locations.put("Person " + ++count, p);
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

			buttonPanel.remove(calculateButton);
			quitButton.addActionListener(this);
			buttonPanel.add(quitButton);
			this.add(buttonPanel);

			currentPage = 3;
			pageNumber.setText("" + currentPage);
			pageNumberPanel.add(pageNumber);
			this.add(pageNumberPanel);

		} else if (currentPage == 0) { // Move to first page of inputs

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

			buttonPanel.remove(startButton);
			nextButton.addActionListener(this);
			buttonPanel.add(nextButton);
			this.add(buttonPanel);

			currentPage = 1;
			pageNumber.setText("" + currentPage);
			pageNumberPanel.add(pageNumber);
			this.add(pageNumberPanel);

		} else if (currentPage == 3) { // Quit program
			this.dispose();
		}
	}

}