package Utilities;

import java.util.Base64;

public final class DecodeEncodeUtils {
	
	private DecodeEncodeUtils() {}
	
	public static String getDecodedString(String encodedString) {
		
		return new String(Base64.getDecoder().decode(encodedString.getBytes()));
		
	}
	
	
	public static String getEncodeString(String decodedString){
		
		return new String(Base64.getEncoder().encodeToString(decodedString.getBytes()));
		
	}

}
