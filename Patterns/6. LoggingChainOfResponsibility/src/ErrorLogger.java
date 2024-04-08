public class ErrorLogger extends loggerAbstractClass {
    ErrorLogger(loggerAbstractClass logger) {
        super(logger);
    }

    public void log(int logLevel, String message) {

        if(logLevel == ERROR) {
            System.out.println("ERROR LOG : " + message);
        } else {
            super.log(logLevel,message);
        }

    }

}
