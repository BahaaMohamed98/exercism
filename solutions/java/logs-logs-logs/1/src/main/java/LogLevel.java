public enum LogLevel {
    UNKNOWN(0),
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42);

    private final int code;

    LogLevel(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static LogLevel fromString(String logString) {
        return switch (logString) {
            case "TRC" -> TRACE;
            case "DBG" -> DEBUG;
            case "INF" -> INFO;
            case "WRN" -> WARNING;
            case "ERR" -> ERROR;
            case "FTL" -> FATAL;
            default -> UNKNOWN;
        };
    }
}
