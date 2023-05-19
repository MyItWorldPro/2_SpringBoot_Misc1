package com.springboot.StarterCache.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EhcacheConfig extends CachingConfigurerSupport {


    @Bean
    public CacheManager cacheManager(){
        return new EhcacheCa
    }

}
