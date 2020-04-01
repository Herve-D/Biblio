package biblio.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import biblio.dao.ExemplaireDAO;
import biblio.dao.UtilisateurDAO;
import biblio.entity.Employe;
import biblio.entity.EmpruntEnCours;
import biblio.entity.Exemplaire;
import biblio.ui.Ui;
import biblio.util.BiblioException;
import biblio.util.EnumStatusExemplaire;

public class Test1_3 {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String strId;
		Integer id;
		Exemplaire exemplaire;
		Employe employe;
		List<Exemplaire> listeExemplaire = new ArrayList<>();

		/***************************************************************************/
		/**
		 * find id exemplaire
		 */

		ExemplaireDAO exemplaireDAO = new ExemplaireDAO();
		for (int i = 0; i < 2; i++) {
			id = Ui.saisieId("Entrer l'ID de l'exemplaire :");

			exemplaire = exemplaireDAO.findByKey(id);
			listeExemplaire.add(exemplaire);

			JOptionPane.showMessageDialog(null, exemplaire);
		}

		/***************************************************************************/
		/**
		 * find id employe
		 */
		id = Ui.saisieId("Entrer l'ID de l'employé :");

		UtilisateurDAO utilisateurDAO = new UtilisateurDAO();
		employe = (Employe) utilisateurDAO.findByKey(id);
		JOptionPane.showMessageDialog(null, employe);

		/***************************************************************************/
		/**
		 * creation emprunt sur employe
		 */
		try {
			listeExemplaire.get(0).setStatus(EnumStatusExemplaire.prete);
			exemplaireDAO.updateStatus(listeExemplaire.get(0));

			EmpruntEnCours empruntEnCour2 = new EmpruntEnCours(sdf.parse("03/03/2019"), employe,
					listeExemplaire.get(0));
			employe.addEmpruntEnCours(empruntEnCour2);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		try {
			employe.isConditionsPretAcceptees();
		} catch (BiblioException be) {
			JOptionPane.showMessageDialog(null, "Emprunt interdit\n" + be.getMessage());
		}

		strId = "";
		for (EmpruntEnCours empruntEnCours : employe.getEmpruntEnCours()) {
			strId += empruntEnCours + "\n";
		}
		JOptionPane.showMessageDialog(null, employe + "\n" + strId);

	}

}
