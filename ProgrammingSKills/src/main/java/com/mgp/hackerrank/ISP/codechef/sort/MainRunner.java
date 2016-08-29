package com.mgp.hackerrank.ISP.codechef.sort;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

class MainRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MainRunner prog = new MainRunner();
		try {
			prog.run();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	void run() throws Exception {
		CodeChefInputHandler input = new CodeChefInputHandler(System.in);
		CodeChefOutputHandle output = new CodeChefOutputHandle(System.out);
		System.out.println("Number of test cases");
		int testcases = input.getInt();
		List list = new ArrayList();
		int limit = 0;
		for (; testcases > 0; testcases--) {
			System.out.println("\n Arraybounds : ");
			limit = input.getInt();
			for (int i = 0; i < limit; i++) {
				System.out.println("Enter array item");
				list.add(input.getInt());
			}

		}

		for (int i = 1; i <= list.size() - 1; i++) {// for (Integer integer :
													// list)
													// {

			// output.writeInt((Integer) list.get(i));
			output.writeChar('i');
		}

	}

	public static class CodeChefInputHandler {

		private static final int BUFF_SZE = 8192;
		private static final byte SPACE = ' ';
		private static final byte MINUS_SIGN = '-';
		private static final byte ZERO = '0';
		private static final byte NINE = '9';

		private final byte[] buffer;
		private final InputStream is;
		private int index;
		private int byteRead;

		CodeChefInputHandler(InputStream inputStream) {
			is = inputStream;
			buffer = new byte[BUFF_SZE];
			index = byteRead = 0;

		}

		public char getChar() throws Exception {
			return (char) getNextByte();
		}

		public String getString() throws Exception {
			StringBuffer buffer = new StringBuffer();

			// get the byte from console
			byte currentByte = getNextByte();

			// parse through the white spaces if any
			while (currentByte <= SPACE) {
				currentByte = getNextByte();
			}
			// get the string
			do {

				buffer.append((char) currentByte);

				currentByte = getNextByte();
			} while (currentByte > SPACE);

			return buffer.toString();
		}

		// get Integers from console
		public int getInt() throws Exception {
			int retVal = 0;

			// get next character
			byte currentByte = getNextByte();

			// parse through white spaces

			while (currentByte <= SPACE) {
				currentByte = getNextByte();

			}

			// time to handle negative sign if any in the number
			boolean isNegative = (currentByte == MINUS_SIGN);
			if (isNegative) {
				// read past as negative
				currentByte = getNextByte();

			}
			// we are the number
			do {
				retVal = (retVal * 10) + currentByte - ZERO;
				currentByte = getNextByte();
			} while (isDigit(currentByte));

			// handle negative sign
			if (isNegative) {
				return -retVal;
			}

			return retVal;
		}

		private boolean isDigit(byte thisByte) {

			return ((thisByte >= ZERO) && (thisByte <= NINE));
		}

		// get the data from the input stream/ console
		private byte getNextByte() throws Exception {
			if (index == byteRead) {
				// read more data if there is
				byteRead = is.read(buffer, index = 0, BUFF_SZE);
			}

			return buffer[index++];
		}

	}

	// for output
	public static class CodeChefOutputHandle {
		private static final int BUFF_SZE = 8192;
		private static final char NEW_LINE = '\n';
		private static final char MINUS_SIGN = '-';
		private static final char ZERO = '0';

		private final byte[] buffer;
		private final OutputStream os;
		private int index;

		public CodeChefOutputHandle(OutputStream outputStream) {
			os = outputStream;
			buffer = new byte[BUFF_SZE];
			index = 0;
		}

		public void writeString(String theString) throws Exception {
			for (int i = 0; i < theString.length(); i++) {
				writeChar(theString.charAt(i));
			}
		}

		public void writeInt(int theInt) throws Exception {

			// handle zero
			if (theInt == 0) {
				writeChar(ZERO);
				return;
			}

			// handle negatives
			if (theInt < 0) {
				writeChar(MINUS_SIGN);
				theInt = -theInt;
			}

			// recursively handle the numbers of any size

			if (theInt < 10) {
				// down to a single digit
				writeChar((char) (theInt + ZERO));
			} else {
				// strip the digit for next recursion
				writeInt(theInt / 10);

				// write this digit
				writeChar((char) ((theInt % 10) + ZERO));
			}

		}

		public void newLine() throws Exception {
			writeChar(NEW_LINE);
		}

		public void writeChar(char theChar) throws Exception {

			if (index == BUFF_SZE) {

				// the buffer size is full
				flush();

			}
			buffer[index++] = (byte) theChar;
		}

		// write what ever is in the output buffer
		public void flush() throws Exception {
			if (index > 0) {

				// there is someting to write
				os.write(buffer, 0, index);
				index = 0;
			}
		}
	}

}
