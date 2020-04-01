package biblio.entity;

public class Livre {

	private String isbn;
	private String titre;
	private Short anneeParution;
	private Integer nbPages;

	public Exemplaire exemplaires[];
	public Auteur auteurs[];
	public Editeur editeur;
	public Theme theme;

	public Livre() {
	}

	public Livre(String isbn, String titre, Short anneeParution, Integer nbPages) {
		super();
		this.isbn = isbn;
		this.titre = titre;
		this.anneeParution = anneeParution;
		this.nbPages = nbPages;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Short getAnneeParution() {
		return anneeParution;
	}

	public void setAnneeParution(Short anneeParution) {
		this.anneeParution = anneeParution;
	}

	public Integer getNbPages() {
		return nbPages;
	}

	public void setNbPages(Integer nbPages) {
		this.nbPages = nbPages;
	}

	public Exemplaire[] getExemplaires() {
		return exemplaires;
	}

	public void setExemplaires(Exemplaire[] exemplaires) {
		this.exemplaires = exemplaires;
	}

	public Auteur[] getAuteurs() {
		return auteurs;
	}

	public void setAuteurs(Auteur[] auteurs) {
		this.auteurs = auteurs;
	}

	public Editeur getEditeur() {
		return editeur;
	}

	public void setEditeur(Editeur editeur) {
		this.editeur = editeur;
	}

	public Theme getTheme() {
		return theme;
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	@Override
	public String toString() {
		return "Livre [isbn=" + isbn + ", titre=" + titre + ", anneeParution=" + anneeParution + ", nbPages=" + nbPages
				+ "]";
	}

}
