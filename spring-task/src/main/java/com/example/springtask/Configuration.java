/*package com.example.springtask;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@org.springframework.context.annotation.Configuration
public class Configuration {
	
	@Bean
	public Mservice getService() {
		return new Mytask();
	}
	
	@Bean(name = "threadPoolExecutor")
	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(7);
		executor.setMaxPoolSize(42);
		executor.setQueueCapacity(11);
		executor.setThreadNamePrefix("threadPoolExecutor-");
		executor.initialize();
		return executor;
	}

}
*/