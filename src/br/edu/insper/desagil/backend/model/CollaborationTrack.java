package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.List;

public class CollaborationTrack extends Track{
	private List<Artist> collaborators;

	public CollaborationTrack(Artist artist, String name, int duration) {
		super(artist, name, duration);
		this.collaborators = new ArrayList<>();
	}

	public List<Artist> getCollaborators() {
		return collaborators;
	}

	@Override
	public String getFullArtistName(){
		
	}
	
}