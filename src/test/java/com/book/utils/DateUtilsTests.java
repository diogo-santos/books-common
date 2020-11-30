package com.book.utils;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DateUtilsTests {

	@Test
	void givenYearStr_WhenConvertYearOrDateTest() {
		// Given
		String year = "2000";
		// When
		LocalDate actual = DateUtils.convertYearOrDate(year);
		//Then
		LocalDate expected = LocalDate.of(2000, 1, 1);
		assertEquals(expected, actual);
	}

	@Test
	void givenDateStr_WhenConvertYearOrDateTest() {
		// Given
		String year = "2020-12-31";
		// When
		LocalDate actual = DateUtils.convertYearOrDate(year);
		//Then
		LocalDate expected = LocalDate.of(2020, 12, 31);
		assertEquals(expected, actual);
	}

	@Test
	void givenInvalidDateFormat_WhenConvertYearOrDateTest() {
		// Given
		String year = "20/20/2000";
		// When
		Exception exception = assertThrows(IllegalArgumentException.class, () ->
			DateUtils.convertYearOrDate(year)
		);
		// Then
		String expectedMessage = "Invalid date or year: 20/20/2000. It should be a year (yyyy) or date (yyyy-MM-dd) format";
		String actualMessage = exception.getMessage();

		assertEquals(actualMessage, expectedMessage);
	}

	@Test
	void givenInvalidDate_WhenConvertYearOrDateTest() {
		// Given
		String year = "any string";
		// When
		Exception exception = assertThrows(IllegalArgumentException.class, () ->
				DateUtils.convertYearOrDate(year)
		);
		// Then
		String expectedMessage = "Invalid date or year: any string. It should be a year (yyyy) or date (yyyy-MM-dd) format";
		String actualMessage = exception.getMessage();

		assertEquals(actualMessage, expectedMessage);
	}
}
