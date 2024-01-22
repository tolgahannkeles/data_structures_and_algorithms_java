public class BinarySearchTree<T extends Comparable<T>> {

    public BinarySearchTree(){}
    public BSTNode<T> insert(BSTNode<T> root, T data) {
        if (root == null) {
            root = new BSTNode<>(data, null, null);
            return root;
        } else if (root.data.compareTo(data) > 0) {
            root.left = insert(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public void displayInOrder(BSTNode<T> root, int depth) {
        if (root == null) return;

        int spaces = depth * 4;

        displayInOrder(root.right, depth + 1);

        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
        System.out.println(root.data);

        displayInOrder(root.left, depth + 1);
    }



    public static void main(String[] args) {
        BSTNode<Integer> root=null;
        BinarySearchTree<Integer> bst= new BinarySearchTree<>();
        root= bst.insert(root,1);
        root= bst.insert(root,3);
        root= bst.insert(root,4);
        root= bst.insert(root,2);
        root= bst.insert(root,6);



        bst.displayInOrder(root,0);
    }

}

class BSTNode<T extends Comparable<T>> {
    T data;
    BSTNode<T> left;
    BSTNode<T> right;

    public BSTNode(T data, BSTNode<T> left, BSTNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
