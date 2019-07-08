/*package com.example.springtask;

import java.util.concurrent.CompletableFuture;

import javax.annotation.PostConstruct;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class Mytask implements Mservice{


	@Override
	@Async("threadPoolExecutor")
	public CompletableFuture<Object> dosomething() {
		System.out.println("this is priyank"+Thread.currentThread().getName());
		
		return CompletableFuture.completedFuture("priyank");
	}

}*/