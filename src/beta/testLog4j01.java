package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




public class testLog4j01 {

	private static Logger log =LogManager.getLogger(testLog4j01.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		log.debug("Debugging :::");
		
		if(5>10)
		{
			log.info("Information : ");
		}
		else
			log.error("Error");
		
		log.fatal("fatal");
		
		log.info("Successfully completed");
		
		
		
	}

}
