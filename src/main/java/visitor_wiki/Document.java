package visitor_wiki;

import java.util.List;

public class Document {
	private List<DocumentPart> documentParts;

	public List<DocumentPart> getDocumentParts() {
		return documentParts;
	}

	public void setDocumentParts(List<DocumentPart> documentParts) {
		this.documentParts = documentParts;
	}

	public String toHTML() {     
		String output = "";     
		for (DocumentPart documentPart : this.documentParts) {
			output += documentPart.toHTML();
			}
		return output;   
		}
}
