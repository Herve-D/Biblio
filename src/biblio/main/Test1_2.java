package biblio.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import biblio.dao.ExemplaireDAO;
import biblio.dao.UtilisateurDAO;
import biblio.entity.Adherent;
import biblio.entity.EmpruntEnCours;
import biblio.entity.Exemplaire;
import biblio.ui.Ui;
import biblio.util.BiblioException;
import biblio.util.EnumStatusExemplaire;

public class Test1_2 {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Integer id;
		Exemplaire exemplaire;
		Adherent adherent;
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
		 * find id adherent
		 */
		id = Ui.saisieId("Entrer l'ID de l'adhérent :");

		UtilisateurDAO utilisateurDAO = new UtilisateurDAO();
		adherent = (Adherent) utilisateurDAO.findByKey(id);

		JOptionPane.showMessageDialog(null, adherent);

		/***************************************************************************/
		/**
		 * creation emprunt sur adherent
		 */
		try {
			listeExemplaire.get(0).setStatus(EnumStatusExemplaire.prete);
			exemplaireDAO.updateStatus(listeExemplaire.get(0));

			EmpruntEnCours empruntEnCour1 = new EmpruntEnCours(sdf.parse("03/03/2019"), adherent,
					listeExemplaire.get(0));
			adherent.addEmpruntEnCours(empruntEnCour1);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		try {
			adherent.isConditionsPretAcceptees();
		} catch (BiblioException be) {
			JOptionPane.showMessageDialog(null, "Emprunt interdit\n" + be.getMessage());
		}

	}

}
