public class No27{

    public static void main(String[] args){
        BinaryTreeNode root = new BianryTreeNode(10);
        node1.setLchildNode(node3);root.setRchildNode(node2);


        while(head != null){
            System.out.println(head.getData());
            head = head.getRchildNode();

        }
    }

    private static BianryTreeNode convert(BinaryTreeNode root){
        BinaryTreeNode lastNOdeList = null;
        lastNodeList = converNode(root, lastNodeList);

        while (lastNodeLilst != null && lastNodeList.getLchildNode() != null){
            lstNodeList = lastNodeList.getLchildNode();
        }

        return lastNodeList;

    }

    private static BianryTreeNode converNode(BinaryTreeNode root, BinaryTreeNode 
                    lastNodeList){

        if (root == null)
            return null;

        BinaryTreeNode current = root;
        if(current.getLchildNode() != null){
            lastNodeList = converNode(current.getLchildNode(), lastNodeList);
        }

        return lastNodeList ;

                    }
