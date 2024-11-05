// Сделал Серега

package Day10_Trees.Task01HardTaskSerega;

public class Main {
    public static void main(String[] args) {
        Node root = new Node(20);

        int[] arr = {14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};
//        int[] arr = {5, 8, 11, 14, 15, 16, 18, 22, 23, 24, 27, 150};

        for (int n : arr) {
            root.add(n, root.getRoot());
        }
//        printNodes(root.getRoot(), 1);
        printSortValues(root);
    }

    public static void printNodes(Node root, int level){
        if(root != null) {
            System.out.printf("level: %d value: %d\n", level, root.getValue());
            level++;
            printNodes(root.getLeft(), level);
            printNodes(root.getRight(), level);
        }
    }

    public static void printSortValues(Node root){
        if(root.getLeft() != null){
            printSortValues(root.getLeft());
        }

        System.out.println(root.getValue());

        if(root.getRight() != null){
            printSortValues(root.getRight());
        }
    }
}
class Node {
    private int value;
    private Node root;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
        if(root == null){
            root = this;
        }
    }

    public void add(int v, Node root){
        if(v >= value){
            if(right == null){
                right = new Node(v);
            } else {
                right.add(v, right);
            }
        } else {
            if(left == null){
                left = new Node(v);
            } else {
                left.add(v, left);
            }
        }
    }

    public int getValue() {
        return value;
    }

    public Node getRoot() {
        return root;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
//
//    public void setValue(int value) {
//        this.value = value;
//    }
//
//    public void setRoot(Node root) {
//        this.root = root;
//    }
//
//    public void setLeft(Node left) {
//        this.left = left;
//    }
//
//    public void setRight(Node right) {
//        this.right = right;
//    }
}