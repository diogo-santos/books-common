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
}
