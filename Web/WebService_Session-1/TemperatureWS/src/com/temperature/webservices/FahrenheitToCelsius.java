package com.temperature.webservices;

import javax.jws.WebService;

//class that have fahrenheitToCelsius  convertor method

@WebService
public class FahrenheitToCelsius {
public float fahrenheitToCelsiusConvertor(float fahrenheit){
	float celsius=(fahrenheit-32)*5/9;
	return celsius;
}
}
