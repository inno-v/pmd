/* Generated By:JJTree: Do not edit this line. ASTAttributeTest.java */

package net.sourceforge.pmd.jerry.ast.xpath;

public class ASTAttributeTest extends SimpleNode {
  public ASTAttributeTest(int id) {
    super(id);
  }

  public ASTAttributeTest(XPath2Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(XPath2ParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}