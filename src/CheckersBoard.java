

import javax.swing.*;


public class CheckersBoard extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	CheckerPanel pan;

	public CheckersBoard(){
		
		this.setSize(866,720);
		pan = new CheckerPanel();
		this.add(pan);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);		
		
	}
	public static void main(String[] args){
		new CheckersBoard();

	}
	
}
