package com.book.utils;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    private static final String DATE_FORMAT = "yyyy-MM-dd";

    /**
     *
     * @param yearOrDateStr Date (yyyy-MM-dd) or year (yyyy) format
     * @return LocalDate
     *
     * @throws IllegalArgumentException In case dateOrYearStr is not valid
     */
    public static LocalDate convertYearOrDate(String yearOrDateStr) {
        LocalDate publishedDate = null;
        if (StringUtils.isNotBlank(yearOrDateStr)) {
            try {
                if (yearOrDateStr.length() == 4) {
                    publishedDate = LocalDate.of(Integer.parseInt(yearOrDateStr), 1, 1);
                } else if (yearOrDateStr.length() == 10) {
                    publishedDate = LocalDate.parse(yearOrDateStr, DateTimeFormatter.ofPattern(DATE_FORMAT));
                }
            } catch (Exception e) {
                throw new IllegalArgumentException(String.format("Invalid date or year: %s. It should be a year (yyyy) or date (%s) format",
                        yearOrDateStr, DATE_FORMAT), e);
            }
        }
        return publishedDate;
    }
}
