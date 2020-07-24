package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {
	
	Person person;

	@BeforeEach
	void setUp() throws Exception {
		person = new Person(1156218, "Allison", "Coopersmith", 16108);	
	}

	@AfterEach
	void tearDown() throws Exception {
		person = null;
	}

	@Test
	void testPersonConstructor_setsEmployeeIdCorrectly() {
		assertEquals(1156218, person.getEmployeeId());
	}
	
	@Test
	void testPersonConstructor_setsFirstNameCorrectly() {
		assertEquals("Allison", person.getFirstName());
	}
	
	@Test
	void testPersonConstructor_setsLastNameCorrectly() {
		assertEquals("Coopersmith", person.getLastName());
	}

	@Test
	void testPersonConstructor_setsZipCodeCorrectly() {
		assertEquals(16108, person.getZipCode());
	}
	
	@Test
	void testPersonConstructor_setsCarpoolCorrectly() {
		assertEquals(0, person.getCarpool());
	}
	
	@Test
	void testCarpoolSetter_setsCarpoolCorrectly() {
		person.setCarpool(1);
		assertEquals(1, person.getCarpool());
	}
	
	@Test
	void testPersonToString_printsCorrectString() {
		assertEquals("Name = Allison Coopersmith, employee ID = 1156218, zip code = 16108, carpool = 0", person.toString());
	}
}
