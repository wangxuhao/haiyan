/* Generated By:JJTree: Do not edit this line. CTreeBinOp.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
package haiyan.exp;

public class CTreeBinOp extends SimpleNode {
  public CTreeBinOp(int id) {
    super(id);
  }

  public CTreeBinOp(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) throws ParseException {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=45323df0759dbc491dba93151e548d99 (do not edit this line) */
