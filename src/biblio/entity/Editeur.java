package biblio.entity;

public class Editeur {

	private String nomEditeur;
	private String ville;
	public Livre theLivre[];

	public Editeur() {

	}

	public String getNomEditeur() {
		return nomEditeur;
	}

	public void setNomEditeur(String nomEditeur) {
		this.nomEditeur = nomEditeur;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}
