public class DoubleChainedList {
    private DoubleChainedNode head;

    public void addValue(int value) {
        DoubleChainedNode newNode = new DoubleChainedNode(value);
        if (head == null) {
            head = newNode;
        } else {
            DoubleChainedNode temp = head;
            while (temp.getNextNode() != null) {
                temp = temp.getNextNode();
            }
            temp.setNextNode(newNode);
            newNode.setPrevNode(temp);
        }
    }

    public void removeNodeByValue(int value) {
        if (head == null) return;
        if (head.getValue() == value) {
            head = head.getNextNode();
            if (head != null) head.setPrevNode(null);
            return;
        }
        DoubleChainedNode temp = head;
        while (temp != null && temp.getValue() != value) {
            temp = temp.getNextNode();
        }
        if (temp != null) {
            if (temp.getNextNode() != null) {
                temp.getNextNode().setPrevNode(temp.getPrevNode());
            }
            if (temp.getPrevNode() != null) {
                temp.getPrevNode().setNextNode(temp.getNextNode());
            }
        }
    }

    public void listNodes() {
        DoubleChainedNode temp = head;
        while (temp != null) {
            System.out.print(temp.getValue() + " <-> ");
            temp = temp.getNextNode();
        }
        System.out.println("null");
    }
}

