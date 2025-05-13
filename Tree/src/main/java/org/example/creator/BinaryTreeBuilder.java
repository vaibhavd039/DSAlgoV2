package org.example.creator;

import org.example.structure.BinaryTree;

import java.lang.reflect.Array;
import java.util.List;

public class BinaryTreeBuilder {
    public static BinaryTree createStandardBinaryTree() {
        List<Integer> elements = List.of(1,2,3,4,5,6,7,8,9,10);
        return BinaryTreeCreator.createNumericBinaryTree(elements);
    }

    public static BinaryTree createSortedTree() {
        List<Integer> elements = List.of(10,6,14,4,8,12,16,2,5,7,9,11,13,15,17,1,3);
        return BinaryTreeCreator.createNumericBinaryTree(elements);
    }

    public static BinaryTree createSortedTreeUsingArray() {
        int [] elements = {10,6,14,4,8,12,16,2,5,7,9,11,13,15,17,1,3};
        return BinaryTreeCreator.createNumericBinaryTree(elements, 0);
    }
}
