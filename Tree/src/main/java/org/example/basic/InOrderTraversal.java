package org.example.basic;

import org.example.creator.BinaryTreeBuilder;
import org.example.iterator.BinaryTreeIterator;
import org.example.structure.BinaryTree;

public class InOrderTraversal {
    public static void main(String [] args){
        BinaryTree root = BinaryTreeBuilder.createSortedTreeUsingArray();
        BinaryTreeIterator.inOrderTraversal(root);
    }

}
