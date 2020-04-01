package biblio.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import biblio.entity.Exemplaire;
import biblio.util.EnumStatusExemplaire;

public class ExemplaireDAO {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static List<Exemplaire> listeExemplaire = new ArrayList<>();

	static {
		try {
			listeExemplaire.add(
					new Exemplaire(1, sdf.parse("06/12/2018"), EnumStatusExemplaire.disponible, "Connard le barbant"));
			listeExemplaire
					.add(new Exemplaire(2, sdf.parse("06/12/1991"), EnumStatusExemplaire.disponible, "Les Misérables"));
			listeExemplaire
					.add(new Exemplaire(3, sdf.parse("06/12/1990"), EnumStatusExemplaire.disponible, "Guerre et paix"));
			listeExemplaire
					.add(new Exemplaire(4, sdf.parse("06/12/1985"), EnumStatusExemplaire.disponible, "Tintin à Wuhan"));
			listeExemplaire.add(
					new Exemplaire(5, sdf.parse("06/12/1984"), EnumStatusExemplaire.disponible, "Tintin et le corona"));
			listeExemplaire.add(new Exemplaire(6, sdf.parse("06/12/2002"), EnumStatusExemplaire.disponible,
					"Luky Luke et les daltons"));
			listeExemplaire
					.add(new Exemplaire(7, sdf.parse("06/12/2013"), EnumStatusExemplaire.disponible, ",klmfmfmfkjfm"));
			listeExemplaire.add(
					new Exemplaire(8, sdf.parse("06/12/2008"), EnumStatusExemplaire.disponible, "jlkjflkfjjfljflkj"));
			listeExemplaire.add(
					new Exemplaire(9, sdf.parse("06/12/2014"), EnumStatusExemplaire.disponible, "jlkjf jfjljf djlj"));
			listeExemplaire.add(
					new Exemplaire(10, sdf.parse("06/12/2016"), EnumStatusExemplaire.disponible, "nljfjf jjjfjf jjjf"));

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public Exemplaire findByKey(Integer id) {
		for (Exemplaire e : listeExemplaire) {
			if (e.getIdExemplaire() == id) {
				return e;
			}
		}
		return null;
	}

	public List<Exemplaire> findAll() {
		return listeExemplaire;
	}

	public Boolean updateStatus(Exemplaire exemplaire) {
		for (int i = 0; i < listeExemplaire.size(); i++) {
			if (listeExemplaire.get(i).getIdExemplaire() == exemplaire.getIdExemplaire()) {
				listeExemplaire.get(i).setStatus(exemplaire.getStatus());
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String str = "[";
		for (int i = 0; i < listeExemplaire.size(); i++) {
			str += listeExemplaire.get(i) + "\n";
		}
		str += "]";
		return str;
	}

}
