package com.shiyanlou.course

public class MySwingWindow {

	public static void main(String[] args){

	}
}


package com.shiyanlou.course;

import javax.swing.JFrame;

public class MySwingWindow extends JFrame{

	public MySwingWindow(){
	
		super();
		this.setSize(400, 300);
		this.getContentPane().setLayout(null);
		this.setTitle("my First Swing window");

	}

	public static void main(String[] args){

		MySwingWindow window = new MySwingWindow();

		wwindow.setVisible(true);
	}
}


private JLable getJLable(){

	if (myLabel == null){
	
		myLabel = new JLabel();
		myLabel.setBounds(5, 10, 250, 30);

		myLabel.setText("Hello! welcome to shiyanlou.com");

	}
	return myLabel;
}


private JTextField myTextField;

private JTextField getJTextField(){

	if (myTextField == null){
	
		myTextField = new JTextField();
		myTextField.setBounds(5, 45, 200, 30);
		myTextField.setText("shi Yan Lou");

	}
	return myTextField;
}

private JButton myButton;

private JButton getJButton(){

	if (myButton == null){

		myButton = new JButton();
		myButton.setBounds(5, 80, 100, 40);
		myBUtton.setText("Click me !");
		myButton.addACtionListener(new ActionLilsterner(){
		
			public void actionPerformed(ActionEvent e){

				myLable.setForeground(Color.RED);
				myTextField.setBackground(Color.BLUE);
			}
		});
	}
	return myButton;
}



