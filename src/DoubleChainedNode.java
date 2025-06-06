
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Node;

public class DoubleChainedNode implements Node {
    private int value;
    private DoubleChainedNode next;
    private DoubleChainedNode prev;

    public DoubleChainedNode(int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    public void setNextNode(DoubleChainedNode next) {
        this.next = next;
    }

    public DoubleChainedNode getNextNode() {
        return next;
    }

    public void setPrevNode(DoubleChainedNode prev) {
        this.prev = prev;
    }

    public DoubleChainedNode getPrevNode() {
        return prev;
    }
}