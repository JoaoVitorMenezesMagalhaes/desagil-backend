package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrackTest {
	private Artist artist;
	private String name;
	
	void setUp() {
		a = new Artist("a");
	}

	@Test
	void testZeroSeconds() {
		Track track = new Track("A","B", 0);		
		assertEquals("0:00", duration.getDurationString());
	}

	@Test
	void testFiveSeconds() {
		duration = 5;
		assertEquals("0:05", duration.getDurationString());
	}

	@Test
	void testTwentyFiveSeconds() {
		duration = 25;
		assertEquals("0:25", getDurationString());
	}

	@Test
	void testOneMinuteZeroSeconds() {
		duration = 60;
		assertEquals("1:00", getDurationString());
	}

	@Test
	void testOneMinuteFiveSeconds() {
		duration = 65;
		assertEquals("1:05", getDurationString());
	}

	@Test
	void testOneMinuteTwentyFiveSeconds() {
		duration = 85;
		assertEquals("1:25", getDurationString());
	}

	@Test
	void testTwoMinutesZeroSeconds() {
		duration = 120;
		assertEquals("2:00", getDurationString());
	}

	@Test
	void testTwoMinutesFiveSeconds() {
		duration = 125;
		assertEquals("2:05", getDurationString());
	}

	@Test
	void testTwoMinutesTwentyFiveSeconds() {
		duration = 145;
		assertEquals("2:25", getDurationString());
	}

	@Test
	void testOneCollaborator() {
		assertEquals(true, false);
	}

	@Test
	void testTwoCollaborators() {
		assertEquals(true, false);
	}
}
