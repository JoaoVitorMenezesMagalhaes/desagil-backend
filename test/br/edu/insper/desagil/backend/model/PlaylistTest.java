package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlaylistTest {
	private static double DELTA = 0.000001;

	@BeforeEach
	void setUp() {
	}

	@Test
	void testRoundDownToZero() {
		assertEquals(2.0, averageRatings());
	}

	@Test
	void testRoundUpToHalf() {
		assertEquals(1.5, averageRatings());
	}

	@Test
	void testRoundDownToHalf() {
		assertEquals(1.5, averageRatings());
	}

	@Test
	void testRoundUpToOne() {
		assertEquals(2.0, averageRatings());
	}
}
