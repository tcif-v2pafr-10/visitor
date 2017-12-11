package visitor_wiki;

public class HyperLink extends DocumentPart {
	public HyperLink(String text, String url) {
		super(text);
		this.url = url;
	}

	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
