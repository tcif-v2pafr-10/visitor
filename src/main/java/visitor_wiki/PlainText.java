package visitor_wiki;

public class PlainText extends DocumentPart {

	public PlainText(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toHTML() {
		// TODO Auto-generated method stub
		return this.text;
	}

	@Override
	public String ToPlainText() {
		return this.text;
	}

	@Override
	public String ToLatex() {
		return this.text;
	}

}
