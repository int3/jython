// Autogenerated AST node
package org.python.antlr.ast;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.python.antlr.PythonTree;
import org.python.antlr.adapter.AstAdapters;
import org.python.core.AstList;
import org.python.core.Py;
import org.python.core.PyObject;
import org.python.core.PyString;
import org.python.core.PyType;
import org.python.expose.ExposedGet;
import org.python.expose.ExposedMethod;
import org.python.expose.ExposedNew;
import org.python.expose.ExposedSet;
import org.python.expose.ExposedType;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

@ExposedType(name = "_ast.Assert", base = PyObject.class)
public class Assert extends stmtType {
public static final PyType TYPE = PyType.fromClass(Assert.class);
    private exprType test;
    public exprType getInternalTest() {
        return test;
    }
    @ExposedGet(name = "test")
    public PyObject getTest() {
        return test;
    }
    @ExposedSet(name = "test")
    public void setTest(PyObject test) {
        this.test = AstAdapters.to_expr(test);
    }

    private exprType msg;
    public exprType getInternalMsg() {
        return msg;
    }
    @ExposedGet(name = "msg")
    public PyObject getMsg() {
        return msg;
    }
    @ExposedSet(name = "msg")
    public void setMsg(PyObject msg) {
        this.msg = AstAdapters.to_expr(msg);
    }


    private final static String[] fields = new String[] {"test", "msg"};
    public String[] get_fields() { return fields; }

    public Assert() {
        this(TYPE);
    }
    public Assert(PyType subType) {
        super(subType);
    }
    @ExposedNew
    @ExposedMethod
    public void Module___init__(PyObject[] args, String[] keywords) {}
    public Assert(PyObject test, PyObject msg) {
        setTest(test);
        setMsg(msg);
    }

    public Assert(Token token, exprType test, exprType msg) {
        super(token);
        this.test = test;
        addChild(test);
        this.msg = msg;
        addChild(msg);
    }

    public Assert(Integer ttype, Token token, exprType test, exprType msg) {
        super(ttype, token);
        this.test = test;
        addChild(test);
        this.msg = msg;
        addChild(msg);
    }

    public Assert(PythonTree tree, exprType test, exprType msg) {
        super(tree);
        this.test = test;
        addChild(test);
        this.msg = msg;
        addChild(msg);
    }

    public String toString() {
        return "Assert";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("Assert(");
        sb.append("test=");
        sb.append(dumpThis(test));
        sb.append(",");
        sb.append("msg=");
        sb.append(dumpThis(msg));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitAssert(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (test != null)
            test.accept(visitor);
        if (msg != null)
            msg.accept(visitor);
    }

    private int lineno = -1;
    public int getLineno() {
        if (lineno != -1) {
            return lineno;
        }
        return getLine();
    }

    public void setLineno(int num) {
        lineno = num;
    }

    private int col_offset = -1;
    public int getCol_offset() {
        if (col_offset != -1) {
            return col_offset;
        }
        return getCharPositionInLine();
    }

    public void setCol_offset(int num) {
        col_offset = num;
    }

}
