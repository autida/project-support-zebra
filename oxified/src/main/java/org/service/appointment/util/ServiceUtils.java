package main.java.org.service.appointment.util;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

public class ServiceUtils {
    private static final Pattern INVALID_CHARACTER_PATTERN = Pattern.compile("[\"\'\\\\]");
    static final int ID_LENGTH = 5;

    private ServiceUtils() {}

    public static boolean isValidString(String toValidate) {
        if (StringUtils.isBlank(toValidate)) {
            return false;
        }
        return INVALID_CHARACTER_PATTERN.matcher(toValidate).find();
    }

    public static String generateId() {
        return RandomStringUtils.randomAlphanumeric(ID_LENGTH);
    }
}
