package org.jalasoft;
/**
 * IPV4Validator
 */
public class IPV4Validator {

    public boolean matchIPv4(final String ip) {
        
        //String ipRegex = "\b\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\b";
        final String ipv4 =	"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
        return ip.matches(ipv4);
    }
}