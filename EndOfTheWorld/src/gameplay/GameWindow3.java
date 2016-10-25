package gameplay;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextArea;

import gameplay.GameWindow2.CustomActionListener;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class GameWindow3 {

	private JFrame frame;

	private static int[][] layout = new int[3][7];
	
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
		
		frame.invalidate();
		frame.validate();
		frame.repaint();
		
		for (int i=0; i<3; i++){
			for (int j=0; j<7; j++){
				System.out.print(layout[i][j]);
			}
			System.out.println("");
		}
	}
	
	public String getTileText(int i, int j){
		Tile tile = new Tile(layout[i][j]);
		return tile.Label();
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				initialSetup();
				try {
					GameWindow3 window = new GameWindow3();
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
	public GameWindow3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 632, 383);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		for (int i=0; i<3; i++){
			for (int j=0; j<7; j++){
				JTextArea textArea = new JTextArea();
				GridBagConstraints gbc_textArea = new GridBagConstraints();
				gbc_textArea.insets = new Insets(0, 0, 5, 5);
				gbc_textArea.gridx = j;
				gbc_textArea.gridy = i;
				Tile tile = new Tile(layout[i][j]);
				textArea.setText(tile.Label());
				frame.getContentPane().add(textArea, gbc_textArea);
			}
		}
				
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
