/* Generated By:JJTree: Do not edit this line. ASTBoolConstrant.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
package haiyan.exp;

public class CTreeBoolConstrant extends SimpleNode {
  public CTreeBoolConstrant(int id) {
    super(id);
  }

  public CTreeBoolConstrant(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) throws ParseException {
    return visitor.visit(this, data);
  }
  
  private Boolean b = null;

	boolean getValue() {
		if (b == null)
			b = text.equalsIgnoreCase("true");
		return b;
	}
}
/* JavaCC - OriginalChecksum=4945046840570cc64777d9105bd568aa (do not edit this line) */
