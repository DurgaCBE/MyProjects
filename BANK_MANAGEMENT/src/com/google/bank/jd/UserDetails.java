package com.google.bank.jd;
import java.util.*;
public class UserDetails {
	double bal;
	public  boolean hi(Long accno)
	{
		Map<Long,Double> ud=new HashMap<Long,Double>();
		boolean result=false;
		
		ud.put(2450079363461l,(double) 15500 );
		ud.put(2450079363462l,(double) 14000 );
		ud.put(2450079363463l,(double) 74678 );
		ud.put(2450079363464l,(double) 54768 );
		ud.put(2450079363465l,(double) 123444 );
		ud.put(2450079363466l,(double) 76543 );
		ud.put(2450079363467l,(double) 98756 );
		ud.put(2450079363468l,(double) 127654 );
		ud.put(2450079363469l,(double) 56476 );
		ud.put(2450079363460l,(double) 23434 );
		
		for (Map.Entry<Long,Double> me : ud.entrySet()) 
		{
		    Long key = me.getKey();
		    if (key.equals(accno))
		    {
		    	this.bal=me.getValue();
		    	result=true;  		    
		    }
		}
		return result; 

	}
}
