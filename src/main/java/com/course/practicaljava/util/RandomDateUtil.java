package com.course.practicaljava.util;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class RandomDateUtil {

	public static final long minDay = LocalDate.of(2010, Month.JANUARY, 1).toEpochDay();
	public static final long maxDay = LocalDate.now().toEpochDay();

	public static LocalDate generateRandomLocalDate() {
		long randomDay = minDay + ThreadLocalRandom.current().nextLong(maxDay - minDay);
		return LocalDate.ofEpochDay(randomDay);
	}

	public static Date generateRAndomDate() {
		var randomLocalDate = generateRandomLocalDate();
		return Date.from(randomLocalDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
	}

}
