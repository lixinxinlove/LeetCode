package com.lixinxinlove.structure.tree;

/**
 * 节点
 */
public class Node<E extends Comparable<E>> {
    E e;
    Node left;
    Node right;

    public Node(E e) {
        this.e = e;
        left = null;
        right = null;
    }

}
