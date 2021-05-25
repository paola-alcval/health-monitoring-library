package com.details.operations;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

import com.details.model.NonHeapMemory;

public class NonHeapMemoryDetailsOperation {
	public static NonHeapMemory nonHeapMemoryDetails() {
		
		 MemoryMXBean memBean = ManagementFactory.getMemoryMXBean() ;
	     MemoryUsage nonHeapMemoryUsage = memBean.getNonHeapMemoryUsage();
	     
		long nonHeapInitSize = nonHeapMemoryUsage.getInit();
		long nonHeapUsedSize = nonHeapMemoryUsage.getUsed();
		long nonHeapCommitedSize = nonHeapMemoryUsage.getCommitted();
		long nonHeapMaxSize = nonHeapMemoryUsage.getMax();
		
		NonHeapMemory nonHeapMemoryDetails = new NonHeapMemory(nonHeapInitSize, nonHeapUsedSize, nonHeapCommitedSize, nonHeapMaxSize);
		return nonHeapMemoryDetails;
	}
}