package br.com.rbarbiero.algorithms.searching;

import br.com.rbarbiero.datastructure.tree.BinaryTree;
import java.util.Objects;

/***
	* For each visited node, the total of remaining nodes that have to be looked will decrease
	* Time complexity O(log_n)
	*/
public class BinarySearchTree {

	public Integer execute(final BinaryTree root, final Integer value) {

		if (root == null) return null;
		if (Objects.equals(root.getValue(), value)) return root.getValue();

		return (value > root.getValue()) ? this.execute(root.getRight(), value) : this.execute(root.getLeft(), value);
	}
}
