/* Generated By:JJTree: Do not edit this line. ASTRoot.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
package haiyan.exp;

public class CTreeRoot extends SimpleNode {
  public CTreeRoot(int id) {
    super(id);
  }

  public CTreeRoot(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) throws ParseException {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=da43caa13169b68e0ac5fc1cd9e98b01 (do not edit this line) */
