package com.aniketh;

public class BinaryTree {
    TreeNode root;

    public void insert(int key) {
        TreeNode subTree = root;
        insertRecursion(subTree, key);
    }

    private void insertRecursion(TreeNode subTree, int key) {
        if (subTree.key > key) {
            if (subTree.left == null)
                subTree.left = new TreeNode(key);
            else
                insertRecursion(subTree.left, key);
        } else {
            if (subTree.right == null)
                subTree.right = new TreeNode(key);
            else
                insertRecursion(subTree.right, key);
        }
    }

    public int findMinimum() {
        TreeNode subTree = root;
        return findMinRecursions(subTree);
    }

    private int findMinRecursions(TreeNode subTree) {
        while (true) {
            if (subTree.left == null) {
                return subTree.key;
            } else {
                subTree = subTree.left;
                findMinRecursions(subTree);
            }
        }

    }

    public int findMax() {
        TreeNode subTree = root;
        return findMaxRecursions(subTree);
    }

    private int findMaxRecursions(TreeNode subTree) {
        while (true) {
            if (subTree.right == null) {
                return subTree.key;
            } else {
                subTree = subTree.right;
                findMaxRecursions(subTree);
            }
        }
    }

    public void delete(int key) {
        TreeNode subTree = root;




    }


    class TreeNode {
        int key;
        TreeNode left;
        TreeNode right;

        public TreeNode(int key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }

    public BinaryTree(int value) {
        root = new TreeNode(value);

    }

}
