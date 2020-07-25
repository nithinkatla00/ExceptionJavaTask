package EPAM.ConstructionCost;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



/**
 * Hello world!
 *
 */
interface HouseConstruction{
	double constructionCost(String materialStandard,double areaOftheHouse,boolean isFullyAutomated);
}
class ConstructionCostCalculator implements HouseConstruction{
	private static final Logger log = LogManager.getLogger(ConstructionCostCalculator.class);
	public static void main(String []args) {
		log.error("this.is error");
		//log.debug("Total cost is caluculated");
	}
	

	public double constructionCost(String materialStandard, double areaOftheHouse, boolean isFullyAutomated) {
		double totalCost = 0;
		switch(materialStandard) {
		case "Standard": 
			totalCost=1200;
			break;
		case "AboveStandard": 
			totalCost=1500;
			break;
		case "HighStandard": 
				if(isFullyAutomated) 
					totalCost=1800;
				else
					totalCost=2500;
				break;
				
	}
		log.info("Total cost is caluculated");
		return totalCost;
	
	
}
}