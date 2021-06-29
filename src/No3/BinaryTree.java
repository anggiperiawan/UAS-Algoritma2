package No3;
public class BinaryTree {
    Node root;
    
    public boolean isEmpty(){
        return (root == null);
    }
    
    //method insert data
    public void insert(Node input){
        if(isEmpty()){
            root = input;
        } else{
            //cari parent yang sesuai dan (kiri/kanan)
            Node current = root;
            Node parent = null;
            boolean dikiri = true;
                while(current != null){
                    parent = current;
                    //kalau data yang akan diinputkan lebih besar,
                    //bergerak ke kanan
                    if (current.data < input.data){
                        current = current.right;
                        dikiri = false;
                    //else gerak ke kiri
                    } else if(current.data > input.data){
                        current = current.left;
                        dikiri = true;
                    }else{
                        System.out.println("data "+input.data+" sudah ada");
                        break;
                    }
                }    
                //hubungkan ke parent
                if(dikiri){
                    parent.left = input;
                } else{
                    parent.right = input;
                }
        }
    }    
        
        public void preOrder(){
            preOrder(root);
        }
        
        public void inOrder(){
            inOrder(root);
        }
        
        public void postOrder(){
            postOrder(root);
        }
        
        public void preOrder(Node akar){
    if (akar != null){
        System.out.print(akar.data+" ");
        preOrder(akar.left);
        preOrder(akar.right);
    }        
        }
        
        public void inOrder(Node akar){
    if (akar != null){
        inOrder(akar.left);
        System.out.print(akar.data+" ");
        inOrder(akar.right);
    }        
        }
        
        public void postOrder(Node akar){
    if (akar != null){
        postOrder(akar.left);
        postOrder(akar.right);
        System.out.print(akar.data+" ");
    }        
        }
        
    //method mencari data
    public Node search(int key){
        Node node = null;
        Node current = root;
        //lakukan pencarian selama current bukan null
        while(current != null){
            if(current.data == key){
                current = current.right;
            } else{
                current = current.left;
            }
        }
        return node;
    }
}

