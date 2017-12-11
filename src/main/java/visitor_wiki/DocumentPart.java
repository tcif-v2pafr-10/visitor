package visitor_wiki;

public abstract class DocumentPart {
	protected String text;
	public abstract String toHTML();

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}

