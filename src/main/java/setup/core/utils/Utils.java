package setup.core.utils;

import setup.core.enums.Dictionary;

import java.security.SecureRandom;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

import static org.awaitility.Awaitility.await;

public class Utils {

    public static String randomAlphanumericStringGenerator(int length, Dictionary dictionary) {
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++)
            sb.append(dictionary.getDictionary().charAt(rnd.nextInt(dictionary.getDictionary().length())));
        return sb.toString();
    }

    public static boolean waitFor(Callable<Boolean> function,
                                  long timeOutInSeconds,
                                  long pollIntervalMillis,
                                  long sleepInMillis) {
        try {
            await().atMost(timeOutInSeconds, TimeUnit.SECONDS)
                    .pollDelay(sleepInMillis, TimeUnit.MILLISECONDS)
                    .pollInterval(pollIntervalMillis,TimeUnit.MILLISECONDS)
                    .until(function);
        } catch (Throwable ex) {
            return false;
        }
        return true;
    }
}
