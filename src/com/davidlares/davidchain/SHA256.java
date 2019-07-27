package com.davidlares.davidchain;

import java.security.MessageDigest;

public class SHA256 {
	
	// transforming transaction into into SHA256 hash
	public static String generateHash(String data) {
		
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(data.getBytes("UTF-8"));
			// converting byte array hash into a String buffer
			StringBuffer hexadecimalString = new StringBuffer();

			for (int i = 0; i < hash.length; i++) {
				// converting process
				String hexadecimal = Integer.toHexString(0xff & hash[i]);
				if (hexadecimal.length() == 1) hexadecimalString.append('0');
				hexadecimalString.append(hexadecimal);
			}

			return hexadecimalString.toString(); // returning hash

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
