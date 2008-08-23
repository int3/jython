// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class Raise extends stmtType {
    public exprType type;
    public exprType inst;
    public exprType tback;

    public static final String[] _fields = new String[] {"type","inst","tback"};

    public Raise(Token token, exprType type, exprType inst, exprType tback) {
        super(token);
        this.type = type;
        addChild(type);
        this.inst = inst;
        addChild(inst);
        this.tback = tback;
        addChild(tback);
    }

    public Raise(int ttype, Token token, exprType type, exprType inst, exprType
    tback) {
        super(ttype, token);
        this.type = type;
        addChild(type);
        this.inst = inst;
        addChild(inst);
        this.tback = tback;
        addChild(tback);
    }

    public Raise(PythonTree tree, exprType type, exprType inst, exprType tback)
    {
        super(tree);
        this.type = type;
        addChild(type);
        this.inst = inst;
        addChild(inst);
        this.tback = tback;
        addChild(tback);
    }

    public String toString() {
        return "Raise";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("Raise(");
        sb.append("type=");
        sb.append(dumpThis(type));
        sb.append(",");
        sb.append("inst=");
        sb.append(dumpThis(inst));
        sb.append(",");
        sb.append("tback=");
        sb.append(dumpThis(tback));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitRaise(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (type != null)
            type.accept(visitor);
        if (inst != null)
            inst.accept(visitor);
        if (tback != null)
            tback.accept(visitor);
    }

    public int getLineno() {
        return getLine();
    }

    public int getCol_offset() {
        return getCharPositionInLine();
    }

}
