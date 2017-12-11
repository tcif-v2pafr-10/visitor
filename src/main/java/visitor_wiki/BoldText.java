package visitor_wiki;

public class BoldText extends DocumentPart {

	@Override
	public String toHTML() {
		return "<b>" + this.text + "</b>";
	}

}
