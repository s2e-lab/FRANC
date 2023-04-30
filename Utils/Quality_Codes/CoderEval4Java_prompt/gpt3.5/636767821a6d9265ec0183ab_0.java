return (thrown != null && !thrown.toString().isEmpty());
}

private Date timestamp;
private String loggerName;
private Level level;
private String message;
private Throwable thrown;


/**
 * Constructs a LogRecord with the specified values for the variables.
 */
public LogRecord(Level level, String message){
    this.level = level;
    this.message = message;
    this.timestamp = new Date();
}

/**
 * Constructs a LogRecord with the specified values for the variables.
 */
public LogRecord(Level level, String message, Throwable thrown){
    this.level = level;
    this.message = message;
    this.thrown = thrown;
    this.timestamp = new Date();
}

/**
 * @return the loggerName
 */
public String getLoggerName() {
    return loggerName;
}

/**
 * @param loggerName the loggerName to set
 */
public void setLoggerName(String loggerName) {
    this.loggerName = loggerName;
}

/**
 * @return the level
 */
public Level getLevel() {
    return level;
}

/**
 * @param level the level to set
 */
public void setLevel(Level level) {
    this.level = level;
}

/**
 * @return the message
 */
public String getMessage() {
    return message;
}

/**
 * @param message the message to set
 */
public void setMessage(String message) {
    this.message = message;
}

/**
 * @return the thrown
 */
public Throwable getThrown() {
    return thrown;
}

/**
 * @param thrown the thrown to set
 */
public void setThrown(Throwable thrown) {
    this.thrown = thrown;
}

/**
 * @return the timestamp
 */
public Date getTimestamp() {
    return timestamp;
}

/**
 * @param timestamp the timestamp to set
 */
public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
}  
  
}