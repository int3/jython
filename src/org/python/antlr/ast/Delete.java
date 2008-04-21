// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class Delete extends stmtType {
    public exprType[] targets;

    public static final String[] _fields = new String[] {"targets"};

    public Delete(PythonTree tree, exprType[] targets) {
        super(tree);
        this.targets = targets;
        for(int itargets=0;itargets<targets.length;itargets++) {
            addChild(targets[itargets]);
        }
    }

    public String toString() {
        return "Delete";
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitDelete(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (targets != null) {
            for (int i = 0; i < targets.length; i++) {
                if (targets[i] != null)
                    targets[i].accept(visitor);
            }
        }
    }

    public int getLineno() {
        return getLine();
    }

    public int getCol_offset() {
        return getCharPositionInLine();
    }

}
