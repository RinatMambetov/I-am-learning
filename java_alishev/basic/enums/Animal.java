package enums;

public enum Animal {
	DOG("sobaka"),
	CAT("koshka");

	private String translation;

	Animal(String translation) {
		this.translation = translation;
	}

	public String getTranslation() {
		return (translation);
	}

	public String toString() {
		return ("perevod " + translation);
	}
}
