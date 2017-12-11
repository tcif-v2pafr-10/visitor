package visitor_wiki;

public interface Visitor {
	void visit(PlainText documentPart);   
	void visit(BoldText documentPart);   
	void visit(HyperLink documentPart);
	String getOutput();
}
