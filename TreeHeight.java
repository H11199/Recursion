public class TreeHeight
{
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.root = new Node(1);
		tree.root.right = new Node(2);
		tree.root.left = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.left.right.left = new Node(5);
		tree.root.right.right = new Node(6);
		
		System.out.println(HeightOfTree(tree.root));
		
	}
	
	static int HeightOfTree(Node root){
	    // Base Condition
	    if(root==null) return 0;
	    
	    // Hypothesis
	    int left = HeightOfTree(root.left);
	    
	    System.out.println("left "+left);
	    int right = HeightOfTree(root.right);
	    System.out.println("right "+right);
	    
	    
	    // Induction
	    return 1+Math.max(left, right);
	}
}

class Node{
    int val;
    Node left, right;
    
    Node(int val){
        this.val = val;
        this.left = this.right = null;
    }
}
class Tree{
    Node root;
}
