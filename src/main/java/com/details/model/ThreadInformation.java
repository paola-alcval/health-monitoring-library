package com.details.model;

public class ThreadInformation {
	
	private int demonThreads;
	private int peakThreads;
	private int threadCount;
	private long startedThreadCount;
	
	public long getDemonThreads() {
		return demonThreads;
	}
	public void setDemonThreads(int demonThreads) {
		this.demonThreads = demonThreads;
	}
	public long getPeakThreads() {
		return peakThreads;
	}
	public void setPeakThreads(int peakThreads) {
		this.peakThreads = peakThreads;
	}
	public long getThreadCount() {
		return threadCount;
	}
	public void setThreadCount(int threadCount) {
		this.threadCount = threadCount;
	}
	public long getStartedThreadCount() {
		return startedThreadCount;
	}
	public void setStartedThreadCount(long startedThreadCount) {
		this.startedThreadCount = startedThreadCount;
	}
	
	public ThreadInformation(int demonThreads, int peakThreads, int threadCount, long startedThreadCount) {
		super();
		this.demonThreads = demonThreads;
		this.peakThreads = peakThreads;
		this.threadCount = threadCount;
		this.startedThreadCount = startedThreadCount;
	}

	}
