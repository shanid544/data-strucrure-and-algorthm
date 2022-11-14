package binarytree;

public class BinarySearchTree {

    private TreeNode root;

    public void insert(int data) {
        if (root == null) {
            this.root = new TreeNode(data);
        } else {
            root.insert(data);
        }
    }

    public TreeNode find(int data) {
        if (root != null)
            return root.find(data);
        return null;
    }

    public void delete(int data){
        TreeNode node = root.find(data);
        node.delete();
    }

    public TreeNode smallest(){
        if(root!=null)
            return root.smallest();
        else
            return null;
    }

    public TreeNode largest(){
        if(root!=null)
            return root.largest();
        else
            return null;
    }

    /*public void delete(int data){
        TreeNode parent = this.root;
        TreeNode current = this.root;
        boolean isLeftNode  = false;

        if(current==null){
            return;
        }
        while (current!=null && current.getData()!=data){
            parent = current;

            if(current.getData()>data){
                current = current.getLeftNode();
                isLeftNode = true;
            }
            else {
                current = current.getRightNode();
                isLeftNode = false;
            }
        }
        if(current==null){
            return;
        }
        if(current.getRightNode()==null && current.getRightNode()==null){
            if(current==root){
                root=null;
            }
            else {
                if (isLeftNode) {
                    parent.setLeftNode(null);
                }
                else{
                    parent.setRightNode(null);
                }
            }
        }

        if(current.getLeftNode()==null){
            if(current==root){
                root=current.getRightNode();
            }
            else if(isLeftNode){
                parent.setLeftNode(current.getLeftNode());
            }
            else {
                parent.setRightNode(current.getRightNode());
            }
        }

        if(current.getRightNode()==null){
            if(current==root){
                root=current.getLeftNode();
            }
            else if(isLeftNode){
                parent.setLeftNode(current.getLeftNode());
            }
            else {
                parent.setRightNode(current.getRightNode());
            }
        }
    }*/
}
