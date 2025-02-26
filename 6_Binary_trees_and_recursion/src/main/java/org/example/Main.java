package org.example;
import java.util.*;
/*
// Demo of standard binary tree traversals


// Binary tree nodes with character data
class treeNode
{
    char data;
    treeNode left, right;

    public treeNode(char c, treeNode l, treeNode r)
    {
        data = c;
        left = l;
        right = r;
    }

    public void write()
    {
        System.out.print(data + " ");
    }
}


// Unordered binary tree of characters, for traversing
public class Main
{
    // Root of binary tree
    treeNode root;

    // Contructor
    public Main()
    {
        root = null;
    }

    // Public preorder traversal method
    public void preorder()
    {
        preorder(root);
    }

    // Recursive preorder traversal
    private void preorder(treeNode root)
    {
        if (root != null)
        {
            root.write();
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Public inorder traversal method
    public void inorder()
    {
        inorder(root);
    }

    // Recursive inorder traversal
    private void inorder(treeNode root)
    {
        if (root != null)
        {
            inorder(root.left);
            root.write();
            inorder(root.right);
        }
    }

    // Public postorder traversal method
    public void postorder()
    {
        postorder(root);
    }

    // Recursive postorder traversal
    public static void postorder(treeNode root)
    {
        if (root != null)
        {
            postorder(root.left);
            postorder(root.right);
            root.write();
        }
    }

    // Level-order traversal
    // Requires a FIFO-queue to store unvisited children
    public void levelorder()
    {
        if (root == null)
            return;

        // Uses linked-list queue from java.util
        Queue<treeNode> Q = new LinkedList<treeNode>();

        // Enqueue root node
        Q.add(root);

        while (!Q.isEmpty())
        {
            // Remove first node in queue and write out data
            treeNode tN = Q.remove();
            tN.write();

            // Enqueue children of first node
            if (tN.left != null)
                Q.add(tN.left);
            if (tN.right != null)
                Q.add(tN.right);
        }
    }

    // Test program
    public static void main(String args[])
    {
	/* Using this binary tree:

	              A
                     / \
                    B   C
                   / \   \
                  /   \   \
                 /     \   \
                D       E   F
               / \     / \   \
              G   H   I   J   K
                     / \
                    L   M
	 */



