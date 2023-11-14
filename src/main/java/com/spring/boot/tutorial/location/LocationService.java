package com.spring.boot.tutorial.location;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LocationService {

	Location loc1 = new Location("L1", "Mumbai");
	Location loc2 = new Location("L2", "Delhi");
	Location loc3 = new Location("L3", "Ranchi");
	Location loc4 = new Location("L4", "Kashi");
	
	List<Location> locations = new ArrayList<>(Arrays.asList(loc1, loc2, loc3, loc4));

	public List<Location> getAllLocations() {
		return locations;
	}

	public Location getLocation(String id) {
		Location location = locations.stream().filter(l->id.equalsIgnoreCase(l.getId())).findFirst().orElse(null);
		return location;
	}
	
	public void addLocation(Location location) {
		locations.add(location);
	}

	public void updateLocation(String id, Location location) {
		for(int index =0 ; index<locations.size();index++) {
			
			Location l = locations.get(index);
			if(l.getId().equalsIgnoreCase(id))
				locations.set(index, location);
			return;
		}
		
	}

	public void deleteLocation(String id) {
		locations.removeIf(l->l.getId().equalsIgnoreCase(id));
		
	}
}
