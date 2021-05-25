package com.details.model;

public class HeapMemory {
	
	private long heapInitSize;
	private long heapUsedSize;
	private long heapCommitedSize;
	private long heapMaxSize;
	
	
	public long getHeapInitSize() {
		return heapInitSize;
	}


	public void setHeapInitSize(long heapInitSize) {
		this.heapInitSize = heapInitSize;
	}


	public long getHeapUsedSize() {
		return heapUsedSize;
	}


	public void setHeapUsedSize(long heapUsedSize) {
		this.heapUsedSize = heapUsedSize;
	}


	public long getHeapCommitedSize() {
		return heapCommitedSize;
	}


	public void setHeapCommitedSize(long heapCommitedSize) {
		this.heapCommitedSize = heapCommitedSize;
	}


	public long getHeapMaxSize() {
		return heapMaxSize;
	}


	public void setHeapMaxSize(long heapMaxSize) {
		this.heapMaxSize = heapMaxSize;
	}


	public HeapMemory(long heapInitSize, long heapUsedSize, long heapCommitedSize, long heapMaxSize) {
		super();
		this.heapInitSize = heapInitSize;
		this.heapUsedSize = heapUsedSize;
		this.heapCommitedSize = heapCommitedSize;
		this.heapMaxSize = heapMaxSize;
	}

	
}
