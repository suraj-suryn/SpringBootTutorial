package com.spring.boot.tutorial.location;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {

	@Autowired
	private LocationService locationservice;
	
	@GetMapping("/locations")
	public List<Location> getAllLocations(){
		return locationservice.getAllLocations();
	}
	
	@GetMapping("/locations/{id}")
	public Location getLocation(@PathVariable String id) {
		return locationservice.getLocation(id);
	}
	
	@PostMapping("/locations")
	public void addLocation(@RequestBody Location location) {
		locationservice.addLocation(location);
	}
	
	@PutMapping("/locations/{id}")
	public void updateLocation(@PathVariable String id,@RequestBody Location location) {
		locationservice.updateLocation(id,location);
	}
	
	@DeleteMapping("/locations/{id}")
	public void deleteLocation(@PathVariable String id) {
		locationservice.deleteLocation(id);
	}
}