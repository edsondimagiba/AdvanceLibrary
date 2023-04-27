import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.ComponentOrientation;

public class FrameDashboard extends JFrame {

	private JPanel contentPane;
	private Image img_NU = new ImageIcon(LibrarySystem.class.getResource("res/NU.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameDashboard frame = new FrameDashboard();
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
	public FrameDashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 255, 255), 2));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 139, 139));
		panel.setBounds(0, 0, 256, 400);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblconLogo = new JLabel("");
		lblconLogo.setBounds(76, -21, 236, 177);
		lblconLogo.setIcon(new ImageIcon(img_NU));
		panel.add(lblconLogo);
		
		JPanel paneBook1 = new JPanel();
		paneBook1.setBackground(new Color(47, 79, 79));
		paneBook1.setBounds(10, 128, 236, 50);
		panel.add(paneBook1);
		paneBook1.setLayout(null);
		
		JLabel lblBorrow = new JLabel("Borrow");
		lblBorrow.setFont(new Font("Arial", Font.BOLD, 20));
		lblBorrow.setHorizontalAlignment(SwingConstants.CENTER);
		lblBorrow.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBorrow.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		lblBorrow.setBounds(10, 0, 216, 50);
		paneBook1.add(lblBorrow);
		
		JPanel paneBook2 = new JPanel();
		paneBook2.setBackground(new Color(47, 79, 79));
		paneBook2.setBounds(10, 219, 236, 50);
		panel.add(paneBook2);
		paneBook2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Borrow");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 0, 216, 50);
		paneBook2.add(lblNewLabel);
		
		JPanel paneBook3 = new JPanel();
		paneBook3.setFont(new Font("Arial", Font.BOLD, 20));
		paneBook3.setBackground(new Color(47, 79, 79));
		paneBook3.setBounds(10, 298, 236, 50);
		panel.add(paneBook3);
		paneBook3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Borrow");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 0, 216, 50);
		paneBook3.add(lblNewLabel_1);
	}

	private class PanelButtonMouseAdapter extends MouseAdapter{
		@Override
		public void mouseEntered(MouseEvent e) {
			
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			
		}
		
		@Override
		public void mouseReleased(Mouse Event e) {
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	