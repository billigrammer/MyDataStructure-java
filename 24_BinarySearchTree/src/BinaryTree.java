public class BinaryTree{

    private Node tree;

    public BinaryTree(int data){
        this.tree = new Node(data);
    }

    //查找
    public Node find(int data){
        Node p = tree;
        while(p != null){
            //若大于当前值,沿右子树寻找
            if(data > p.data){
                p = p.right;
            } else if (data < p.data) {
                p = p.left;
            }else{
                return p;
            }
        }
        return null;
    }

    //插入
    public void insert(int data){
        Node p = tree;
        while(p != null){
            if (data > p.data) {
                if(p.right == null){
                    p.right = new Node(data);
                    return;
                }
                p = p.right;
            }else{
                if(p.left == null){
                    p.left = new Node(data);
                    return;
                }
                p = p.left;
            }
        }
    }


    public static class Node{
        private int data;
        private Node left;
        private Node right;

        public Node(int data){
            this.data = data;
        }
    }
}