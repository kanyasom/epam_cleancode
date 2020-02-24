package com.somkanya_task4.maven.Clean_code;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

public class Client {

	//get logger object
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LOGGER.debug("Entered Main - THIS IS FROM DEBUG LOGGER");
		LOGGER.info("THIS IS FROM INFO LOGGER");
		LOGGER.warn("THIS IS FROM WARN LOGGER");
		LOGGER.error("THIS IS FROM ERROR LOGGER");
		LOGGER.fatal("THIS IS FROM FATAL LOGGER");
		Scanner sc = new Scanner(System.in);
		int choice;
		choice=sc.nextInt();
		if(choice==1)
		{
			//System.out.println("---Input details for house---\n Enter material standard\n total area\n Enter true or false for automated house:-1");
			House house =new House();
			double material=sc.nextDouble();
			double area=sc.nextDouble();
			boolean automated=sc.nextBoolean();
			double totalCost=house.constructionCost(material,area,automated);
			System.out.println(totalCost);
		}
		else
		{
			//System.out.println("----Input details for calculating Interest----\n Enter principle amount,rate,time period");
			  Interest interest = new Interest();
			  double principle =sc.nextDouble();
			  double rate =sc.nextDouble();
			  int time =sc.nextInt();
			  double simple_interest=interest.Simple_Interest(principle,rate,time);
			  System.out.println("SI:"+simple_interest);
			  double compound_interest=interest.Compound_Interest(principle,rate,time);
			  System.out.println("CI:"+compound_interest);
			  
		}

	}

}
