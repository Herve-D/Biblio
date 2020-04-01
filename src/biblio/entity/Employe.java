package biblio.entity;

import java.util.Date;

import biblio.util.BiblioException;
import biblio.util.EnumCategorieEmploye;

public class Employe extends Utilisateur {

	private String codeMatricule;
	private EnumCategorieEmploye categorieEmploye;

	public Employe() {
	}

	public Employe(String nom, String prenom, Date dateNaissance, String sexe, Integer idUtilisateur, String pwd,
			String pseudonyme, String codeMatricule, EnumCategorieEmploye categorieEmploye) {
		super(nom, prenom, dateNaissance, sexe, idUtilisateur, pwd, pseudonyme);
		this.codeMatricule = codeMatricule;
		this.categorieEmploye = categorieEmploye;
	}

	public String getCodeMatricule() {
		return codeMatricule;
	}

	public void setCodeMatricule(String codeMatricule) {
		this.codeMatricule = codeMatricule;
	}

	public EnumCategorieEmploye getCategorieEmploye() {
		return categorieEmploye;
	}

	public void setCategorieEmploye(EnumCategorieEmploye categorieEmploye) {
		this.categorieEmploye = categorieEmploye;
	}

	public Boolean isConditionsPretAcceptees() throws BiblioException {
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + "Employe [codeMatricule=" + codeMatricule + ", categorieEmploye=" + categorieEmploye
				+ "]";
	}

}
