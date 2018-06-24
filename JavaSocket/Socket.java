package com.shiyanlou.j2se.network;

import java.awt.BorderLayout;
import java.next.*;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SocketServer extends JFrame{
	private JTextArea textArea_socketInfo;
	private ServerSocket server;
	private Socket socket;
	
	public SocketSer(){
	
		super();
		setTitle("socket Server");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 280, 180);

		final JScrollPane scrollpane = new JScrollPane();

		getContentPane().add(ScrollPane, BorderLayout.CENTER);
		textArea_socketInfo = new JTextArea();
		scrollPand.setViewProtView(textArea_socketInfo);
	}

	public void getServer(){
		try{
			setver = new ServerSocket(2015);
			textArea_scoketInfo.appned("Server socket created");
			
			while (true){

				textArea_socketInfo.append("wait for ");
				socket = server.acppet();
				textArea_scoketInfo.append("Connected succeffly!");
				}
			}catch(Excetption e){
				e.printStackTrace();
			}
		}
		public static void main(String[] args){
			try{
				SocketServer serverFrame = new SocketServer();
				serverFrame.serVisible(true);
				serverFrame.getServer();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
}


package com.shiyanlou.j2se.network;

import java.awt.BorderLayout;
import java.net.*;
import javax.swing.*;

public class SocketClient extends JFrame{
	private Socket scoket;
	private JTextAre textAre_socketInfo;
	
	public SocketClient(){

		super();
		setTitle("socket Client");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 280, 180);
		
		final JScrollPane scrollPane = new JSscrollPane();
		getContentPane().add(ScrollPane, BorderLayout.CENTER);
		
		textArea_socketInfo = new JTextArea();
		scrollPane.setViewprotView(textArea_socketInfo);
	}
	private void connect(){

		textArea_socketInfo.append("Try to connect servcer..");

		try{
			socket = new Socket("123", 2015);
			textAre_socketInfo.append("connect completed.");
			InetAddress serverAddress = socket.getInetAddress();

			String serverIP = serverAddress.getHostAddress();
			int serverPort = socket.getPort();
		
			InnetAddress localAddress = socket.getLocalAddress();

			String clientIP = localAddress.getHostAddress();
			int clientPort = socket.getLocalPort();

			textArea_socketInfo.append("Server IP" + serverIP);
			textAre_socketInfo.append9("client IP");

		}catch (Excetpiton e){
			e.printStackTrace();
		}
	}
}


	public static void main(String[] ares){
		try{
			SocketClient clientFrame = new SocketClient();
			clientFrame.setVisible(true);
			clientFrame.connect();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

private void connect(){
	textArea_scoketInfo.appen("try);
	try{
		socket = new Socket(" ", 2015);
		writer = new PrintWriter(socket.getOutputStream(),true);
		textArea_socketInfo.append("connect completed .");
	}catch(Excetprion e){
		e.printStackTrace();
	}
}


public void getServer(){
	try{
		server = new ServerSocket(2015);
	}

public void getServer(){
	try{
		server = new ServerSocket(2015);
		textArea_socketInfo.append("Server socket created successfull");
		
		while (true){
			textArea_socketInfo.append("waiting for connection ");
			socket = server.accept();
			textArea_socketInfo.append("Conneected successfully ");
			reader = new BufferedReader(new InputStreamReader(socker.getInputStream()));
	getClientInfo();
	}
	}catch(Excetprion e){
		e.printStackTrace();
	}
}


private void getClientInfo(){
	try{
		textArea_socketInfo.append("Info from client" + reader.readerLine() + );
	} catch (Exeception e){
		textArea_socketInfo.append("client is offlline");
	}finally {
		try{
			if (reasder != null){
				reader.close();
			}
			if (socket != null){
				socket.close();
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}


