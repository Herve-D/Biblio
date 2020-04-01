package biblio.entity;

public class Theme {

	private String code;
	private String libelle;
	Theme sousThemes[];
	Theme themeParent;
	public Livre livres[];

	public Theme() {

	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
