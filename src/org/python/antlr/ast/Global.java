// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class Global extends stmtType {
    public String[] names;

    public static final String[] _fields = new String[] {"names"};

    public Global(Token token, String[] names) {
        super(token);
        this.names = names;
    }

    public Global(PythonTree tree, String[] names) {
        super(tree);
        this.names = names;
    }

    public String toString() {
        return "Global";
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitGlobal(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
    }

public int getLineno() {
    return getLine() + 1;
}

public int getCol_offset() {
    return getCharPositionInLine();
}

}
