package com.somkanya_task4.maven.Clean_code;

import java.util.*;
import java.io.*;

public class Interest 
{
  double Simple_Interest(double principle,double rate,double time)
  {
	  return((principle*rate*time)/100);
  }
  
  double Compound_Interest(double principle,double rate,double time)
  {
	 return(principle*(Math.pow((1+rate/100),time)));
  }
}


