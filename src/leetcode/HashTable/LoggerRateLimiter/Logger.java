package leetcode.HashTable.LoggerRateLimiter;

import java.util.HashMap;
import java.util.Map;

class Logger {

    public static final int TIMEOUT = 10;
    private final Map<String, Integer> messageNextTimeStamp = new HashMap<>(TIMEOUT);
    private final String[] lastMessages = new String[TIMEOUT];

    public boolean shouldPrintMessage(int timestamp, String message) {
        int nextTimeStamp = messageNextTimeStamp.getOrDefault(message, timestamp);
        if (nextTimeStamp <= timestamp) {
            int messageIndex = messageNextTimeStamp.size() % TIMEOUT;
            String messageToDelete = lastMessages[messageIndex];
            lastMessages[messageIndex] = message;
            if (messageToDelete != null)
                messageNextTimeStamp.remove(messageToDelete);
            messageNextTimeStamp.put(message, timestamp + TIMEOUT);
            return true;
        }
        return false;
    }
}
