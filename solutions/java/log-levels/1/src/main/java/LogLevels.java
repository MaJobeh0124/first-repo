public class LogLevels {
    
    public static String message(String logLine) {
        int colonIndex = logLine.indexOf(":");
        return logLine.substring(colonIndex + 1).trim();
    }

    public static String logLevel(String logLine) {
        int closingBracketIndex = logLine.indexOf("]");
        String level = logLine.substring(1, closingBracketIndex);
        return level.toLowerCase();
    }

    public static String reformat(String logLine) {
        String message = message(logLine);
        String level = logLevel(logLine);
        return message + " (" + level + ")";
    }
}
