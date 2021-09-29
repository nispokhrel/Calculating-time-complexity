
/**
 * Name: Nishant Pokhrel 
 * Date: September 27, 2021 
 * Subject: CS 216- Data Structures & Algorithms 
 * Assignemt: Week04 
 * Purpose: This program implements three different algorithms and calculate the run time for various values of x
 * @author npokhrel
 */

import java.util.Date;

public class testingMethod {

	public static void main(String[] args) {

		System.out.println("x    methodA(mSec)    methodB(mSec)    methodC(mSec)");
		System.out.println("--------------------------------------------------");
		for (long x = 100; x <= 1500; x += 100) {
			System.out.printf("%d", x);

			// run time for methodC

			Date current = new Date(); // getting current time
			long sTime = current.getTime(); // getting start time from date
			methods.methodA(x); // running methodA to be timed
			current = new Date(); // getting current time
			long eTime = current.getTime(); // getting end time
			long elapsedTime = eTime - sTime; // calculating run time in milliSeconds

			if (x >= 1000) {
				System.out.printf("%8d", elapsedTime); // arranging the print format

			} else {
				System.out.printf("%9d", elapsedTime);
			}

			// run time for methodB, similar to methodA
			sTime = current.getTime();
			methods.methodB(x); // running methodB
			current = new Date();
			eTime = current.getTime();
			elapsedTime = eTime - sTime;
			System.out.printf("%16d", elapsedTime);

			// run time for methodC, similar to methodA
			sTime = current.getTime();
			methods.methodC(x); // running methodC
			current = new Date();
			eTime = current.getTime();
			elapsedTime = eTime - sTime;
			System.out.printf("%18d\n", elapsedTime);
		}
	}

}
