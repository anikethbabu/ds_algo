package com.aniketh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {


    @Test
    void TreeCreation() {
        BinaryTree anikethTree = new BinaryTree(12);
        assertNull(anikethTree.root.left);
        assertNull(anikethTree.root.right);
        assertEquals(12, anikethTree.root.key);
    }

    @Test
    void Insert() {
        BinaryTree tree = new BinaryTree(12);
        tree.insert(10);
        assertEquals(10, tree.root.left.key);
        tree.insert(15);
        assertEquals(15, tree.root.right.key);
        tree.insert(5);
        assertEquals(5, tree.root.left.left.key);
        tree.insert(17);
        assertEquals(17, tree.root.right.right.key);

    }
    @Test
    void findMinimum(){
    BinaryTree tree = new BinaryTree(5);
    assertEquals(5, tree.findMinimum());
    tree.insert(2);
    assertEquals(2, tree.findMinimum());
    tree.insert(0);
    assertEquals(0, tree.findMinimum());
    tree.insert(123);
    assertEquals(0, tree.findMinimum());
    }

    @Test
    void findMax(){
        BinaryTree tree = new BinaryTree(5);
        tree.insert(20);
        assertEquals(20, tree.findMax());
        tree.insert(18);
        assertEquals(20, tree.findMax());
        tree.insert(1234);
        assertEquals(1234, tree.findMax());
        tree.insert(21);
        assertEquals(1234, tree.findMax());
    }

    @Test
    void delete(){
    BinaryTree tree = new BinaryTree(10);
    tree.insert(20);
    tree.insert(5);
    tree.delete(5);
    }

}