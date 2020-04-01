package biblio.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import biblio.entity.Adherent;
import biblio.entity.Employe;
import biblio.entity.Utilisateur;
import biblio.util.EnumCategorieEmploye;

public class UtilisateurDAO {

	private static List<Utilisateur> listeUtilisateur = new ArrayList<>();
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	static {
		try {
			listeUtilisateur
					.add(new Adherent("toto", "titi", sdf.parse("06/12/1990"), "H", 1, "toto", "toto", "0102030405"));
			listeUtilisateur
					.add(new Adherent("Detolle", "JeanMi", sdf.parse("06/12/1960"), "H", 2, "jmd", "", "0102030405"));
			listeUtilisateur
					.add(new Adherent("Detreille", "Hervé", sdf.parse("06/12/1987"), "H", 3, "dh", "", "0102030405"));
			listeUtilisateur.add(new Employe("Detreille", "Hervé", sdf.parse("06/12/1987"), "H", 4, "dh", "", "012345",
					EnumCategorieEmploye.bibliothecaire));
			listeUtilisateur.add(new Employe("Detolle", "JeanMi", sdf.parse("06/12/1960"), "H", 5, "jmd", "", "012346",
					EnumCategorieEmploye.gestionnaire_de_fonds));

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public Utilisateur findByKey(Integer id) {
		for (Utilisateur e : listeUtilisateur) {
			if (e.getIdUtilisateur() == id) {
				return e;
			}
		}
		return null;
	}

}
