
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Node;

public class SimpleChainedNode implements Node {
    private int value;
    private SimpleChainedNode next;

    public SimpleChainedNode(int value) {
        this.value = value;
        this.next = null;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    public void setNextNode(SimpleChainedNode next) {
        this.next = next;
    }

    public SimpleChainedNode getNextNode() {
        return next;
    }
}