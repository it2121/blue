package playwithme;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class main {
	// static Timer timer;
	public static int c = 0;
	static ActionListener liss = new taaa();
	public static String a = "";
	public static String text;
	public static String first = "true";
	public static boolean buttshown = false;
	static Timer timer = new Timer(20, liss);

	public static void showtext(String atext) {
		text = atext;
		timer.start();

	}

	public static void reset() {
		main.c = 0;
		main.a = "";
		main.text = null;
	}

	public static void buttonsreactions(int i) {

		switch (i) {
		case 13:
			if (blue.ans.equals("yes")) {
				blue.ids1++;
				blue.yes.setVisible(false);
				blue.no.setVisible(false);
				main.buttshown = false;
				main.story(blue.ids1 + 1);
				System.out.println(blue.ids1);

			} else if (blue.ans.equals("no")) {

				blue.yes.setVisible(false);
				blue.no.setVisible(false);
				main.buttshown = false;

			}
			break;
		case 5:
			if (blue.ans.equals("yes")) {
				if (main.first.equals("true")) {

					blue.button.setVisible(true);
					blue.txtYourName.setVisible(true);
				}
				blue.yes.setVisible(false);
				blue.no.setVisible(false);
				main.buttshown = false;

			} else if (blue.ans.equals("no")) {
				if (main.first.equals("true")) {
					blue.ids1 = 8;
					main.story(blue.ids1);
				}
				blue.yes.setVisible(false);
				blue.no.setVisible(false);
				main.buttshown = false;

			}
			break;
		case 15:
			if (blue.ans.equals("yes")) {

			} else if (blue.ans.equals("no"))

			{

			}

			break;
		default:
			if (blue.ans.equals("yes")) {
				// main.butthide();
				// main.buttshown = false;

			} else if (blue.ans.equals("no"))

			{
				blue.ids1++;
				blue.ids1++;
				main.story(blue.ids1);
				System.out.println(blue.ids1);
			}
			break;
		}

	}

	public static void story(int i) {
		switch (i) {
		case 5:
			main.reset();
			main.showtext(cone.selectst(blue.ids1));
			blue.yes.setVisible(true);
			blue.no.setVisible(true);

			main.buttshown = true;
			blue.yes.setText("yes");
			blue.no.setText("no");
			main.first = "true";
			break;
		case 6:
			main.reset();
			main.showtext(blue.txtYourName.getText() + " "
					+ cone.selectst(blue.ids1));
			break;
		case 13:
			main.reset();
			main.showtext(cone.selectst(blue.ids1));
			blue.yes.setVisible(true);
			blue.no.setVisible(true);
			main.buttshown = true;
			blue.yes.setText("i do");
			blue.no.setText("i dont");
			main.first = "false";
			break;
		case 15:
			System.out.println(blue.ids1);
			blue.yes.setText("i have");
			blue.no.setText("i have not");
			main.buttshow();
			main.buttshown = true;
			main.reset();

			main.showtext(cone.selectst(blue.ids1));

			break;
		default:
			main.reset();

			main.showtext(cone.selectst(blue.ids1));
			break;
		}

		// switch (i) {
		// case 1:
		// main.reset();
		// blue.ids1++;
		// main.showtext(cone.selectst(blue.ids1));
		// System.out.println(blue.ids1);
		// break;
		// case 2:
		// main.reset();
		// blue.ids1++;
		// main.showtext(cone.selectst(blue.ids1));
		// System.out.println(blue.ids1);
		// break;
		// case 3:
		// main.reset();
		// blue.ids1++;
		// main.showtext(cone.selectst(blue.ids1));
		// System.out.println(blue.ids1);
		// break;
		// case 4:
		// main.reset();
		// blue.ids1++;
		// main.showtext(cone.selectst(blue.ids1));
		// blue.yes.setVisible(true);
		// blue.no.setVisible(true);
		// blue.yes.setText("yes");
		// blue.no.setText("no");
		// System.out.println(blue.ids1);
		// break;
		// case 5:
		//
		// main.reset();
		// blue.ids1 = 6;
		// main.showtext(blue.txtYourName.getText() + " "
		// + cone.selectst(blue.ids1));
		// System.out.println(blue.ids1);
		// break;
		// case 6:
		// main.reset();
		// blue.ids1 = 7;
		// main.showtext(cone.selectst(blue.ids1));
		// System.out.println(blue.ids1);
		// case 7:
		// main.reset();
		// blue.ids1++;
		// main.showtext(cone.selectst(blue.ids1));
		// System.out.println(blue.ids1);
		// break;
		// case 8:
		// main.reset();
		// blue.ids1++;
		// main.showtext(cone.selectst(blue.ids1));
		// System.out.println(blue.ids1);
		// break;
		// case 9:
		// main.reset();
		// blue.ids1++;
		// main.showtext(cone.selectst(blue.ids1));
		//
		// break;
		//
		// default:
		// break;
		// }
	}

	public static void buttshow() {
		blue.yes.setVisible(true);
		blue.no.setVisible(true);

	}

	public static void butthide() {
		blue.yes.setVisible(false);
		blue.no.setVisible(false);

	}

}

class taaa implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (

		main.c < main.text.length()) {

			blue.lblMother.setText(main.a);
			main.a += (main.text.charAt(main.c));
			blue.lblMother.setText(main.a);
			main.c++;
		}
		if (main.c > main.text.length()) {
			main.timer.stop();
			main.c = 0;
			main.a = "";
			main.text = null;
		}

	}

}