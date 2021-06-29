package No3;
public class BinaryTreeApp {
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        
        Node node;
        
        node = new Node(30);
        tree.insert(node);
        
        node = new Node (40);
        tree.insert(node);
        
        node = new Node (50);
        tree.insert(node);
        
        node = new Node (60);
        tree.insert(node);
        
        node = new Node (80);
        tree.insert(node);
        System.out.print("Traversal dengan InOrder : ");
        tree.inOrder();
        System.out.print("\nTraversal dengan PreOrder: ");
        tree.preOrder();
        System.out.print("\nTraversal dengan PostOrder: ");
        tree.postOrder();
        System.out.println();
        
        
        
        
    }
}