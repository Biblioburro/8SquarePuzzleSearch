import javax.swing.*;
public class Driver {
	public static void main(String[] args) {
		/*
		//declare the frame
		JFrame f = new JFrame();
		//declare a button and set its bounds
		JButton b = new JButton("Click");
		b.setBounds(130,100,100,40);
		//add the button to the frame
		f.add(b);
		//set the size of the frame and layout
		f.setSize(400,500);
		f.setLayout(null);
		//allow the user to see the value
		f.setVisible(true);
		*/
		squarePuzzle p = new squarePuzzle();
		p.printPuzzle();
	System.out.println(p.checkSolutions());
	}
}
