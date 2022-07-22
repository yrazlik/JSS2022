package com.obss.jss.day4.generics.genericclass;

public class Triplet<K, V, M> {

	private K k;
	private V v;
	private M m;
	
	public Triplet(K k, M m, V v ) {
		this.k = k;
		this.m = m;
		this.v = v;
	}
	public K getK() {
		return k;
	}
	public void setK(K k) {
		this.k = k;
	}
	public M getM() {
		return m;
	}
	public void setM(M m) {
		this.m = m;
	}
	public V getV() {
		return v;
	}
	public void setV(V v) {
		this.v = v;
	}
	
	
}
