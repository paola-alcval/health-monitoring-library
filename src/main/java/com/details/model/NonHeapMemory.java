package com.details.model;

public class NonHeapMemory {
	
	private long nonHeapInitSize;
	private long nonHeapUsedSize;
	private long nonHeapCommitedSize;
	private long nonHeapMaxSize;
	
	public long getNonHeapInitSize() {
		return nonHeapInitSize;
	}
	public void setNonHeapInitSize(long nonHeapInitSize) {
		this.nonHeapInitSize = nonHeapInitSize;
	}
	public long getNonHeapUsedSize() {
		return nonHeapUsedSize;
	}
	public void setNonHeapUsedSize(long nonHeapUsedSize) {
		this.nonHeapUsedSize = nonHeapUsedSize;
	}
	public long getNonHeapCommitedSize() {
		return nonHeapCommitedSize;
	}
	public void setNonHeapCommitedSize(long nonHeapCommitedSize) {
		this.nonHeapCommitedSize = nonHeapCommitedSize;
	}
	public long getNonHeapMaxSize() {
		return nonHeapMaxSize;
	}
	public void setNonHeapMaxSize(long nonHeapMaxSize) {
		this.nonHeapMaxSize = nonHeapMaxSize;
	}
	
	public NonHeapMemory(long nonHeapInitSize, long nonHeapUsedSize, long nonHeapCommitedSize, long nonHeapMaxSize) {
		super();
		this.nonHeapInitSize = nonHeapInitSize;
		this.nonHeapUsedSize = nonHeapUsedSize;
		this.nonHeapCommitedSize = nonHeapCommitedSize;
		this.nonHeapMaxSize = nonHeapMaxSize;
	}


}
