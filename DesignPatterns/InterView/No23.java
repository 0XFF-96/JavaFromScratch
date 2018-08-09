import java.util.Queue

public class No23{

	public static void main(String[] args){

		BinaryTreeNode node1=new BinaryTreeNode(8);

		printFromToBottom(node1);

	}

	private static void printFromToBottom(BinaryTree root){
		if (root == null)
			return ;
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.add(root)

		while(!queue.isEmtpy()){
			BianryTreeNode node = queue.poll();
			System.out.println(node.getData());
			if (node.getLchildNode() != null){

				queue.add(node.getLchildNOde());
			if(node.getRchildNOde() != null){
				queue.add(node.getRchildNode());
			}
		}
	}

