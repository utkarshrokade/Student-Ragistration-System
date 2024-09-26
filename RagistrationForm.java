package student_ragistration;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class RagistrationForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textName;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textAge;
	private JTextField textMobile;
	private JTextField textEmail;
	private JTextField textUsername;
	private JPasswordField textPassword;
	private JTextField textFPrn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RagistrationForm frame = new RagistrationForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RagistrationForm() { 
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\images.png"));
		setTitle("RAGISTRATION FORM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 738, 644);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(185, 255, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Name :");
		lblNewLabel.setBounds(46, 61, 112, 13);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Address :");
		lblNewLabel_1.setBounds(46, 133, 112, 13);
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gender :");
		lblNewLabel_2.setBounds(46, 227, 112, 13);
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(" Age :");
		lblNewLabel_3.setBounds(46, 263, 100, 27);
		lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mobile No :");
		lblNewLabel_4.setBounds(46, 322, 100, 13);
		lblNewLabel_4.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Email :");
		lblNewLabel_5.setBounds(46, 377, 87, 13);
		lblNewLabel_5.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Username :");
		lblNewLabel_6.setBounds(181, 444, 100, 13);
		lblNewLabel_6.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Password :");
		lblNewLabel_7.setBounds(181, 492, 87, 13);
		lblNewLabel_7.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		contentPane.add(lblNewLabel_7);
		
		textName = new JTextField();
		textName.setBounds(181, 60, 213, 19);
		contentPane.add(textName);
		textName.setColumns(10);
		
		JTextArea txtAdd = new JTextArea();
		txtAdd.setBounds(181, 129, 213, 70);
		contentPane.add(txtAdd);
		
		JRadioButton rbMale = new JRadioButton("Male");
		rbMale.setBackground(new Color(185, 255, 238));
		rbMale.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonGroup.add(rbMale);
		rbMale.setBounds(181, 225, 103, 21);
		contentPane.add(rbMale);
		
		JRadioButton rbFemale = new JRadioButton("Female");
		rbFemale.setBackground(new Color(185, 255, 238));
		rbFemale.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonGroup.add(rbFemale);
		rbFemale.setBounds(286, 225, 103, 21);
		contentPane.add(rbFemale);
		
		textAge = new JTextField();
		textAge.setBounds(178, 269, 213, 19);
		contentPane.add(textAge);
		textAge.setColumns(10);
		
		textMobile = new JTextField();
		textMobile.setBounds(178, 321, 213, 19);
		contentPane.add(textMobile);
		textMobile.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setBounds(178, 376, 213, 19);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		textUsername = new JTextField();
		textUsername.setBounds(272, 443, 180, 19);
		contentPane.add(textUsername);
		textUsername.setColumns(10);
		
		textPassword = new JPasswordField();
		textPassword.setBounds(272, 491, 180, 19);
		contentPane.add(textPassword);
		
		JLabel lblNewLabel_8 = new JLabel("Student Registration");
		lblNewLabel_8.setFont(new Font("Cambria Math", Font.BOLD, 18));
		lblNewLabel_8.setBounds(272, 23, 213, 27);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("PRN No :");
		lblNewLabel_9.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblNewLabel_9.setBounds(46, 96, 81, 25);
		contentPane.add(lblNewLabel_9);
		
		textFPrn = new JTextField();
		textFPrn.setBounds(181, 101, 210, 19);
		contentPane.add(textFPrn);
		textFPrn.setColumns(10);
		
		JButton btnValidate = new JButton("VALIDATE");
		btnValidate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con =DriverManager.getConnection("jdbc:mysql://localhost:port/databasename","root","Password");
                	String query ="insert into registration values(?,?,?,?,?,?,?,?,?)";
                	PreparedStatement ps=con.prepareStatement(query);
                	ps.setString(1, textName.getText());
                	ps.setString(2, textFPrn.getText());
                	ps.setString(3, txtAdd.getText());
                	if(rbMale.isSelected())
                		ps.setString(4,rbMale.getText());
                	else
                		ps.setString(4,rbFemale.getText());
                	ps.setInt(5,Integer.parseInt(textAge.getText()));
                 	ps.setInt(6,Integer.parseInt(textMobile.getText()));
                 	ps.setString(7,textEmail.getText());
                	ps.setString(8,textUsername.getText());
                	ps.setString(9,textPassword.getText());
                	
                	int i=ps.executeUpdate();
                	JOptionPane.showMessageDialog(btnValidate,i+"RECORD ADDED SUCCESFULLY");
                 	ps.close();
                 	con.close();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
			}
		});
		btnValidate.setForeground(new Color(0, 0, 0));
		btnValidate.setBackground(new Color(0, 255, 64));
		btnValidate.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnValidate.setBounds(183, 558, 112, 21);
		contentPane.add(btnValidate);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textName.setText("");
				textFPrn.setText("");
				txtAdd.setText("");
				textAge.setText("");
				textMobile.setText("");
				textEmail.setText("");
				textUsername.setText("");
				textPassword.setText("");
				buttonGroup.clearSelection();
			}
		});
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(325, 558, 112, 21);
		contentPane.add(btnNewButton_1);
	}
}
