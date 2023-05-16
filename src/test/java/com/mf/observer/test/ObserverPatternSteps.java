package com.mf.observer.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.runner.RunWith;

import com.mf.observer.impl.WeatherDisplay;
import com.mf.observer.impl.WeatherStation;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources")
public class ObserverPatternSteps {
	private WeatherStation weatherStation;
	private List<WeatherDisplay> weatherDisplays; 

	@Given("I have a weather station")
	@And("multiple weather displays")
	public void i_have_a_weatherStation() {
		weatherStation = new WeatherStation();
		weatherDisplays = new ArrayList<>();
	}

	@When("The weather conditions change")
	public void the_weather_conditions_change() {

	}
	
	@Then("All weather displays should be updated")
	public void all_weather_displays_should_be_updated() {

	}
	  
}