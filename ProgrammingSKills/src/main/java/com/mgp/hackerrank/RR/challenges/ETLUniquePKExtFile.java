package com.mgp.hackerrank.RR.challenges;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/***
 * 
 * @author mgpradeepa
 *
 */
public class ETLUniquePKExtFile {

	/**
	 * Due to ETL jobs errors, the has got corrupted. Implement a function such
	 * that now two rows repeated.
	 * 
	 * Approach: 1. The database has multiple rows. Consider they are located in
	 * file system and Start scanning row by row. Add the collection to Map - having Set values.
	 * So If any repeatition is found, then ignored that
	 * 
	 * @param args
	 */

	// variables:
	public static final String DATAPATH = "/Users/mgpradeepa/Downloads/Challenges_copy/InterviewStreetProject/src/main/resources/etldb.dat";

	public static void main(String[] args) {
		// TODO 1. Read a String having \r separated considering each are one
		// row and perform the condition
		// TODO 2. Read a file system and perform.
		// TODO 3. Think of mapreduce

		Map<String, Set<String>> wholeData = new HashMap<String, Set<String>>();
		Set<String> outputData = null;
		try (BufferedReader br = new BufferedReader(new FileReader(DATAPATH))) {
			String curLine;
			while ((curLine = br.readLine()) != null) {
				System.out.println(curLine);
				String k[] = curLine.split(",");
				outputData = new HashSet<String>();
				outputData.add(curLine);
				wholeData.put(k[0], outputData);
			}
		} catch (IOException ie) {
			ie.printStackTrace();
		}
		for (Map.Entry<String, Set<String>> entry : wholeData.entrySet()) {
			// write these to a file back so that file would have no-dup data
			System.out.println(entry.getValue());
		}

	}

}
