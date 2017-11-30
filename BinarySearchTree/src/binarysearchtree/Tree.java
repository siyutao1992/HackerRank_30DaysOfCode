/*
 * Copyright 2015 SiyuTAO
 */
package binarysearchtree;

/**
 *
 * @author SiyuTao
 * @param <D>
 */
public interface Tree<D extends Comparable> {
    public boolean isEmpty();
    public int cardinality();
    public boolean member(D elt);
    public NonEmptyBST<D> add(D elt);
}
