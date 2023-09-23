public class InfoLogger extends loggerAbstractClass {

    InfoLogger(loggerAbstractClass logger) {
        super(logger);
    }

    public void log(int logLevel, String message) {

        if(logLevel == INFO) {
            System.out.println("INFO LOG : " + message);
        } else {
            super.log(logLevel,message);
        }

    }

}
