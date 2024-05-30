public class BinaryTreeMain24 {
    public static void main(String[] args) {
        BinaryTree24 bt = new BinaryTree24();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.print("InOrder Traversal : ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.print("PostOrder Traversal : ");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Nilai paling kecil dalam Tree: " + bt.findMinValue());
        System.out.println("Nilai paling besar dalam Tree: " + bt.findMaxValue());
        System.out.println("");
        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.println("Data yang ada di leaf:");
        bt.printLeafNodes();
        System.out.println();
        System.out.println("Jumlah leaf dalam tree: " + bt.countLeafNodes());
    }
}
