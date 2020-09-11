import java.util.Random;

class TreeNode {

int data;

TreeNode left;

TreeNode right;

public TreeNode(int k) {

data = k;

left = null;

right = null;

}

}

public class BinarySearchTree {

public static TreeNode root;

public BinarySearchTree() {

this.root = null;

}

public boolean fetch(int id) {

TreeNode current = root;

while (current != null) {

if (current.data == id) {

return true;

} else if (current.data > id) {

current = current.left;

} else {

current = current.right;

}

}

return false;

}

public static TreeNode findMin(TreeNode root) {

if (root == null)

return root;

while (root.left != null)

root = root.left;

return root;

}

public TreeNode removeNode(TreeNode root, int val) {

if (root == null)

return null;

if (val < root.data)

root.left = removeNode(root.left, val);

else if (val > root.data)

root.right = removeNode(root.right, val);

else {

if (root.left == null)

return root.right;

if (root.right == null)

return root.left;

TreeNode x = root;

root = findMin(root.right);

root.right = removeNode(x.right, root.data);

root.left = x.left;

}

return root;

}

public void insert(int id) {

TreeNode newNode = new TreeNode(id);

if (root == null) {

root = newNode;

return;

}

TreeNode current = root;

TreeNode parent = null;

while (true) {

parent = current;

if (id < current.data) {

current = current.left;

if (current == null) {

parent.left = newNode;

return;

}

} else {

current = current.right;

if (current == null) {

parent.right = newNode;

return;

}

}

}

}

private int findSizeUtil(TreeNode root) {


if (root == null)

return 0;

else


return root.data + findSizeUtil(root.left) + findSizeUtil(root.right);

}

public int findSize() {



return findSizeUtil(root);

}

public void InorderTraversal() {

inOrderHelper(root);

}

private void inOrderHelper(TreeNode root) {

if (root != null) {

inOrderHelper(root.left);

System.out.print(root.data + " ");

inOrderHelper(root.right);

}

}

public void PreorderTraversal() {

preOrderHelper(root);

}

private void preOrderHelper(TreeNode root) {

if (root != null) {

System.out.print(root.data + " ");

preOrderHelper(root.left);

preOrderHelper(root.right);

}

}

public void PostorderTraversal() {

postOrderHelper(root);

}

private void postOrderHelper(TreeNode root) {

if (root != null) {

postOrderHelper(root.left);

postOrderHelper(root.right);

System.out.print(root.data + " ");

}

}

private void NRLTraversal() {


NRLTraversalHelper(root);

}

private void NRLTraversalHelper(TreeNode root) {


if (root != null) {

NRLTraversalHelper(root.left);

NRLTraversalHelper(root.right);

System.out.print(root.data + " ");

}

}

private void RNLTraversal() {


RNLTraversalHelper(root);

}

private void RNLTraversalHelper(TreeNode root) {



if (root != null) {

RNLTraversalHelper(root.right);

System.out.print(root.data + " ");

RNLTraversalHelper(root.left);

}

}

private void RLNTraversal() {

RLNTraversalHelper(root);

}

private void RLNTraversalHelper(TreeNode root) {

if (root != null) {

RLNTraversalHelper(root.right);

RLNTraversalHelper(root.left);

System.out.print(root.data + " ");

}

}

public static void main(String arg[]) {

Integer[] a = {35, 62, 17, 38, 7, 89, 14, 26, 3, 73, 31, 54};

BinarySearchTree binTree = new BinarySearchTree();

Random r = new Random();

for (int i = 0; i <a.length; ++i)

   binTree.insert(a[i]);

if(binTree.fetch(14))

   System.out.println("14 in tree.");

else

   System.out.println("14 not in tree.");

System.out.println("\nTraverse In Order: ");

binTree.InorderTraversal();

System.out.println();

System.out.println("\nTraverse Post-order: ");

binTree.PostorderTraversal();

System.out.println();

System.out.println("\nTraverse Pre-order: ");

binTree.PreorderTraversal();

System.out.println();

binTree.insert(37);

if(binTree.fetch(10))

   System.out.println("\nNode w/ val 10 in tree.");

else

   System.out.println("\nNode w/ val 10 not in tree.");

 }

}