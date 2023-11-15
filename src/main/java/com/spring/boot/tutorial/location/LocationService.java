package com.spring.boot.tutorial.location;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

	@Autowired
	public LocationRepository locationRepository;

	/*
	 * Location loc1 = new Location("L1", "Mumbai"); Location loc2 = new
	 * Location("L2", "Delhi"); Location loc3 = new Location("L3", "Ranchi");
	 * Location loc4 = new Location("L4", "Kashi");
	 * 
	 * List<Location> locations = new ArrayList<>(Arrays.asList(loc1, loc2, loc3,
	 * loc4));
	 */
	
	public List<Location> getAllLocations() {
		List<Location> locations = new ArrayList<>();
		locationRepository.findAll().forEach(locations::add);
		return locations;
		//return locations;
	}

	/*
	 * public Location getLocation(String id) { Location location =
	 * locations.stream().filter(l ->
	 * id.equalsIgnoreCase(l.getId())).findFirst().orElse(null); return location; }
	 */
	
	public Optional<Location> getLocation(String id) {
		return locationRepository.findById(id);
	}
	
	public void addLocation(Location location) {
		locationRepository.save(location);
//		locations.add(location);
	}

	public void updateLocation(String id, Location location) {
		
		locationRepository.save(location);
		
		/*
		 * for(int index =0 ; index<locations.size();index++) {
		 * 
		 * Location l = locations.get(index); if(l.getId().equalsIgnoreCase(id))
		 * locations.set(index, location); return; }
		 */
		
	}

	public void deleteLocation(String id) {
		
		locationRepository.deleteById(id);
//		locations.removeIf(l->l.getId().equalsIgnoreCase(id));
		
	}
}
