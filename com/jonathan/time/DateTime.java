package com.jonathan.time;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Wrapper class for java.time.LocalDateTime in conjunction with java.time.format.DateTimeFormatter
 * Simple representation of Date and Time which handles it's own formatting
 */
public class DateTime {

    /**
     * Static final Date and Time format pattern String used to initialize the static java.time.format.DateTimeFormatter
     */
    private static final String dateTimeFormatPatternString;
    /**
     * Static final java.time.format.DateTimeFormatter used to keep a uniform Date and Time format between instances of DateTime
     */
    private static final DateTimeFormatter dateTimeFormatter;

    /*
     * Initializing static members
     */
    static {
        // Initializing the static final dateTimeFormatPatternString using the desired Date and Time format
        dateTimeFormatPatternString = "yyyy-MM-dd kk:mm";
        // Initializing the static final dateTimeFormatter using the static final dateTimeFormatPatternString
        dateTimeFormatter = DateTimeFormatter.ofPattern(dateTimeFormatPatternString);
    }

    /**
     * java.time.LocalDateTime object used to store the Date and Time data
     */
    private LocalDateTime localDateTime;

    /**
     * Default constructor simply initializes the inner LocalDateTime using the current Date and Time
     * obtained using static java.time.LocalDateTime.now() method
     */
    public DateTime() {
        this.setLocalDateTime(LocalDateTime.now());
    }

    /**
     * Basic constructor takes LocalDateTime as parameter and sets it's inner LocalDateTime to the parameter passed
     * @param localDateTime LocalDateTime with which the inner LocalDateTime will be initialized
     */
    public DateTime(LocalDateTime localDateTime) {
        this.setLocalDateTime(localDateTime);
    }

    /**
     * Static method which returns a formatted String representation of the passed LocalDateTime parameter,
     * obtains the formatted String using the static dateTimeFormatter.format() method,
     * passing the passed LocalDateTime parameter as a parameter
     * @param localDateTime the LocalDateTime for which a formatted String representation will be returned
     * @return the formatted String representation of the passed LocalDateTime
     */
    @NotNull
    public static String getFormattedLocalDateTime(LocalDateTime localDateTime) {
        return DateTime.getDateTimeFormatter().format(localDateTime);
    }

    /*
     * Override Methods
     */


    /**
     * Overrides the toString() method and returns a formatted String representation of the inner LocalDateTime,
     * obtains the formatted String using the static dateTimeFormatter.format() method, passing it's inner LocalDateTime
     * @return the formatting String representation of Date and Time obtained using DateTime.dateTimeFormatter.format()
     */
    @Override
    public String toString() {
        return DateTime.getDateTimeFormatter().format(this.getLocalDateTime());
    }


    /*
     * Getters and Setters
     */

    /**
     * Basic getter for the static final dateTimeFormatPatternString, simply returns the dateTimeFormatPatternString
     * @return the static final dateTimeFormatPatternString
     */
    public static String getDateTimeFormatPatternString() {
        return DateTime.dateTimeFormatPatternString;
    }

    /**
     * Basic getter for the static final dateTimeFormatter, simply returns the dateTimeFormatter
     * @return the static final dateTimeFormatter
     */
    private static DateTimeFormatter getDateTimeFormatter() {
        return DateTime.dateTimeFormatter;
    }

    /**
     * Basic getter for the inner LocalDateTime, simply returns the inner LocalDateTime
     * @return the inner LocalDateTime
     */
    private LocalDateTime getLocalDateTime() {
        return this.localDateTime;
    }

    /**
     * Basic setter for the inner LocalDateTime, simply sets the inner LocalDateTime to the parameter passed
     * @param localDateTime LocalDateTime which the inner LocalDateTime will be set to
     */
    private void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

}
