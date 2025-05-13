package org.example.basic;

import org.example.creator.BinaryTreeBuilder;
import org.example.iterator.BinaryTreeIterator;
import org.example.structure.BinaryTree;

public class LevelOrderTraversal {
    public static void main(String [] args){
        BinaryTree root = BinaryTreeBuilder.createStandardBinaryTree();
        BinaryTreeIterator.levelOrderTraversal(root);
    }
}
