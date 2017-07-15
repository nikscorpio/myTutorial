package com.api;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class GEOIPGet {

	public static void main(String[] args) {

		GeoIPService gs = new GeoIPService();
		GeoIP geodata = gs.getGeoIPServiceSoap().getGeoIP("192.168.1.1");
		
		System.out.println(geodata.getCountryCode());
		System.out.println(geodata.getCountryName());		
		
		
	}

}
