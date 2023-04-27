import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class LibrarySystem extends JFrame {
	
	private Image img_NU = new ImageIcon(LibrarySystem.class.getResource("res/NU.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	private Image img_library = new ImageIcon(LibrarySystem.class.getResource("res/book.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	
	private JPanel contentPane;
	private JTextField txtWelcomeToNu;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JLabel lblLoginMessage = new JLabel("");
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarySystem frame = new LibrarySystem();
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
	public LibrarySystem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 128), 2));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(147, 178, 300, 40);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtUsername.getText().equals("Username")) {
					txtUsername.setText("");
				}
				else {
					txtUsername.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtUsername.getText().equals(""))
					txtUsername.setText("Username");
			}
		});
		txtUsername.setBorder(null);
		txtUsername.setText("Username");
		txtUsername.setBounds(10, 0, 280, 40);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(147, 242, 300, 40);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtPassword = new JPasswordField();
		txtPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtPassword.getText().equals("Password")) {
				txtPassword.setEchoChar('●');
				txtPassword.setText("");		
			}
				else {
					txtPassword.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtPassword.getText().equals("")) {
					txtPassword.setText("Password");
					
					
				}
			}
		});
		txtPassword.setBorder(null);
		txtPassword.setEchoChar((char)0);
		txtPassword.setText("Password");
		txtPassword.setBounds(10, 0, 280, 40);
		panel_1.add(txtPassword);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(544, 0, 27, -5);
		contentPane.add(lblNewLabel);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					LibrarySystem.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblX.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblX.setForeground(Color.WHITE);
			}
		});
		lblX.setForeground(new Color(255, 255, 255));
		lblX.setFont(new Font("Arial", Font.BOLD, 15));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setBounds(580, 0, 20, 20);
		contentPane.add(lblX);
		
		JLabel lblIconLogo = new JLabel("");
		lblIconLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconLogo.setBounds(10, 11, 129, 94);
		contentPane.add(lblIconLogo);
		lblIconLogo.setIcon(new ImageIcon(img_NU));
		
		JLabel lblIconLogo2 = new JLabel("");
		lblIconLogo2.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconLogo2.setVerticalAlignment(SwingConstants.TOP);
		lblIconLogo2.setBounds(455, 289, 168, 100);
		contentPane.add(lblIconLogo2);
		setUndecorated(true);
		lblIconLogo2.setIcon(new ImageIcon(img_library));
		
		txtWelcomeToNu = new JTextField();
		txtWelcomeToNu.setText("Welcome to NU Library Management");
		txtWelcomeToNu.setBounds(107, 104, 391, 51);
		contentPane.add(txtWelcomeToNu);
		txtWelcomeToNu.setColumns(10);
		
		JPanel pnlBtnLogin = new JPanel();
		pnlBtnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(50, 80, 80));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(0, 139, 139));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(60, 80, 80));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(50, 80, 80));
			}
		});
		pnlBtnLogin.setBackground(new Color(0, 139, 139));
		pnlBtnLogin.setBounds(222, 318, 159, 51);
		contentPane.add(pnlBtnLogin);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String username = txtUsername.getText();
				String password = txtPassword.getText();
				if (username.equals("Admin_01") && password.equals("AdminOne") || 
				    username.equals("Admin_02") && password.equals("AdminTwo") ||
				    username.equals("Admin_03") && password.equals("AdminThree")) {
					lblLoginMessage.setText("");
					JOptionPane.showMessageDialog(null, "Login Successful, Welcome to NU Library System");
					// do something if login is successful
					
				} else if (username.equals("") || username.equals("Username") ||
				           password.equals("") || password.equals("Password")) {
					// do something if either the username or password is empty or the default text
					
					
					lblLoginMessage.setText("Please input all requirements!");
				} else {
					lblLoginMessage.setText("INCORRECT USERNAME and PASSWORD.");
					// do something if login is unsuccessful
				}
			}
		});
		lblLogin.setFont(new Font("Arial", Font.BOLD, 15));
		pnlBtnLogin.add(lblLogin);
		
		lblLoginMessage.setForeground(new Color(128, 0, 0));
		lblLoginMessage.setFont(new Font("Arial", Font.PLAIN, 12));
		lblLoginMessage.setBackground(new Color(128, 0, 0));
		lblLoginMessage.setBounds(157, 287, 291, 31);
		contentPane.add(lblLoginMessage);
		setLocationRelativeTo(null);
		
	}
}
