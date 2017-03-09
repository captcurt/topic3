public abstract class DecimalintoHex {
	// precondition:  d is a nonnegative integer
	public static String decimal2hex(int d) {
	    String digits = "0123456789ABCDEF";
	    if (d <= 0) return "0";
	    int base = 15;   // flexible to change in any base under 16
	    String hex = "";
	    while (d > 0) {
	        int digit = d % base;              // rightmost digit
	        hex = digits.charAt(digit) + hex;  // string concatenation
	        d = d / base;
	    }
	    return hex;
	}

}	