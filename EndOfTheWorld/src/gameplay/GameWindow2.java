package gameplay;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextArea;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameWindow2 {

	private  JFrame frame;
	
	private static int[][] layout = new int[3][7];
	private static int placeholder = -2;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	private static void initialSetup(){		//method to setup the playing board
		for (int i=0; i<7; i++){
			layout[0][i] = 1; 
		}
		for (int i=0; i<7; i++){
			layout[2][i] = 1;
		}
		
		layout[1][0] = -1;
		layout[1][1] = 0;
		for (int i=2; i<7; i++){
			layout[1][i] = 1;
		}		
	}
	
	private void endTurn(){			//moves the game tiles at the end of a turn
		for (int i=6; i>0; i--){
			layout[1][i]=layout[1][i-1];
		}
		layout[1][0] = 1;
		
//		frame.invalidate();
//		frame.validate();
//		frame.repaint();
		
		for (int i=0; i<3; i++){
			for (int j=0; j<7; j++){
				System.out.print(layout[i][j]);
			}
			System.out.println("");
		}
	}
	
	private static String getTileText(int i){
		if (i == 0){
			return "ShipF";
		}else	
		if (i == -1){
			return "ShipB";
		}else
		if (i == 1){
			return "Open";
		}else
		if (i == 2){
			return "Mine";
		}else
		if (i == 3){
			return "Supply";
		}else{
			return "Null";
		}		
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				initialSetup();								//creates the initial board layout
				try {
					GameWindow2 window = new GameWindow2();
					window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
				}
			}	
		});
	}

	/**
	 * Create the application.
	 */
	public GameWindow2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private  void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 632, 383);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JTextArea textArea = new JTextArea();
		//Tile tile00 = new Tile(layout[0][0]);
		//textArea.setText(tile00.Label());
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.gridx = 0;
		gbc_textArea.gridy = 0;
		textArea.setText(getTileText(layout[0][0]));
		frame.getContentPane().add(textArea, gbc_textArea);
		
		JTextArea textArea_1 = new JTextArea();
		Tile tile01 = new Tile(layout[0][1]);
		textArea_1.setText(tile01.Label());
		GridBagConstraints gbc_textArea_1 = new GridBagConstraints();
		gbc_textArea_1.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_1.gridx = 1;
		gbc_textArea_1.gridy = 0;
		frame.getContentPane().add(textArea_1, gbc_textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		Tile tile02 = new Tile(layout[0][2]);
		textArea_2.setText(tile02.Label());
		GridBagConstraints gbc_textArea_2 = new GridBagConstraints();
		gbc_textArea_2.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_2.gridx = 2;
		gbc_textArea_2.gridy = 0;
		frame.getContentPane().add(textArea_2, gbc_textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		Tile tile03 = new Tile(layout[0][3]);
		textArea_3.setText(tile03.Label());
		GridBagConstraints gbc_textArea_3 = new GridBagConstraints();
		gbc_textArea_3.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_3.gridx = 3;
		gbc_textArea_3.gridy = 0;
		frame.getContentPane().add(textArea_3, gbc_textArea_3);
		
		JTextArea textArea_4 = new JTextArea();
		Tile tile04 = new Tile(layout[0][4]);
		textArea_4.setText(tile04.Label());
		GridBagConstraints gbc_textArea_4 = new GridBagConstraints();
		gbc_textArea_4.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_4.gridx = 4;
		gbc_textArea_4.gridy = 0;
		frame.getContentPane().add(textArea_4, gbc_textArea_4);
		
		JTextArea textArea_5 = new JTextArea();
		Tile tile05 = new Tile(layout[0][5]);
		textArea_5.setText(tile05.Label());
		GridBagConstraints gbc_textArea_5 = new GridBagConstraints();
		gbc_textArea_5.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_5.gridx = 5;
		gbc_textArea_5.gridy = 0;
		frame.getContentPane().add(textArea_5, gbc_textArea_5);
		
		JTextArea textArea_6 = new JTextArea();
		Tile tile06 = new Tile(layout[0][6]);
		textArea_6.setText(tile06.Label());
		GridBagConstraints gbc_textArea_6 = new GridBagConstraints();
		gbc_textArea_6.insets = new Insets(0, 0, 5, 0);
		gbc_textArea_6.gridx = 6;
		gbc_textArea_6.gridy = 0;
		frame.getContentPane().add(textArea_6, gbc_textArea_6);
		
		JTextArea textArea_7 = new JTextArea();
		//Tile tile07 = new Tile(layout[1][0]);
		//textArea_7.setText(tile07.Label());
		GridBagConstraints gbc_textArea_7 = new GridBagConstraints();
		gbc_textArea_7.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_7.gridx = 0;
		gbc_textArea_7.gridy = 1;
		textArea_7.setText(getTileText(layout[1][0]));
		frame.getContentPane().add(textArea_7, gbc_textArea_7);
		
		JTextArea textArea_8 = new JTextArea();
		Tile tile08 = new Tile(layout[1][1]);
		textArea_8.setText(tile08.Label());
		GridBagConstraints gbc_textArea_8 = new GridBagConstraints();
		gbc_textArea_8.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_8.gridx = 1;
		gbc_textArea_8.gridy = 1;
		frame.getContentPane().add(textArea_8, gbc_textArea_8);
		
		JTextArea textArea_9 = new JTextArea();
		Tile tile09 = new Tile(layout[1][2]);
		textArea_9.setText(tile09.Label());
		GridBagConstraints gbc_textArea_9 = new GridBagConstraints();
		gbc_textArea_9.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_9.gridx = 2;
		gbc_textArea_9.gridy = 1;
		frame.getContentPane().add(textArea_9, gbc_textArea_9);
		
		JTextArea textArea_10 = new JTextArea();
		Tile tile10 = new Tile(layout[1][3]);
		textArea_10.setText(tile10.Label());
		GridBagConstraints gbc_textArea_10 = new GridBagConstraints();
		gbc_textArea_10.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_10.gridx = 3;
		gbc_textArea_10.gridy = 1;
		frame.getContentPane().add(textArea_10, gbc_textArea_10);
		
		JTextArea textArea_11 = new JTextArea();
		Tile tile11 = new Tile(layout[1][4]);
		textArea_11.setText(tile11.Label());
		GridBagConstraints gbc_textArea_11 = new GridBagConstraints();
		gbc_textArea_11.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_11.gridx = 4;
		gbc_textArea_11.gridy = 1;
		frame.getContentPane().add(textArea_11, gbc_textArea_11);
		
		JTextArea textArea_12 = new JTextArea();
		Tile tile12 = new Tile(layout[1][5]);
		textArea_12.setText(tile12.Label());
		GridBagConstraints gbc_textArea_12 = new GridBagConstraints();
		gbc_textArea_12.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_12.gridx = 5;
		gbc_textArea_12.gridy = 1;
		frame.getContentPane().add(textArea_12, gbc_textArea_12);
		
		JTextArea textArea_13 = new JTextArea();
		Tile tile13 = new Tile(layout[1][6]);
		textArea_13.setText(tile13.Label());
		GridBagConstraints gbc_textArea_13 = new GridBagConstraints();
		gbc_textArea_13.insets = new Insets(0, 0, 5, 0);
		gbc_textArea_13.gridx = 6;
		gbc_textArea_13.gridy = 1;
		frame.getContentPane().add(textArea_13, gbc_textArea_13);
		
		JTextArea textArea_14 = new JTextArea();
		Tile tile14 = new Tile(layout[2][0]);
		textArea_14.setText(tile14.Label());
		GridBagConstraints gbc_textArea_14 = new GridBagConstraints();
		gbc_textArea_14.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_14.gridx = 0;
		gbc_textArea_14.gridy = 2;
		frame.getContentPane().add(textArea_14, gbc_textArea_14);
		
		JTextArea textArea_15 = new JTextArea();
		Tile tile15 = new Tile(layout[2][1]);
		textArea_15.setText(tile15.Label());
		GridBagConstraints gbc_textArea_15 = new GridBagConstraints();
		gbc_textArea_15.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_15.gridx = 1;
		gbc_textArea_15.gridy = 2;
		frame.getContentPane().add(textArea_15, gbc_textArea_15);
		
		JTextArea textArea_16 = new JTextArea();
		Tile tile16 = new Tile(layout[2][2]);
		textArea_16.setText(tile16.Label());
		GridBagConstraints gbc_textArea_16 = new GridBagConstraints();
		gbc_textArea_16.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_16.gridx = 2;
		gbc_textArea_16.gridy = 2;
		frame.getContentPane().add(textArea_16, gbc_textArea_16);
		
		JTextArea textArea_17 = new JTextArea();
		Tile tile17 = new Tile(layout[2][3]);
		textArea_17.setText(tile17.Label());
		GridBagConstraints gbc_textArea_17 = new GridBagConstraints();
		gbc_textArea_17.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_17.gridx = 3;
		gbc_textArea_17.gridy = 2;
		frame.getContentPane().add(textArea_17, gbc_textArea_17);
		
		JTextArea textArea_18 = new JTextArea();
		Tile tile18 = new Tile(layout[2][4]);
		textArea_18.setText(tile18.Label());
		GridBagConstraints gbc_textArea_18 = new GridBagConstraints();
		gbc_textArea_18.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_18.gridx = 4;
		gbc_textArea_18.gridy = 2;
		frame.getContentPane().add(textArea_18, gbc_textArea_18);
		
		JTextArea textArea_19 = new JTextArea();
		Tile tile19 = new Tile(layout[2][5]);
		textArea_19.setText(tile19.Label());
		GridBagConstraints gbc_textArea_19 = new GridBagConstraints();
		gbc_textArea_19.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_19.gridx = 5;
		gbc_textArea_19.gridy = 2;
		frame.getContentPane().add(textArea_19, gbc_textArea_19);
		
		JTextArea textArea_20 = new JTextArea();
		Tile tile20 = new Tile(layout[2][6]);
		textArea_20.setText(tile20.Label());
		GridBagConstraints gbc_textArea_20 = new GridBagConstraints();
		gbc_textArea_20.insets = new Insets(0, 0, 5, 0);
		gbc_textArea_20.gridx = 6;
		gbc_textArea_20.gridy = 2;
		frame.getContentPane().add(textArea_20, gbc_textArea_20);
		
		JButton btnEndTurn = new JButton("End Turn");
		btnEndTurn.addActionListener(new CustomActionListener());
		GridBagConstraints gbc_btnEndTurn = new GridBagConstraints();
		gbc_btnEndTurn.gridheight = 2;
		gbc_btnEndTurn.gridwidth = 3;
		gbc_btnEndTurn.insets = new Insets(0, 0, 5, 5);
		gbc_btnEndTurn.gridx = 2;
		gbc_btnEndTurn.gridy = 6;
		frame.getContentPane().add(btnEndTurn, gbc_btnEndTurn);
	}
	private void i() {
		frame.setBounds(100, 100, 632, 383);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JTextArea textArea = new JTextArea();
		Tile tile00 = new Tile(layout[0][0]);
		textArea.setText(tile00.Label());
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.gridx = 0;
		gbc_textArea.gridy = 0;
		frame.getContentPane().add(textArea, gbc_textArea);
		
		JTextArea textArea_1 = new JTextArea();
		Tile tile01 = new Tile(layout[0][1]);
		textArea_1.setText(tile01.Label());
		GridBagConstraints gbc_textArea_1 = new GridBagConstraints();
		gbc_textArea_1.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_1.gridx = 1;
		gbc_textArea_1.gridy = 0;
		frame.getContentPane().add(textArea_1, gbc_textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		Tile tile02 = new Tile(layout[0][2]);
		textArea_2.setText(tile02.Label());
		GridBagConstraints gbc_textArea_2 = new GridBagConstraints();
		gbc_textArea_2.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_2.gridx = 2;
		gbc_textArea_2.gridy = 0;
		frame.getContentPane().add(textArea_2, gbc_textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		Tile tile03 = new Tile(layout[0][3]);
		textArea_3.setText(tile03.Label());
		GridBagConstraints gbc_textArea_3 = new GridBagConstraints();
		gbc_textArea_3.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_3.gridx = 3;
		gbc_textArea_3.gridy = 0;
		frame.getContentPane().add(textArea_3, gbc_textArea_3);
		
		JTextArea textArea_4 = new JTextArea();
		Tile tile04 = new Tile(layout[0][4]);
		textArea_4.setText(tile04.Label());
		GridBagConstraints gbc_textArea_4 = new GridBagConstraints();
		gbc_textArea_4.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_4.gridx = 4;
		gbc_textArea_4.gridy = 0;
		frame.getContentPane().add(textArea_4, gbc_textArea_4);
		
		JTextArea textArea_5 = new JTextArea();
		Tile tile05 = new Tile(layout[0][5]);
		textArea_5.setText(tile05.Label());
		GridBagConstraints gbc_textArea_5 = new GridBagConstraints();
		gbc_textArea_5.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_5.gridx = 5;
		gbc_textArea_5.gridy = 0;
		frame.getContentPane().add(textArea_5, gbc_textArea_5);
		
		JTextArea textArea_6 = new JTextArea();
		Tile tile06 = new Tile(layout[0][6]);
		textArea_6.setText(tile06.Label());
		GridBagConstraints gbc_textArea_6 = new GridBagConstraints();
		gbc_textArea_6.insets = new Insets(0, 0, 5, 0);
		gbc_textArea_6.gridx = 6;
		gbc_textArea_6.gridy = 0;
		frame.getContentPane().add(textArea_6, gbc_textArea_6);
		
		JTextArea textArea_7 = new JTextArea();
		Tile tile07 = new Tile(layout[1][0]);
		textArea_7.setText(tile07.Label());
		GridBagConstraints gbc_textArea_7 = new GridBagConstraints();
		gbc_textArea_7.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_7.gridx = 0;
		gbc_textArea_7.gridy = 1;
		frame.getContentPane().add(textArea_7, gbc_textArea_7);
		
		JTextArea textArea_8 = new JTextArea();
		Tile tile08 = new Tile(layout[1][1]);
		textArea_8.setText(tile08.Label());
		GridBagConstraints gbc_textArea_8 = new GridBagConstraints();
		gbc_textArea_8.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_8.gridx = 1;
		gbc_textArea_8.gridy = 1;
		frame.getContentPane().add(textArea_8, gbc_textArea_8);
		
		JTextArea textArea_9 = new JTextArea();
		Tile tile09 = new Tile(layout[1][2]);
		textArea_9.setText(tile09.Label());
		GridBagConstraints gbc_textArea_9 = new GridBagConstraints();
		gbc_textArea_9.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_9.gridx = 2;
		gbc_textArea_9.gridy = 1;
		frame.getContentPane().add(textArea_9, gbc_textArea_9);
		
		JTextArea textArea_10 = new JTextArea();
		Tile tile10 = new Tile(layout[1][3]);
		textArea_10.setText(tile10.Label());
		GridBagConstraints gbc_textArea_10 = new GridBagConstraints();
		gbc_textArea_10.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_10.gridx = 3;
		gbc_textArea_10.gridy = 1;
		frame.getContentPane().add(textArea_10, gbc_textArea_10);
		
		JTextArea textArea_11 = new JTextArea();
		Tile tile11 = new Tile(layout[1][4]);
		textArea_11.setText(tile11.Label());
		GridBagConstraints gbc_textArea_11 = new GridBagConstraints();
		gbc_textArea_11.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_11.gridx = 4;
		gbc_textArea_11.gridy = 1;
		frame.getContentPane().add(textArea_11, gbc_textArea_11);
		
		JTextArea textArea_12 = new JTextArea();
		Tile tile12 = new Tile(layout[1][5]);
		textArea_12.setText(tile12.Label());
		GridBagConstraints gbc_textArea_12 = new GridBagConstraints();
		gbc_textArea_12.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_12.gridx = 5;
		gbc_textArea_12.gridy = 1;
		frame.getContentPane().add(textArea_12, gbc_textArea_12);
		
		JTextArea textArea_13 = new JTextArea();
		Tile tile13 = new Tile(layout[1][6]);
		textArea_13.setText(tile13.Label());
		GridBagConstraints gbc_textArea_13 = new GridBagConstraints();
		gbc_textArea_13.insets = new Insets(0, 0, 5, 0);
		gbc_textArea_13.gridx = 6;
		gbc_textArea_13.gridy = 1;
		frame.getContentPane().add(textArea_13, gbc_textArea_13);
		
		JTextArea textArea_14 = new JTextArea();
		Tile tile14 = new Tile(layout[2][0]);
		textArea_14.setText(tile14.Label());
		GridBagConstraints gbc_textArea_14 = new GridBagConstraints();
		gbc_textArea_14.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_14.gridx = 0;
		gbc_textArea_14.gridy = 2;
		frame.getContentPane().add(textArea_14, gbc_textArea_14);
		
		JTextArea textArea_15 = new JTextArea();
		Tile tile15 = new Tile(layout[2][1]);
		textArea_15.setText(tile15.Label());
		GridBagConstraints gbc_textArea_15 = new GridBagConstraints();
		gbc_textArea_15.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_15.gridx = 1;
		gbc_textArea_15.gridy = 2;
		frame.getContentPane().add(textArea_15, gbc_textArea_15);
		
		JTextArea textArea_16 = new JTextArea();
		Tile tile16 = new Tile(layout[2][2]);
		textArea_16.setText(tile16.Label());
		GridBagConstraints gbc_textArea_16 = new GridBagConstraints();
		gbc_textArea_16.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_16.gridx = 2;
		gbc_textArea_16.gridy = 2;
		frame.getContentPane().add(textArea_16, gbc_textArea_16);
		
		JTextArea textArea_17 = new JTextArea();
		Tile tile17 = new Tile(layout[2][3]);
		textArea_17.setText(tile17.Label());
		GridBagConstraints gbc_textArea_17 = new GridBagConstraints();
		gbc_textArea_17.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_17.gridx = 3;
		gbc_textArea_17.gridy = 2;
		frame.getContentPane().add(textArea_17, gbc_textArea_17);
		
		JTextArea textArea_18 = new JTextArea();
		Tile tile18 = new Tile(layout[2][4]);
		textArea_18.setText(tile18.Label());
		GridBagConstraints gbc_textArea_18 = new GridBagConstraints();
		gbc_textArea_18.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_18.gridx = 4;
		gbc_textArea_18.gridy = 2;
		frame.getContentPane().add(textArea_18, gbc_textArea_18);
		
		JTextArea textArea_19 = new JTextArea();
		Tile tile19 = new Tile(layout[2][5]);
		textArea_19.setText(tile19.Label());
		GridBagConstraints gbc_textArea_19 = new GridBagConstraints();
		gbc_textArea_19.insets = new Insets(0, 0, 5, 5);
		gbc_textArea_19.gridx = 5;
		gbc_textArea_19.gridy = 2;
		frame.getContentPane().add(textArea_19, gbc_textArea_19);
		
		JTextArea textArea_20 = new JTextArea();
		Tile tile20 = new Tile(layout[2][6]);
		textArea_20.setText(tile20.Label());
		GridBagConstraints gbc_textArea_20 = new GridBagConstraints();
		gbc_textArea_20.insets = new Insets(0, 0, 5, 0);
		gbc_textArea_20.gridx = 6;
		gbc_textArea_20.gridy = 2;
		frame.getContentPane().add(textArea_20, gbc_textArea_20);
		
		JButton btnEndTurn = new JButton("End Turn");
		btnEndTurn.addActionListener(new CustomActionListener());
		GridBagConstraints gbc_btnEndTurn = new GridBagConstraints();
		gbc_btnEndTurn.gridheight = 2;
		gbc_btnEndTurn.gridwidth = 3;
		gbc_btnEndTurn.insets = new Insets(0, 0, 5, 5);
		gbc_btnEndTurn.gridx = 2;
		gbc_btnEndTurn.gridy = 6;
		frame.getContentPane().add(btnEndTurn, gbc_btnEndTurn);
	}

	class CustomActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			endTurn();
			
		}
	}
}
