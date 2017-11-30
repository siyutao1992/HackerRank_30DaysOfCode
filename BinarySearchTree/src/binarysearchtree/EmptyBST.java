/*
 * Copyright 2015 SiyuTAO
 */

package binarysearchtree;

/**
 * @author SiyuTao
 * @param <D>
 */

public class EmptyBST<D extends Comparable> implements Tree<D>{

    public EmptyBST() {
        
    }
    
    /**
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return true;
    }
    
    @Override
    public int cardinality() {
        return 0;
    }
    
    /**
     *
     * @param elt
     * @return
     */
    @Override
    public boolean member(D elt) {
        return false;
    }
    
    /**
     *
     * @param elt
     * @return
     */
    @Override
    public NonEmptyBST<D> add(D elt) {
        return new NonEmptyBST<D>(elt);
    }
    
}
