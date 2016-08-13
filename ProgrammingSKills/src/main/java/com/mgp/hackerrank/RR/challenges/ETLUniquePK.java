package com.mgp.hackerrank.RR.challenges;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/***
 * 
 * @author mgpradeepa
 *
 */
public class ETLUniquePK {

	/**
	 * Due to ETL jobs errors, the has got corrupted. Implement a function such
	 * that now two rows repeated.
	 * 
	 * Approach: 1. The database has multiple rows. Consider they are located in
	 * file system and Start scanning row by row. Add the collection to Map having Set as values.
	 * So If any repeatition is found, then ignored that
	 * 
	 * @param args
	 */

	// variables:
	public static final String tableData = "t2,x1,1.0\rt3,x2,1.0\rt5,x3,1.1\rt3,x2,1.0";

	public static void main(String[] args) {
		// TODO 1. Read a String having \r separated considering each are one
		// row and perform the condition
		// TODO 2. Read a file system and perform.
		// TODO 3. Think of mapreduce
		Set<String> outputData = null;

		String rowData[] = tableData.split("\\r");
		Map<String, Set<String>> wholeData = new HashMap<String, Set<String>>(rowData.length);
		for (String nodup : rowData) {
			String k[] = nodup.split(",");
			outputData = new HashSet<String>();
			outputData.add(nodup);
			wholeData.put(k[0], outputData);
		}

		// Iterator over the Map and print the data to be double sure

		for (Map.Entry<String, Set<String>> entry : wholeData.entrySet()) {
			System.out.println(entry.getValue());
		}
	}

}
