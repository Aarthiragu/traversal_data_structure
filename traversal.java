class node{
    int value;
    node left,right;
    node(int value){
        this.value=value;
        left=right=null;
    }

}
public class traversal{
    public void inorder(node root){
        if(root==null)
          return;
        inorder(root.left);
        System.out.print(root.value+" ");
        inorder(root.right);
    }
    public void preorder(node root){
        if(root==null)
          return;
        
        System.out.print(root.value+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public void postorder(node root){
        if(root==null)
          return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value+" ");
    }

    public static void main(String[]args){
        node root=new node(4);
        root.left=new node(2);
        root.right=new node(5);
        root.left.left=new node(3);
        root.right.left=new node(7);
        root.right.right=new node(6);
        root.left.left.right=new node(9);
        root.right.right.left=new node(8);
        root.left.left.right.left=new node(1);
        traversal tree=new traversal();
        System.out.println("inorder traversal");
        tree.inorder(root);
        System.out.println();
        System.out.println("preorder traversal");
        tree.preorder(root);
        System.out.println();
        System.out.println("postorder traversal");
        tree.postorder(root);

    }
}

