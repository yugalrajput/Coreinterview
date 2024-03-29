package log4j;


import org.apache.log4j.Logger;

public class TestLog {

    public static void main(String[] args) {
        Logger log = Logger.getLogger(TestLog.class);
        log.debug("This is debug message");
        log.info("This is info message");
        log.warn("This is warn message");
        log.error("This is error message");
        log.fatal("This is fatal message");

        int i = 10;
        try {
        	int j = i / 0;
        } catch (Exception e) {
            log.error(e + "This is error message");
        }

    }

}
