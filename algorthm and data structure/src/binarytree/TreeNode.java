package binarytree;

public class TreeNode {
    private int data;
    private TreeNode leftNode;
    private TreeNode rightNode;
    boolean isDeleted = false;

    public TreeNode(int data) {
        this.data = data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public int getData() {
        return data;
    }

    public void setLeftNode(TreeNode rightNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public TreeNode find(int data){
        if(this.data==data && !isDeleted){
            return this;
        }
        if(data<this.data && leftNode!=null){
            return leftNode.find(data);
        }
        if(rightNode!=null){
            return rightNode.find(data);
        }
        return null;
    }

    public TreeNode smallest(){
        if(this.leftNode==null)
            return this;
        else
           return this.leftNode.smallest();
    }

    public TreeNode largest(){
        if(this.rightNode==null)
            return this;
        else
            return this.rightNode.largest();
    }

    public void travers(){
        if (this.leftNode != null)
            this.leftNode.travers();
        System.out.print(this + " ");
        if (this.rightNode != null)
            this.rightNode.travers();

    }

    public void insert(int data){
        if(data>this.data){
            if(rightNode==null){
                this.rightNode=new TreeNode(data);
            }
            else{
                this.rightNode.insert(data);
            }
        }
        else{
            if(leftNode==null){
                this.leftNode=new TreeNode(data);
            }
            else{
                this.leftNode.insert(data);
            }
        }
    }

    public void delete(){
        this.isDeleted = true;
    }
    @Override
    public String toString() {
        return String.valueOf(this.data);
    }
}
