package com.training.spring.racecar;

import java.util.List;

public class Radio {
	
	private List<String> songs;

	public String playSong(int id) {
		String song = songs.get(id);
		return song;
	}

	public List<String> getSongs() {
		return songs;
	}

	public void setSongs(List<String> songs) {
		this.songs = songs;
	}
}
