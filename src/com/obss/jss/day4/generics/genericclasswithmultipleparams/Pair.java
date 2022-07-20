package com.obss.jss.day4.generics.genericclasswithmultipleparams;

public class Pair<K, V> {

    private K k;
    private V v;

    public Pair(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getKey() {
        return k;
    }

    public void setKey(K k) {
        this.k = k;
    }

    public V getValue() {
        return v;
    }

    public void setValue(V v) {
        this.v = v;
    }
}
