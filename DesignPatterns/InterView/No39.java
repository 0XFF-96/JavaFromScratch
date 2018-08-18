public class No39{

    public static void mian(String[] args){

        public int treeDepth(BinaryTreeNode root)

            if (root == null) return 0;

            int left = treeDepth(root.getLchildNode());

            int right = treeDepth(root.getRchildNode());

            return (left > right)?left+1:right + 1;

    }
}


