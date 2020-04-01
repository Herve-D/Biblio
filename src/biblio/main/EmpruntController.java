package biblio.main;

import javax.swing.JOptionPane;

import biblio.dao.UtilisateurDAO;
import biblio.entity.Utilisateur;

public class EmpruntController {

	public static void main(String[] args) {
		String strId;
		Integer id;
		Utilisateur utilisateur;

		/***************************************************************************/
		/**
		 * saisie de l'ID utilisateur
		 */
		do {
			strId = JOptionPane.showInputDialog("Entrez l'ID de l'utilisateur :");

			try {
				id = Integer.parseInt(strId);
				break;
			} catch (Exception e) {
				// e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Entrez un nombre valide");
			}

		} while (true);

		UtilisateurDAO utilisateurDAO = new UtilisateurDAO();
		utilisateur = (Utilisateur) utilisateurDAO.findByKey(id);
		JOptionPane.showMessageDialog(null, utilisateur);

	}

}
