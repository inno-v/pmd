/* Generated By:JJTree: Do not edit this line. ASTTriggerTimingPointSection.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTTriggerTimingPointSection extends SimpleNode {
  public ASTTriggerTimingPointSection(int id) {
    super(id);
  }

  public ASTTriggerTimingPointSection(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=ab5653c9b12606b08a07f5f9a76013c5 (do not edit this line) */