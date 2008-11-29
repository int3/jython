// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.python.antlr.adapter.AstAdapters;
import org.python.antlr.adapter.ListWrapper;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.python.core.Py;
import org.python.core.PyObject;
import org.python.core.PyType;
import org.python.expose.ExposedGet;
import org.python.expose.ExposedMethod;
import org.python.expose.ExposedNew;
import org.python.expose.ExposedSet;
import org.python.expose.ExposedType;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

@ExposedType(name = "_ast.Attribute", base = PyObject.class)
public class Attribute extends exprType implements Context {
public static final PyType TYPE = PyType.fromClass(Attribute.class);
    private exprType value;
    public exprType getInternalValue() {
        return value;
    }
    @ExposedGet(name = "value")
    public PyObject getValue() {
        return Py.None;
    }
    @ExposedSet(name = "value")
    public void setValue(Object value) {
        this.value = AstAdapters.to_expr(value);
    }

    private String attr;
    public String getInternalAttr() {
        return attr;
    }
    @ExposedGet(name = "attr")
    public PyObject getAttr() {
        return Py.None;
    }
    @ExposedSet(name = "attr")
    public void setAttr(Object attr) {
        this.attr = AstAdapters.to_identifier(attr);
    }

    private expr_contextType ctx;
    public expr_contextType getInternalCtx() {
        return ctx;
    }
    @ExposedGet(name = "ctx")
    public PyObject getCtx() {
        return Py.None;
    }
    @ExposedSet(name = "ctx")
    public void setCtx(Object ctx) {
        this.ctx = AstAdapters.to_expr_context(ctx);
    }


    private final static String[] fields = new String[] {"value", "attr",
                                                          "ctx"};
    public String[] get_fields() { return fields; }

    public Attribute() {
        this(TYPE);
    }
    public Attribute(PyType subType) {
        super(subType);
    }
    @ExposedNew
    @ExposedMethod
    public void Module___init__(PyObject[] args, String[] keywords) {}
    public Attribute(Object value, Object attr, Object ctx) {
        setValue(value);
        setAttr(attr);
        setCtx(ctx);
    }

    public Attribute(Token token, exprType value, String attr, expr_contextType
    ctx) {
        super(token);
        this.value = value;
        addChild(value);
        this.attr = attr;
        this.ctx = ctx;
    }

    public Attribute(Integer ttype, Token token, exprType value, String attr,
    expr_contextType ctx) {
        super(ttype, token);
        this.value = value;
        addChild(value);
        this.attr = attr;
        this.ctx = ctx;
    }

    public Attribute(PythonTree tree, exprType value, String attr,
    expr_contextType ctx) {
        super(tree);
        this.value = value;
        addChild(value);
        this.attr = attr;
        this.ctx = ctx;
    }

    public String toString() {
        return "Attribute";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("Attribute(");
        sb.append("value=");
        sb.append(dumpThis(value));
        sb.append(",");
        sb.append("attr=");
        sb.append(dumpThis(attr));
        sb.append(",");
        sb.append("ctx=");
        sb.append(dumpThis(ctx));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitAttribute(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (value != null)
            value.accept(visitor);
    }

    public void setContext(expr_contextType c) {
        this.ctx = c;
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
