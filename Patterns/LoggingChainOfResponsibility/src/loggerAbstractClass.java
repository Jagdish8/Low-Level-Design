public abstract class loggerAbstractClass {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    public loggerAbstractClass nextLogger;

    loggerAbstractClass(loggerAbstractClass logger) {
        this.nextLogger = logger;
    }

    public void log(int logLevel, String message) {

        if(nextLogger != null) {
            nextLogger.log(logLevel,message);
        }

    }

}
