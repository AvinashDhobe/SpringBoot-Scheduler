package com.javatech.springscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class Scheduler 
{
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat(
			"MM/dd/yyyy HH:mm:ss");

	@Scheduled(fixedRate = 10000)
	public void performTask() {

		System.out.println("Regular task performed at "
				+ dateFormat.format(new Date()));

	}

	@Scheduled(initialDelay = 1000, fixedRate = 10000)
	public void performDelayedTask() {

		System.out.println("Delayed Regular task performed at "
				+ dateFormat.format(new Date()));

	}

	@Scheduled(cron = "*/5 * * * * *")
	public void performTaskUsingCron() {

		System.out.println("Regular task performed using Cron at "
				+ dateFormat.format(new Date()));

	}

	
}
