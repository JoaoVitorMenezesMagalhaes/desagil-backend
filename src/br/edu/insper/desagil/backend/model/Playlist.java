package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Playlist{
	private int id;
	private List<String> tracks;
	private Map<String, Integer> ratings;
	
	public Playlist(int id) {
		this.id = id;
		this.tracks = new ArrayList<>();
		this.ratings = new HashMap<>();
	}

	public int getId() {
		return id;
	}

	public List<String> getTracks() {
		return tracks;
	}

	public Map<String, Integer> getRatings() {
		return ratings;
	}

	public List<String> addTrack(String track) {
		this.tracks.add(track);
		return this.tracks;
	}
	
	public Map<String, Integer> putRating(String username, int rating){
		this.ratings.put(username, rating);
		return this.ratings;
	}
	
	public double averageRatings() {
		double v = 0.0;
		for (String k: this.ratings.keySet()) {
			v += this.ratings.get(k);
		}
		double average = 0.0;
		average = (v/this.ratings.size());
		int i = (int) average;
		double d = average - i;
		if (d > 0.26) {
			d = 0.0;
		}
		if (d <= 0.26 && d >0.74) {
			d = 0.5;
		}
		if (d <= 0.74) {
			d = 1.0;
		}
		return (i+d);
	}
	
}
