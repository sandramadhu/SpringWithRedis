package com.madhu.springredis;

import java.io.Serializable;


/**
 * @author Madhu
 *
 */
public interface Cachable extends Serializable {
	
	public String getKey();
	
	public String getObjectKey();

}
