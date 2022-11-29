package ApacheLog4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HtmlLayoutEx  
{  
    static Logger log = LogManager.getLogger(HtmlLayoutEx.class);  
   
    public static void main(String[] args)  
    {  
   
        log.debug("Sample debug message");  
        log.info("Sample info message");  
        log.error("Sample error message");  
        log.fatal("Sample fatal message");  
    }  
}  
