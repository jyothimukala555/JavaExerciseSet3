package com.javaExSet3;

public class WeatherAdviser {

	private int temperature;
	public WeatherAdviser(int temperature) {
		this.temperature = temperature;
	}
	public static void main(String [] args) {
		WeatherAdviser adviser = new WeatherAdviser(15);
		System.out.println(adviser.provideWeatherAdvisory());
	}

		public String provideWeatherAdvisory() {
	        // TODO: Provide a weather advisory message based on the temperature.
	        if(temperature<0){
	        return "It's freezing! Wear a heavy coat.";
	        }
	        else if(temperature>=0 && temperature<=10){
	       return "It's cold! Bundle up.";
	        }
	        else if(temperature>=11 && temperature<=20){
	        return "It's cool! A light jacket will do.";
	        }
	        else{
	        return  "It's warm! Enjoy the day.";
	        }
	    }
	   
	}



