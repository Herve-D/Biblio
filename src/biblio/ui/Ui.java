package biblio.ui;

import javax.swing.JOptionPane;

public class Ui {

	public static Integer saisieId(String label) {
		String chaine;
		Integer id;
		do {
			chaine = JOptionPane.showInputDialog(label);

			try {
				id = Integer.parseInt(chaine);
				break;
			} catch (Exception e) {
				// e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Entrez un nombre valide");
			}

		} while (true);
		return id;
	}

	public static String saisie(String label) {
		String chaine = JOptionPane.showInputDialog(label);
		return chaine;
	}

}
