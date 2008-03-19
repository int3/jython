// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class BinOp extends exprType {
    public exprType left;
    public operatorType op;
    public exprType right;

    public static final String[] _fields = new String[] {"left","op","right"};

    public BinOp(Token token, exprType left, operatorType op, exprType right) {
        super(token);
        this.left = left;
        this.op = op;
        this.right = right;
    }

    public BinOp(PythonTree tree, exprType left, operatorType op, exprType
    right) {
        super(tree);
        this.left = left;
        this.op = op;
        this.right = right;
    }

    public String toString() {
        return "BinOp";
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitBinOp(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (left != null)
            left.accept(visitor);
        if (right != null)
            right.accept(visitor);
    }

}
