package com.mgp.aoip.ISP.pracstring;

import java.io.IOException;
import java.security.Permission;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateVolume {

	Scanner sc = new Scanner(System.in);
	Out output = new Out();

	public int get_int_val() throws NumberFormatException, IOException {
		int inp = Integer.parseInt(sc.nextLine());
		;
		if (inp <= 0)
			throwException();

		return inp;
	}

	public double get_double_val() throws NumberFormatException, IOException {
		double inp = Double.parseDouble(sc.nextLine());
		if (inp <= 0)
			throwException();
		return inp;
	}

	void throwException() {
		throw new NumberFormatException("All the values must be positive");
	}

	static VolumeCalc do_calc() {
		return new VolumeCalc();

	}

}

class Out {
	void display(double x) {
		DecimalFormat df = new DecimalFormat("#.000");
		System.out.println(df.format(x));
	}
}

class VolumeCalc {
	double get_volume(int a) {
		return Math.pow(a, 3);
	}

	double get_volume(int l, int b, int h) {
		return l * b * h;
	}

	double get_volume(double r) {
		return ((double) 2 / (double) 3) * Math.PI * Math.pow(r, 3);
	}

	double get_volume(double r, double h) {
		return Math.PI * Math.pow(r, 2) * h;

	}

}

class Solution {

	public static void main(String[] args) {
		DoNotTerminate.forbidExit();
		try {
			CalculateVolume cal = new CalculateVolume();
			int T = cal.get_int_val();
			while (T-- > 0) {
				double volume = 0.0;
				int ch = cal.get_int_val();
				if (ch == 1) {
					int a = cal.get_int_val();
					volume = CalculateVolume.do_calc().get_volume(a);
				} else if (ch == 2) {
					int l = cal.get_int_val();
					int b = cal.get_int_val();
					int h = cal.get_int_val();
					volume = CalculateVolume.do_calc().get_volume(l, b, h);

				} else if (ch == 3) {
					double r = cal.get_double_val();
					volume = CalculateVolume.do_calc().get_volume(r);

				} else if (ch == 4) {
					double r = cal.get_double_val();
					double h = cal.get_double_val();
					volume = CalculateVolume.do_calc().get_volume(r, h);

				}
				cal.output.display(volume);
			}

		} catch (NumberFormatException e) {
			System.out.print(e);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (DoNotTerminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}

	} // end of main
} // end of Solution

/**
 * This class prevents the user form using System.exit(0) from terminating the
 * program abnormally.
 *
 */
class DoNotTerminate {

	public static class ExitTrappedException extends SecurityException {
	}

	public static void forbidExit() {
		final SecurityManager securityManager = new SecurityManager() {
			@Override
			public void checkPermission(Permission permission) {
				if (permission.getName().contains("exitVM")) {
					throw new ExitTrappedException();
				}
			}
		};
		System.setSecurityManager(securityManager);
	}
} // end of Do_Not_Terminate
