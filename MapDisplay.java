import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
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

	private static int currentPage;
	private static int amountOfPeople;

	// TODO: Finish implementing this...
	private static final long serialVersionUID = 1L;

	JLabel title = new JLabel("<html><h2>Meeting Place Finder</h2></html>");
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
	Map m = new Map();
	Collection<String> locationsList = m.getCampusLocations().values();
	JComboBox locationsBox;
	JPanel personCoordinates;
	ArrayList<JPanel> personList;
	ArrayList<JComboBox> boxList;
	ArrayList<String> chosenLocations;
	JLabel personLabel;
	JPanel locationPanel = new JPanel();

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

		instructionBox.setVisible(true);
		instructionBox.setEditable(false);
		instructionBox.setText(
				"Welcome! This program will be able to determine, based on the amount of people, a location for everyone to meet at.");
		instructionPanel.add(instructionBox);
		this.add(instructionPanel);

		startButton.setVisible(true);
		startButton.addActionListener(this);
		buttonPanel.add(startButton);
		this.add(buttonPanel);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (currentPage == 1) { // Move to second page of inputs
			amountOfPeople = (Integer) spinner.getValue();

			this.setSize(600, 575);
			this.setVisible(true);
			this.setResizable(false);
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLayout(new GridLayout(amountOfPeople + 4, 0));

			titlePanel.add(title);
			this.add(titlePanel);

			locationsBox = new JComboBox(locationsList.toArray());

			instructionPanel.remove(spinner);
			instructionBox.setEditable(false);
			instructionBox.setText("Please insert each person's location on campus.");
			instructionPanel.add(instructionBox);
			this.add(instructionPanel);

			boxList = new ArrayList<JComboBox>();
			personList = new ArrayList<JPanel>();
			for (int i = 1; i <= amountOfPeople; i++) {
				personCoordinates = new JPanel();
				personLabel = new JLabel("<html><i>Person " + i + ": </i></hmtl>");

				locationsBox = new JComboBox(locationsList.toArray());

				personCoordinates.add(personLabel);
				personCoordinates.add(locationsBox);
				boxList.add(locationsBox);
				personList.add(personCoordinates);
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

			chosenLocations = new ArrayList<>();
			for (JComboBox box : boxList) {
				chosenLocations.add((String) box.getSelectedItem());
			}

			for (JPanel item : personList) {
				this.remove(item);
			}

			this.setSize(500, 450);
			this.setVisible(true);
			this.setResizable(false);
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLayout(new GridLayout(6, 0));

			titlePanel.add(title);
			this.add(titlePanel);

			instructionBox.setEditable(false);
			instructionBox.setText("This is the best meeting location for the group:");
			instructionBox.remove(spinner);
			instructionPanel.add(instructionBox);
			this.add(instructionPanel);

			Map map = new Map();
			double[][] coordinates = new double[amountOfPeople][2];
			for (int i = 0; i < amountOfPeople; i++) {
				String currentPersonLocation = chosenLocations.get(i);
				coordinates[i] = map.getKeyFromValue(currentPersonLocation);
			}
			
			double[] center = map.center(coordinates);
			String closestBuilding = map.closestBuilding(coordinates);
			
			JPanel panelPanel = new JPanel();
			JLabel bestLocation = new JLabel("<html><h2>" + closestBuilding + "</h2></html>");
			panelPanel.add(bestLocation);
			this.add(panelPanel);

			JLabel latLocation = new JLabel("Latitude: " + center[0]);
			locationPanel.add(latLocation);
			JLabel longLocation = new JLabel("Longitude: " + center[1]);
			locationPanel.add(longLocation);
			this.add(locationPanel);

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