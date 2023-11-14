package com.spring.boot.tutorial.location;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LocationService {

	Location loc1 = new Location("L1", "Mumbai");
	Location loc2 = new Location("L2", "Delhi");
	Location loc3 = new Location("L3", "Ranchi");
	Location loc4 = new Location("L4", "Kashi");
	
	List<Location> locations = Arrays.asList(loc1, loc2, loc3, loc4);

	public List<Location> getAllLocations() {
		return locations;
	}

	public Location getLocation(String id) {
		Location location = locations.stream().filter(l->id.equalsIgnoreCase(l.getId())).findFirst().orElse(null);
		return location;
	}
}
