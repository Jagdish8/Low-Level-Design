public class DebugLogger extends loggerAbstractClass {

    DebugLogger(loggerAbstractClass logger) {
        super(logger);
    }

    public void log(int logLevel, String message) {

        if(logLevel == DEBUG) {
            System.out.println("DEBUG LOG : " + message);
        } else {
            super.log(logLevel,message);
        }

    }

}
