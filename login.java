package userlog;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login implements ActionListener{
	
	private static JTextField username;
	private static JTextField loctxt;
	private static JTextField addresstxt;
	private static JTextField nametxt;
	private static JTextField numbertxt;
	private static JPasswordField passtext;
	private static JFrame logpage;
	private static JPanel panel1;
	private static JPanel panel4;
	private static JPanel panel3;
	private static JLabel msg;
	private static JLabel namelabel;
	private static JButton ok;
	private static JButton exit3;
	private static JButton clear3;
	private static JButton back2;
	private static JButton reserve;
	private static JLabel password;
	private static JLabel msgoutput;
	private static JLabel number;
	private static JFrame frame2;
	private static JFrame frame4;
	private static JFrame frame3;
	private static JButton clear;
	private static JButton exit;
	private static JPanel panel2;
	private static JLabel username2;
	private static JTextField usertext2;
	private static JLabel welcome;
	private static JLabel name3;
	private static JPasswordField passtext2;
	private static JLabel pass2;
	private static JLabel register;
	private static JLabel msg2;
	private static JLabel address;
	private static JLabel lot;
	private static JLabel reservetxt;
	private static JLabel locl;
	private static JButton back;
	private static JButton edit;
	private static JButton regbtn;
	private static JButton clear2;
	private static JComboBox place;
	private static HashMap<String,String> userpass = new HashMap<>();

	public static void main (String[] args) {
		
		
 		//username textfield
	    username = new JTextField();
	 	username.setBounds(100, 20, 250, 25);
		
		//panel1
		panel1 = new JPanel();
		panel1.add(username);
		panel1.setLayout(null);
		
		//panel 2
				panel2 = new JPanel();
				panel2.setLayout(null);
		
		//panel3
		 panel3 = new JPanel();
		 panel3.setLayout(null);
				
		 //panel4
		 panel4 = new JPanel();
		 panel4.setLayout(null);
		 
		 //place
		 String[] lugar = {"Tenejero", "Cupang", "Ibayo", "San Jose"};
         place = new JComboBox(lugar);
		 panel3.add(place);
		 place.setBounds(200, 60, 100, 20);
		 
		 
		 //reserve
		 reserve = new JButton("Reserve");
		 reserve.setBounds(190, 190, 90, 25);
		 panel3.add(reserve);
		 
		 //reserveoutput
		 reservetxt = new JLabel();
		 reservetxt.setBounds(10, 300, 250, 25);
		 panel3.add(reservetxt);
		 
		 
		 //lot
	    lot = new JLabel("Lot Resrvation fill up form");
	    lot.setBounds(10, 10, 180, 20);
	    panel3.add(lot);
		
		// locl
		  locl = new JLabel("Where do you want to reserve?");
		 locl.setBounds(10, 60, 180, 20);
		 panel3.add(locl);
			
		
		
				 
		/*//loc text
		loctxt = new JTextField();
		loctxt.setBounds(200, 60, 100, 20);
		panel3.add(loctxt);
		*/
		//name rserve
		name3 = new JLabel("Name:");
		name3.setBounds(10, 100, 100, 20);
		panel3.add(name3);
		
		//name3 txt
		nametxt= new JTextField();
		nametxt.setBounds(50, 100, 140, 20);
		panel3.add(nametxt);
		
		
		//number
		
		number = new JLabel("Contact Number: ");
		number.setBounds(200, 100, 100, 20);
		 panel3.add(number);
		
		 //numbertxt
		 numbertxt = new JTextField();
		 numbertxt.setBounds(300,100,100,20);
		 panel3.add(numbertxt);
		 
		 
		 //address
		 address = new JLabel("Address:");
		 address.setBounds(10, 160, 100, 20);
		 panel3.add(address);
		 
		 //address txt
		 addresstxt = new JTextField();
		 addresstxt.setBounds(70, 160, 280, 20);
		 panel3.add(addresstxt);
		 
		 //back 2
		 back2 = new JButton("Log Out");
		 back2.setBounds(10, 190, 90, 25);
		 panel3.add(back2);
		 
		 
		 //clear 3
		 clear3 = new JButton("Clear");
		 clear3.setBounds(110, 190, 70, 25);
		 panel3.add(clear3);
		 
		//exit3
		/* exit3 = new JButton("Exit");
		 exit3.setBounds();
		 panel3.add(exit3);
		 */
		//msg label
		msg = new JLabel();
		panel2.add(msg);
		msg.setBounds(10, 90, 150, 120);
		
		
		//message frame2
		msg2 = new JLabel();
		panel2.add(msg2);
		msg2.setBounds(10,220, 150, 100);
		
		//message output label
		msgoutput = new JLabel();
		panel1.add(msgoutput);
		msgoutput.setBounds(100, 90, 250,120);
		
		//button 1
		ok = new JButton("Login");
		ok.setBounds(10, 180, 100, 25);
		panel1.add(ok);
		ok.addActionListener(new login());
	
       //register
		 register = new JLabel("Don't have an account? click register.");
		 register.setBounds(10, 260, 250, 25);
         panel1.add(register);
		 
	   //register btn
         
         regbtn = new JButton("Register");
         regbtn.setBounds(240, 260, 90, 25);
		 panel1.add(regbtn);
		 
        //clear button
        clear = new JButton("clear");
        clear.setBounds(120, 180, 70, 25);
        panel1.add(clear);
        
      
		
        //exit button
        exit = new JButton("exit");
        exit.setBounds(200, 180, 70, 25);
        panel1.add(exit);
        exit.addActionListener(new login());
        
		//passtext textfield 2
		passtext = new JPasswordField();
		panel1.add(passtext);
		passtext.setBounds(100, 80, 250, 25);
		
		//usernamelabel
		namelabel = new JLabel("Username:");
		namelabel.setBounds(10,20,100,25);
		panel1.add(namelabel);
		
		//password label
		password = new JLabel("Password:");
		password.setBounds(10, 80, 100, 25);
		panel1.add(password);
		
		//logpage jframe
		logpage = new JFrame("login");
		logpage.setVisible(true);
		logpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		logpage.setBounds(500,500,500,500);
		logpage.add(panel1);
		
		//hashmap
		userpass.put("owner", "ownerpass");
		userpass.put("manager", "managerpass");
		userpass.put("cashier", "cashierpass");
		userpass.put("sales", "sales");
		
		//frame 4
		frame4 = new JFrame();
		frame4.setBounds(500, 500, 525, 500);
		frame4.add(panel4);
		
		
		
		//welcome
		welcome = new JLabel("Welcome user, create your username and password");
		welcome.setBounds(10,10, 500,20);
		panel2.add(welcome);
		
		
		//username2
		username2 = new JLabel("Username:");
		panel2.add(username2);
        username2.setBounds(10,60,100,25);
		
		//usertext 2
		usertext2 = new JTextField();
		panel2.add(usertext2);
		usertext2.setBounds(100, 60, 250, 25);
		
		//pass2
		pass2 = new JLabel("Password:");
		panel2.add(pass2);
		pass2.setBounds(10, 100, 100, 25);
		
		//passtext2
		passtext2 = new JPasswordField();
		panel2.add(passtext2);
		passtext2.setBounds(100, 100, 250,25);
		
		//button back
		back = new JButton("back");
		panel2.add(back);
		back.setBounds(10, 180, 80, 25);
		
		//edit button
		edit = new JButton("Register");
		panel2.add(edit);
		edit.setBounds(100, 180, 100, 25);
		
		//clear2
		clear2 = new JButton("clear");
		panel2.add(clear2);
		clear2.setBounds(210,180,80,25);
		
		
		//frame2
		frame2 = new JFrame();
		frame2.setBounds(500, 500, 525, 500);
		frame2.add(panel2);
		
		//frame3
		frame3 = new JFrame();
		frame3.setBounds(500, 500, 525, 500);
		frame3.add(panel3);

		
		clear2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				passtext.setText("");
				username.setText("");
				msgoutput.setText("");
				passtext2.setText("");
				usertext2.setText("");
				msg2.setText("");
				
			}
			
		});
		
		edit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String user = usertext2.getText();
				char[] pf2 = passtext2.getPassword();
				String pass = new String(pf2);
				userpass.put(user, pass);
				
				msg.setText("Registration successfully");
			}
		
		});
		back2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame3.setVisible(false);
				logpage.setVisible(true);
			}
		
		});
		
		
	back.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			logpage.setVisible(true);
			frame2.setVisible(false);
		}
		
	});
	regbtn.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			logpage.setVisible(false);
			frame2.setVisible(true);
		}
		
	});
				
				
	ok.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			String name = username.getText();
			char[] p = passtext.getPassword();
			String pass = new String(p);

			if(userpass.containsKey(name) && userpass.containsValue(pass)) {
				logpage.setVisible(false);
				frame3.setVisible(true);
				

			}else {
				msgoutput.setText("Wrong username or password");
					
		}
		}	
	});
	 reserve.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			reservetxt.setText("Reservation Sucessfully");
			}
			
			
		}); 
      clear.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			int ans = JOptionPane.showConfirmDialog(logpage, "You were about to delete all the data you inputted, Are you sure you wanna continue?", "Warning", 0);
			
			
					if(ans==JOptionPane.YES_OPTION) {
						passtext.setText("");
						username.setText("");
						msgoutput.setText("");
						passtext2.setText("");
						usertext2.setText("");
						loctxt.setText("");
						nametxt.setText("");
						numbertxt.setText("");
						addresstxt.setText("");

					}

			
		
           
		}
		
		
	});  clear3.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			int ans = JOptionPane.showConfirmDialog(logpage, "You were about to delete all the data you inputted, Are you sure you wanna continue?", "Warning", 0);
			
			
					if(ans==JOptionPane.YES_OPTION) {
			passtext.setText("");
			username.setText("");
			msgoutput.setText("");
			passtext2.setText("");
			usertext2.setText("");
			
			nametxt.setText("");
			numbertxt.setText("");
			addresstxt.setText("");
					}

		}
		
	});  
	
	
	exit.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
     });
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
