package main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SoundUnitTest {
	private final double time = 7.2;
	private final double speed = 1100;
	Sound sound = new Sound();
	@Test
	void test() {
		assertEquals(7920.0,sound.calculation(time,speed),"");
	}
}
