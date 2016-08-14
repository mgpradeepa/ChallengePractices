package com.mgp.hackerrank.ISP.booking.com.nl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HotelReviewsSolution {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		// words to eval
		System.out.println("Enter the hot words");
		String hotdogs = sc.nextLine();
		String[] hotList = hotdogs.split(" ");

		// total number of reviews --
		System.out.println("Enter the number of reviews to be considered");
		int n = Integer.parseInt(sc.nextLine());
//		HotelReview hr = null;
		List<HotelReview> hl = new ArrayList<>();
		// get the review and
		System.out.println("Enter the rating and review statement in separate lines");
		for (int i = 0; i < n; i++) {

			hl.add(new HotelReview(Integer.parseInt(sc.nextLine()), sc.nextLine()));
		}

		// in each hotel review check how many times the hotdogs words are present
		Pattern p = Pattern.compile(hotdogs);
		Map<String, Integer> hm = new TreeMap<>();
		for(HotelReview h : hl){
			hm.put( matchPattern(p, h.getSent()), h.getReview());
			
		}
		for (Map.Entry<String, Integer> e : hm.entrySet()){
			System.out.println(e.getKey() + " " + e.getValue());
		}
		

		sc.close();

	}
	static String matchPattern(Pattern p, String s){
		Matcher m = p.matcher(s);
		if (m.find()){
			return m.group();
		}
		return null;
	}
}

class HotelReview {
	int review;
	String sent;

	public HotelReview(int review, String sen) {
		this.review = review;
		this.sent = sen;

	}

	/**
	 * @return the review
	 */
	public int getReview() {
		return review;
	}

	/**
	 * @param review
	 *            the review to set
	 */
	public void setReview(int review) {
		this.review = review;
	}

	/**
	 * @return the sent
	 */
	public String getSent() {
		return sent;
	}

	/**
	 * @param sent
	 *            the sent to set
	 */
	public void setSent(String sent) {
		this.sent = sent;
	}

}
