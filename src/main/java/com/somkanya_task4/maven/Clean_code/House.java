package com.somkanya_task4.maven.Clean_code;
import java.util.*;
import java.io.*;

public class House {
	double constructionCost(double material,double area,boolean automated)
	{
		double cost;
		if(material<=1200) {
			cost=1200*area;
		}
		else if(material >1200 || material<=1500) {
			 cost =1500*area;
		}
		else
		{
			cost = 1800*area;
		}
		
		if(automated)
		{
			return((2500*area)+cost);
		}
		else
		{
			return cost;
		}
	}
}