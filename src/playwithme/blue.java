package playwithme;

import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.UIManager;

public class blue {
	public String text = "mother fucker";
	public String a = "";
	public JFrame frame;
	public int c = 0;
	Timer timer;
	public static JTextPane lblMother = new JTextPane();
	public static int ids1 = 1;
	public int ids2 = 1;
	public static JTextField txtYourName;
	// public static Button button_2;
	public static Button button = new Button("Send");
	public static Label label = new Label("");
	public static Label no = new Label("");
	public static Label yes = new Label("");
	public static String ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					blue window = new blue();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @throws InterruptedException
	 */
	public blue() throws InterruptedException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @throws InterruptedException
	 */
	public void initialize() throws InterruptedException {

		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setLayout(null);
		lblMother.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (main.buttshown == false) {
					if (ids1 == 7) {
						ids1++;
					}
					ids1++;

					main.story(ids1);
					System.out.println(ids1);
				}
			}
		});

		// JTextPane lblMother = new JTextPane();
		lblMother.setFont(new Font("Papyrus", Font.BOLD, 25));
		lblMother.setForeground(Color.WHITE);
		lblMother.setBackground(Color.BLACK);
		lblMother.setBounds(10, 10, 770, 250);
		lblMother.setEditable(false);
		frame.getContentPane().add(lblMother);

		txtYourName = new JTextField();
		txtYourName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtYourName.setText("");
			}
		});
		txtYourName.setFont(new Font("Tekton Pro", Font.PLAIN, 17));
		txtYourName.setHorizontalAlignment(SwingConstants.CENTER);
		txtYourName.setForeground(UIManager.getColor("TextField.highlight"));
		txtYourName.setBackground(new Color(0, 0, 0));
		txtYourName.setText("your name");
		txtYourName.setBounds(293, 321, 204, 20);
		frame.getContentPane().add(txtYourName);
		txtYourName.setColumns(10);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ids1 = 6;
				main.story(ids1);
				button.setVisible(false);
				txtYourName.setVisible(false);
			}
		});

		button.setFont(new Font("Adobe Caslon Pro Bold", Font.PLAIN, 12));
		button.setForeground(Color.WHITE);
		button.setBackground(Color.DARK_GRAY);
		button.setBounds(360, 347, 70, 22);
		frame.getContentPane().add(button);
		label.setAlignment(Label.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Papyrus", Font.PLAIN, 20));
		label.setBounds(280, 291, 228, 157);

		frame.getContentPane().add(label);
		no.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				ans = "no";
				// if (main.first.equals("true")) {
				// blue.ids1 = 8;
				// main.story(ids1);
				// }
				main.buttonsreactions(ids1);

			}
		});
		no.setForeground(Color.WHITE);
		no.setFont(new Font("Papyrus", Font.PLAIN, 20));
		no.setAlignment(Label.CENTER);
		no.setBounds(534, 291, 228, 157);

		frame.getContentPane().add(no);
		yes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				ans = "yes";
				// if (main.first.equals("true")) {
				//
				// button.setVisible(true);
				// txtYourName.setVisible(true);
				// }

				main.buttonsreactions(ids1);
			}
		});
		yes.setForeground(Color.WHITE);
		yes.setFont(new Font("Papyrus", Font.PLAIN, 20));
		yes.setAlignment(Label.CENTER);
		yes.setBounds(26, 291, 228, 157);

		frame.getContentPane().add(yes);
		// button_2 = new Button("");
		frame.setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 798, 495);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.setVisible(false);
		txtYourName.setVisible(false);
		no.setVisible(false);
		label.setVisible(false);
		yes.setVisible(false);
		// button_1.
		// ActionListener lis = new timelis();
		//
		// timer = new Timer(100, lis);
		// timer.start();
		cone.selectst(ids1);
		main.showtext(cone.statmenta);
		// System.out.println("mother fucker ");
		// ids1++;

	}

}
