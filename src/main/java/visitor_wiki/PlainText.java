package visitor_wiki;

public class PlainText extends DocumentPart {

	public PlainText(String text) {
		super(text);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
