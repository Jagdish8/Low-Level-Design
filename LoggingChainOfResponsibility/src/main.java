public class main {

    public static void main(String args[]) {

        loggerAbstractClass loggerAbstractClass = new InfoLogger(new DebugLogger( new ErrorLogger(null)));

        loggerAbstractClass.log(1, "info log");
        loggerAbstractClass.log(2, "debug log");
        loggerAbstractClass.log(3, "error log");

    }
    
}
