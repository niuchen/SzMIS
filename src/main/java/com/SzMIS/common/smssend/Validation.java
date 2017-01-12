package com.SzMIS.common.smssend;

import java.util.Random;

public class Validation {

	public static String getRandNum(int charCount) {
        String charValue = "";
        for (int i = 0; i < charCount; i++) {
            char c = (char) (randomInt(0, 10) + '0');
            charValue += String.valueOf(c);
        }
        return charValue;

    }

	 public  static int randomInt(int from, int to) {
	        Random r = new Random();
	        return from + r.nextInt(to - from);
	    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Validation.getRandNum(6));
	}

}
