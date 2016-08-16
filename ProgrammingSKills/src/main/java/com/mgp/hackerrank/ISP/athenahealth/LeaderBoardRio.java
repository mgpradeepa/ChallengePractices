package com.mgp.hackerrank.ISP.athenahealth;

import java.util.*;

public class LeaderBoardRio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String, MedalData> l = doBoard(sc, n);
		SortedSet<String> keys = new TreeSet<String>(l.keySet());
		for (String key : keys) {
			System.out.println(l.get(key));

		}

		sc.close();
	}

	private static HashMap<String, MedalData> doBoard(Scanner sc, int n) {
		int tr = 0;
		Map<String, MedalData> l = new HashMap<>();
		MedalData m;
		String cinp;
		for (int i = 0; i < n * 3; i++) {
			cinp = sc.next();

			if (tr > 2)
				tr = 0;
			if (tr == 0) {
				if (l.containsKey(cinp)) {
					m = l.get(cinp);
					m.setG(m.getG() + 1);
					l.put(m.getC(), m);
					tr++;
				} else {
					m = new MedalData();
					m.setC(cinp);
					m.setG(m.getG() + 1);
					l.put(m.getC(), m);
					tr++;
				}
			} else if (tr == 1) {
				if (l.containsKey(cinp)) {
					m = l.get(cinp);
					m.setS(m.getS() + 1);
					l.put(m.getC(), m);
					tr++;
				} else {
					m = new MedalData();
					m.setC(cinp);
					m.setS(m.getS() + 1);
					l.put(m.getC(), m);
					tr++;
				}
			} else if (tr == 2) {
				if (l.containsKey(cinp)) {
					m = l.get(cinp);
					m.setB(m.getB() + 1);
					l.put(m.getC(), m);
					tr++;
				} else {
					m = new MedalData();
					m.setC(cinp);
					m.setB(m.getB() + 1);
					l.put(m.getC(), m);
					tr++;
				}
			}

		}
		return (HashMap<String, MedalData>) l;
	}

}

class MedalData implements Comparable<MedalData> {

	String c;
	int g;
	int b;
	int s;

	public MedalData() {

	}

	public MedalData(String c, int g, int b, int s) {
		super();
		this.c = c;
		this.g = g;
		this.b = b;
		this.s = s;
	}

	/**
	 * @return the c
	 */
	public String getC() {
		return c;
	}

	/**
	 * @param c
	 *            the c to set
	 */
	public void setC(String c) {
		this.c = c;
	}

	/**
	 * @return the g
	 */
	public int getG() {
		return g;
	}

	/**
	 * @param g
	 *            the g to set
	 */
	public void setG(int g) {
		this.g = g;
	}

	/**
	 * @return the b
	 */
	public int getB() {
		return b;
	}

	/**
	 * @param b
	 *            the b to set
	 */
	public void setB(int b) {
		this.b = b;
	}

	/**
	 * @return the s
	 */
	public int getS() {
		return s;
	}

	/**
	 * @param s
	 *            the s to set
	 */
	public void setS(int s) {
		this.s = s;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return c + " " + g + " " + s + " " + b;
	}

	@Override
	public int compareTo(MedalData o) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + b;
		result = prime * result + ((c == null) ? 0 : c.hashCode());
		result = prime * result + g;
		result = prime * result + s;
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MedalData other = (MedalData) obj;
		if (b != other.b)
			return false;
		if (c == null) {
			if (other.c != null)
				return false;
		} else if (!c.equals(other.c))
			return false;
		if (g != other.g)
			return false;
		if (s != other.s)
			return false;
		return true;
	}

}
