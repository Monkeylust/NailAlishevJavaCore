package Day10_Trees.Task01ManualBinaryTree;

public class Main {
    public static void main(String[] args) {
        Node root = new Node(20,
                new Node(14,
                        new Node(11,
                                new Node(5,
                                        new Node(8),
                                        null),
                                null),
                        new Node(16,
                                new Node(15),
                                new Node(18))),
                new Node(23,
                        new Node(22),
                        new Node(27,
                                new Node(24),
                                new Node(150))));
    }
}

// Сложное задание смог только создать бинарное дерево вручную