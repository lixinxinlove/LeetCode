package com.lixinxinlove.structure.tree;


/**
 * 基于 二分搜索树的 set 实现
 *
 * @param <E>
 */
public class BSTSet<E extends Comparable<E>> implements Set<E> {


    private BinarySearchTree<E> bst;

    public BSTSet() {
        bst = new BinarySearchTree<E>();
    }

    @Override
    public void add(E e) {
        bst.add(e);
    }

    @Override
    public void remove(E e) {

    }

    @Override
    public boolean contains(E e) {
        return false;
    }

    @Override
    public int getSize() {
        return bst.size();
    }

    @Override
    public boolean isEmpty() {
        return bst.isEmpty();
    }
}
