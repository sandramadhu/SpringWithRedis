package com.madhu.springredis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import com.madhu.springredis.Cachable;
import com.madhu.springredis.data.User;

/**
 * @author Madhu
 *
 */
@org.springframework.stereotype.Service("userService");
public class UserService implements Service<User> {
	
	@Autowired
	protected RedisTemplate<String, Cachable> redisTemplate;

	@Override
	public void put(User obj) {
		redisTemplate.opsForHash().put(obj.getObjectKey(), obj.getKey(), obj);
	}

	@Override
	public User get(User key) {
		return (User) redisTemplate.opsForHash().get(key.getObjectKey(), key.getKey());
	}

	@Override
	public void delete(User key) {
		redisTemplate.opsForHash().delete(key.getObjectKey(), key.getKey());
	}

}
