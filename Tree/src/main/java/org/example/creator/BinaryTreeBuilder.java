package org.example.creator;

import org.example.structure.BinaryTree;

import java.util.List;

public class BinaryTreeBuilder {
    public static BinaryTree createStandardBinaryTree() {
        List<Integer> elements = List.of(1,2,3,4,5,6,7,8,9,10);
        return BinaryTreeCreator.createNumericBinaryTree(elements);
    }
}
