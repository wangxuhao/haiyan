/* Generated By:JJTree: Do not edit this line. ASTFunOp.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
package haiyan.exp;

public class CTreeFunOp extends SimpleNode {
  public CTreeFunOp(int id) {
    super(id);
  }

  public CTreeFunOp(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) throws ParseException {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=5c170fd38dfcbe61721a4ad6cf67d5b7 (do not edit this line) */
