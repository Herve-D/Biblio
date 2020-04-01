package biblio.util;

public class BiblioException extends Exception {

	private static final long serialVersionUID = -5477997503588385730L;

	public BiblioException(String message) {
		super(message);
	}

	public BiblioException() {
		super("Erreur...");
	}

}
