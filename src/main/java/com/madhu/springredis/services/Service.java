package com.madhu.springredis.services;

import com.madhu.springredis.Cachable;

/**
 * @author Madhu
 *
 */
public interface Service<V extends Cachable> {
	
	public void put(V obj);
	
	public V get(V key);
	
	public void delete(V key);

}
