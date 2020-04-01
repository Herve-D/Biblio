package biblio.entity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import biblio.util.EnumStatusExemplaire;

public class Exemplaire {

	private Integer idExemplaire;
	private Date dateAchat;
	private EnumStatusExemplaire status;
	private String isbn;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Livre livre;
	protected List<EmpruntArchive> empruntArchive = new ArrayList<>();
	protected EmpruntEnCours empruntEnCours;

	public Exemplaire() {
		super();
	}

	public Exemplaire(Integer idExemplaire, Date dateAchat, EnumStatusExemplaire status, String isbn) {
		super();
		this.idExemplaire = idExemplaire;
		this.dateAchat = dateAchat;
		this.status = status;
		this.isbn = isbn;
	}

	public Integer getIdExemplaire() {
		return idExemplaire;
	}

	public void setIdExemplaire(Integer idExemplaire) {
		this.idExemplaire = idExemplaire;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public EnumStatusExemplaire getStatus() {
		return status;
	}

	public void setStatus(EnumStatusExemplaire status) {
		this.status = status;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Livre getLivre() {
		return livre;
	}

	public void setLivre(Livre livre) {
		this.livre = livre;
	}

	public List<EmpruntArchive> getEmpruntArchive() {
		return empruntArchive;
	}

	public void setEmpruntArchive(List<EmpruntArchive> empruntArchive) {
		this.empruntArchive = empruntArchive;
	}

	public EmpruntEnCours getEmpruntEnCours() {
		return empruntEnCours;
	}

	public void setEmpruntEnCours(EmpruntEnCours empruntEnCours) {
		this.empruntEnCours = empruntEnCours;
	}

	@Override
	public String toString() {
		return "Exemplaire [idExemplaire=" + idExemplaire + ", dateAchat=" + sdf.format(dateAchat) + ", status="
				+ status + ", isbn=" + isbn + "]";
	}

}
