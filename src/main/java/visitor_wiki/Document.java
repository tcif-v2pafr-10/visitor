package visitor_wiki;

import java.util.ArrayList;
import java.util.List;

public class Document {
	private List<DocumentPart> documentParts = new ArrayList<DocumentPart>();

	public List<DocumentPart> getDocumentParts() {
		return documentParts;
	}

	public void setDocumentParts(List<DocumentPart> documentParts) {
		this.documentParts = documentParts;
	}

	public String toHTML() {
		String output = "<html><head></head><body>";
		for (DocumentPart documentPart : this.documentParts) {
			output += documentPart.toHTML();
		}
		output += "</body></html>";
		return output;
	}

	public String toPlainText() {
		String output = "";
		for (DocumentPart documentPart : this.documentParts) {
			output += documentPart.ToPlainText();
		}

		return output;
	}

	public String toLatex() {
		String output = "";
		for (DocumentPart documentPart : this.documentParts) {
			output += documentPart.ToLatex();
		}

		return output;
	}

	public void addDocumentPart(DocumentPart documentPart) {
		documentParts.add(documentPart);
	}
}
