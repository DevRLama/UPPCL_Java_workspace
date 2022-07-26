package Data_structure;

class BST_class { 
    //node class that defines BST node
    class Node { 
        int key; 
        Node left, right; 
   
        public Node(int data){ 
            key = data; 
            left = right = null; 
        } 
    } 
    // BST root node 
    Node root; 
    int sum=0;
  
   // Constructor for BST =>initial empty tree
    BST_class(){ 
        root = null; 
    } 
    //delete a node from BST
    void deleteKey(int key) { 
        root = delete_Recursive(root, key); 
    } 
   
    //recursive delete function
    Node delete_Recursive(Node root, int key)  { 
        //tree is empty
        if (root == null)   return root; 
   
        //traverse the tree
        if (key < root.key)     //traverse left subtree 
            root.left = delete_Recursive(root.left, key); 
        else if (key > root.key)  //traverse right subtree
            root.right = delete_Recursive(root.right, key); 
        else  { 
            // node contains only one child
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 
   
            // node has two children; 
            //get inorder successor (min value in the right subtree) 
            root.key = minValue(root.right); 
   
            // Delete the inorder successor 
            root.right = delete_Recursive(root.right, root.key); 
        } 
        return root; 
    } 
   
    int minValue(Node root)  { 
        //initially minval = root
        int minval = root.key; 
        //find minval
        while (root.left != null)  { 
            minval = root.left.key; 
            root = root.left; 
        } 
        return minval; 
    } 
   
    // insert a node in BST 
    void insert(int key)  { 
        root = insert_Recursive(root, key); 
    } 
   
    //recursive insert function
    Node insert_Recursive(Node root, int key) { 
          //tree is empty
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
        //traverse the tree
        if (key < root.key)     //insert in the left subtree
            root.left = insert_Recursive(root.left, key); 
        else if (key > root.key)    //insert in the right subtree
            root.right = insert_Recursive(root.right, key); 
          // return pointer
        return root; 
    } 
 
// method for inorder traversal of BST 
    void inorder() { 
        if(root==null)
        {
            System.out.println("Tree is empty.");
        }else
        { inorder_Recursive(root); }
    } 
    void preorder() { 
        
        if(root==null)
        {
            System.out.println("Tree is empty.");
        }else{preorder_Recursive(root); }
    } 
    void postorder() { 
        if(root==null)
        {
            System.out.println("Tree is empty.");
        }else{
        postorder_Recursive(root); }
    } 
   
    // recursively traverse the BST  
    void inorder_Recursive(Node root) { 
        if (root != null) { 
            inorder_Recursive(root.left); 
            System.out.print(root.key + " ");
            //sum=sum+1; 
            inorder_Recursive(root.right); 
        } 
    } 

    void preorder_Recursive(Node root) { 
        if (root != null) { 
            System.out.print(root.key + " "); 
            preorder_Recursive(root.left); 
            preorder_Recursive(root.right); 
        } 
    } 

    void postorder_Recursive(Node root) { 
        if (root != null) { 
            
            postorder_Recursive(root.left); 
            postorder_Recursive(root.right); 
            System.out.print(root.key + " ");
        } 
    }
     
    boolean search(int key)  { 
        root = search_Recursive(root, key); 
        if (root!= null)
            return true;
        else
            return false;
    } 
   
    //recursive insert function
    Node search_Recursive(Node root, int key)  { 
        // Base Cases: root is null or key is present at root 
        if (root==null || root.key==key) 
            return root; 
        // val is greater than root's key 
        if (root.key > key) 
            return search_Recursive(root.left, key); 
        // val is less than root's key 
        return search_Recursive(root.right, key); 
    } 

    // recursively find the number of children in tree.
    void numChild()
    { System.out.println(root);
        System.out.println("Total children:"+(numChild_recursive(root)));}

    int numChild_recursive(Node root)
    {
        if (root != null) { 
             
            //System.out.print(root.key + " ");
            if(root.left==null && root.right==null){sum=sum+1;} 
            numChild_recursive(root.left);
            numChild_recursive(root.right); 
        } 
        return sum;
    }
}
class Main{
    public static void main(String[] args)  { 
       //create a BST object
        BST_class bst = new BST_class(); 
       //insert data into BST
       bst.insert(45); 
       bst.insert(10); 
       bst.insert(7); 
       bst.insert(12); 
       bst.insert(90); 
       bst.insert(50); 
       bst.insert(56);
        //print the BST
        System.out.println("The BST Created with input data(Left-root-right):"); 
        bst.inorder(); 
        
       // //delete leaf node  
       // System.out.println("\nThe BST after Delete 12(leaf node):"); 
       // bst.deleteKey(12); 
       // System.out.println("\nInorder: ");
       // bst.inorder(); 
        
        System.out.println("\nPreorder: ");
        bst.preorder();

        System.out.println("\nPostorder: ");
        bst.postorder();

        System.out.println("\nTotal children: ");
        bst.numChild();


       /*  //delete the node with one child
        System.out.println("\nThe BST after Delete 90 (node with 1 child):"); 
        bst.deleteKey(90); 
        bst.inorder(); 
                 
        //delete node with two children  
        System.out.println("\nThe BST after Delete 45 (Node with two children):"); 
        bst.deleteKey(45); 
        bst.inorder(); 
        //search a key in the BST
        boolean ret_val = bst.search (50);
        System.out.println("\nKey 50 found in BST:" + ret_val );
        ret_val = bst.search (12);
        System.out.println("\nKey 12 found in BST:" + ret_val ); */
     } 
}