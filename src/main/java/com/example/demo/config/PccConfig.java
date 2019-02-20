package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.gemfire.cache.config.EnableGemfireCaching;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;

@EnableGemfireCaching
@EnableEntityDefinedRegions(basePackages = "com.example.demo.Entity")
@EnableGemfireRepositories(basePackages = "com.example.demo.repository.gem")
@Profile("cloud")
@Configuration
public class PccConfig {
}