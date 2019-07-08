package com.example.springtask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.AsyncConfigurerSupport;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@SpringBootApplication
@EnableScheduling
public class SpringTaskApplication extends AsyncConfigurerSupport{

	/*@Bean
	public Mservice getService() {
		return new Mytask();
	}*/
	
	/*@Bean
	public SchedulerExample getBean() {
		return new SchedulerExample();
	}*/
	
	@Bean(name = "threadPoolExecutor")
	public TaskExecutor  getAsyncExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(7);
		executor.setMaxPoolSize(42);
		executor.setQueueCapacity(11);
		executor.setThreadNamePrefix("threadPoolExecutor-");
		executor.initialize();
		return executor;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringTaskApplication.class, args);
		
		
		
	}

}
