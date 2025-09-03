package basic;

import builder.BinaryTreeBuilder;
import structure.BinaryTree;

public class CheckCousin {
    public static void main(String [] args){
        BinaryTree root1 = BinaryTreeBuilder.buildTreeFromArray(new int[] {1,2,3,4,5,6,7,8,9,10});
        System.out.println(isCousin(root1, 4,6));
        System.out.println(isCousin(root1, 8,4));
    }

    // one way to do level order traversal
    // iterate complete level and check if two keys are at same level.
    // another way is to check depth, if both have same depth then both are cousin
    public static boolean isCousin(BinaryTree root, int key1, int key2){
        int depth1 = getDepth(root, key1,0);
        int depth2 = getDepth(root, key2, 0);
        return  depth2==depth1;
    }

    public static int getDepth(BinaryTree root, int key , int depth){
        if(root==null)
            return 0;
        if(root.data ==key)
            return depth;
        int curr = getDepth(root.left, key,depth+1 );
         if(curr!=0)
             return curr;
         else
             return getDepth(root.right, key, depth+1);
    }
}
