package org.jalasoft;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * IPV4ValidatorTest
 */
public class IPV4ValidatorTest {

    @Test
    public void test1() {
        // Arrange
        IPV4Validator validator = new IPV4Validator();

        // Act
        String ip1 = "0.0.0.0";
        String ip2 = "0.0.0.1";
        String ip3 = "10.0.0.10";
        String ip4 = "1590.0.0.0";
        String ip5 = "255.255.255.255";
        String ip6 = "255.256.256.0";
        String ip7 = "-10.-10.-10.-0";
        String ip8 = "255,255.255.255";

        // Assert
        assertTrue("The Ip address is invalid", validator.matchIPv4(ip1));
        assertTrue("The Ip address is invalid", validator.matchIPv4(ip2));
        assertTrue("The Ip address is invalid", validator.matchIPv4(ip3));
        assertFalse("The Ip address is invalid", validator.matchIPv4(ip4));
        assertTrue("The IP address is invalid", validator.matchIPv4(ip5));
        assertFalse("The Ip address is invalid", validator.matchIPv4(ip6));
        assertFalse("The Ip address is invalid", validator.matchIPv4(ip7));
        assertFalse("The Ip address is invalid", validator.matchIPv4(ip8));

    }    
}