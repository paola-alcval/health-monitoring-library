package com.details.operations;

import java.lang.management.ManagementFactory;

import com.details.model.ThreadInformation;

public class ThreadDetailsOperation {
	public static ThreadInformation threadInformation() {
		
		int demonThreads = ManagementFactory.getThreadMXBean().getDaemonThreadCount();
		int peakThreads = ManagementFactory.getThreadMXBean().getPeakThreadCount();
		int threadCount = ManagementFactory.getThreadMXBean().getThreadCount();
		long startedThreadCount = ManagementFactory.getThreadMXBean().getTotalStartedThreadCount();
		
		ThreadInformation threadInformation = new ThreadInformation(demonThreads, peakThreads, threadCount, startedThreadCount);
		return threadInformation;
		
	}
}