package br.edu.insper.desagil.backend.model;


public class Track{
	private Artist artist;
	private String name;
	private int duration;
	
	public Track(Artist artist, String name, int duration) {
		this.artist = artist;
		this.name = name;
		this.duration = duration;
	}

	public Artist getArtist() {
		return artist;
	}

	public String getName() {
		return name;
	}

	public int getDuration() {
		return duration;
	}

	public String getDurationString() {
		int s = 0;
		int l = 0;
		s = (this.duration/60);
		l = (this.duration%60);
		return (s+":"+l);
	}
	
	public String getFullArtistName() {
		artist.getName();
		return name;
	}
	
}