

private static ComplexListNode clone(ComplexListNode head){
    cloneNodes(head);
    copySibingNodes(head);

    return separateNodes(node);
}

private static ComplexListNode separateNodes(ComplexListNode head){
    ComplexListNode node = head;
    ComplexListNode cloneHead = null;
    ComplexListNode cloneNode = null;

    if (node!= null){
        cloneNode = node.next;
        cloneHead = cloneNode;
        node.next = cloneNode.next;
        node=node.next;
    }

    while (node != null){
        cloneNode.next = node.next;
        cloneNode = cloneNode.next;
        node.next = cloneNode.next;
        node = node.next;

    }
    return cloneHead;
}


private static void copySibingNodes(ComplexListNode head){
    ComplexListNode node = head;

    while (node != null){
        ComplexListNode cloneNode = node.next;

        if (node.sibling != null){
                cloneNode.sibling = node.sibling.next;
        }
        node = cloneNode.next;
    }
}

private static void cloneNodes(ComplexListNode head){
    ComplexListNode node = head;
    while(node != null){
        ComplexListNode cloneNode = new ComplexListNode(node.data);
        cloneNode.next = node.next;
        node.next = cloneNext;
        node = cloneNode.next;
    }
}

class ComplexListNode{
    int data;
    ComplexListNode next;
    ComplexListNode sibling;

    public ComplexListNode(int data){
        super();
        this.data = data;
    }
}

