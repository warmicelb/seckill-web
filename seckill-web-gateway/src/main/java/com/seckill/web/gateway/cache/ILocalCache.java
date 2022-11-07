package com.seckill.web.gateway.cache;

public interface ILocalCache<K,V> {
	
	/**
	 * 从本地缓存获取数据.
	 * @param key 
	 * @return
	 */
	V get(K key);
	
}
