package com.details.model;

public class GarbageCollection {
	
	private String name;
	private long count;
	private long time;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	
	public GarbageCollection(String name, long count, long time) {
		super();
		this.name = name;
		this.count = count;
		this.time = time;
	}

}
