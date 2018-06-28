package com.bridgeit.controllers;

public class CountryController {

CountryService countryService = new CountryService();
	
	
	@RequestMapping(value = "/countries", method = RequestMethod.GET)
	public List getCountries() {
		List listOfCountries = countryService.getAllCountries();
		return listOfCountries;
	}
 
	@RequestMapping(value = "/country/{id}", method = RequestMethod.GET)
	public Country getCountryById(@PathVariable int id) {
		return countryService.getCountry(id);
	}
 
	@RequestMapping(value = "/countries", method = RequestMethod.POST)
	public Country addCountry(@RequestBody Country country) {
		return countryService.addCountry(country);
	}
 
	@RequestMapping(value = "/countries", method = RequestMethod.PUT)
	public Country updateCountry(@RequestBody Country country) {
		return countryService.updateCountry(country);
 
	}
 
	@RequestMapping(value = "/country/{id}", method = RequestMethod.DELETE)
	public void deleteCountry(@PathVariable("id") int id) {
		countryService.deleteCountry(id);
 
	} 

}
