// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class Slice extends sliceType {
    public exprType lower;
    public exprType upper;
    public exprType step;

    public static final String[] _fields = new String[]
    {"lower","upper","step"};

    public Slice(Token token, exprType lower, exprType upper, exprType step) {
        super(token);
        this.lower = lower;
        this.upper = upper;
        this.step = step;
    }

    public Slice(PythonTree tree, exprType lower, exprType upper, exprType
    step) {
        super(tree);
        this.lower = lower;
        this.upper = upper;
        this.step = step;
    }

    public String toString() {
        return "Slice";
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitSlice(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (lower != null)
            lower.accept(visitor);
        if (upper != null)
            upper.accept(visitor);
        if (step != null)
            step.accept(visitor);
    }

}
