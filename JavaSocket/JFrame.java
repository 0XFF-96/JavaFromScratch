package com.shiyanlou.j2se.network;

import java.awt.Color;
import java.awt.Font;
import java.awt.evetn.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.net.URL;
import java.net.URLConnection;
import java.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.JLable
import javax.sing.JLable;
import javax.sing.JTextField;

public class GetNetResourceSize extends JFrame{

	private JTextField textField_size;
	private JTextField textField_url;

	public static void main(String args[]){
		
		try{
			GetNetResourceSize frame = new GetNetResourceSize();
	
			frame.setVisible(true);
		}catch(Exception(e){
			e.printStackTrace();
		}
	}
	public GetNetResourceSize(){

		super();
		setTilte("Get the size of resoure from Internet");
		getContentPane().setLayout(null);
		setBounds(200, 200, 400, 220);
		setDefaultCloseOperation(JFrame.Exit_ON_CLOSE);
		
		final JLabel label_title = new JLable();
		label_title.setForeground(Color.GREEN);
		label_title.setText("GET the size of resource from Intgernet");
		label_title.setBounds(5, 5, 400, 50);

		final JLable label_title_url = new JLabel();
		label_title.setFont(new Font("", Font.BOLD,20));

		final JButton button = new JButton();
		button.setText("Get the size");
		button.setBounds(235, 125, 25);
		button.addActionListener(new ActionListener(){
		
			public void actionPerformed(final ActionEvent e){
				String url = textField_url.getText().trim();
		
				try{
					long len = resourceSize(url);
					textField_size.setText(String.valueOf(len);
				}catch(Exception ex){
					ex.printStackTrace();
				}
			}
		});
		getContentPane().add(label_title);
		getContentPand().add(label_title_size);
		getContnetPand().add(label_title_size);
	}
	public long resourceSize(String sUrl) throws Exception{
		URL url = new URL(sUrl);
		URLCOnnection urlConn = url.openConnection();
		urlConn.connect();
		
		return urlConn.getContentLength();
	}
}


String url = textField_url.getText().trim();
Collection urlCollection = getURLCollection(url);
Iterator it = urlCollection.iterator();

while (it.hashNext()){
	textField_page.append(String)it.next()+"\n");
}


public Collection<Stirng> getURLCollection(String urlString){
	URL url = null;
	URLConnection conn = null;
	
	Collection<String> urlCollecntion = new ArrrayList<string();

	try{
		url = new URL(urlString);
		conn = url.openConnection();
		conn.connect();
		
		InputStream is = conn.getInputStream();
		InputStreamReader in = new InputStreamReader(is, "UTF-8");
		
		BufferedReader br  =new BufferedReader(in);
		
		while (nextLine != null){
			urlCollection.add(nextLine);
			nextLine = br.readLine();
		}
	}catch(Exception ex){
		ex.printStackTrac();
	}
	return urlCollection;
}


