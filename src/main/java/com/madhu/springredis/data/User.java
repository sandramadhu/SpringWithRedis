package com.madhu.springredis.data;

import com.madhu.springredis.Cachable;

/**
 * @author Madhu
 *
 */
public class User implements Cachable {
	public static final String OBJECT_KEY = "USER";
	
	private String id;
	private String name;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getObjectKey() {
		return OBJECT_KEY;
	}

}
