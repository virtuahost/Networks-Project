package com.networks.contextprofilecreator;

//import java.lang.reflect.Array;
//import java.util.ArrayList;
//
//import android.R.array;

public class ContextInfo {
	//Initial contact time
	//Final contact time
	//computation speed
	//Network bandwidth
	//Unique ID
	private double contextLatitude = 0;
	private double contextLongitude = 0;
	private double contextDistanceFrom = -1;
	private String contextCPUUsage = "";
	
	public double getContextLatitude()
	{
		return contextLatitude;
	}
	public void setContextLatitude(double lat)
	{
		contextLatitude = lat;
	}
	public double getContextLongitude()
	{
		return contextLongitude;
	}
	public void setContextLongitude(double lat)
	{
		contextLongitude = lat;
	}
	public double getContextDistanceFrom()
	{
		return contextDistanceFrom;
	}
	public void setContextDistanceFrom(double lat)
	{
		contextDistanceFrom = lat;
	}
	public String getContextCPUUsage()
	{
		return contextCPUUsage;
	}
	public void setContextCPUUsage(String lat)
	{
		contextCPUUsage = lat;
	}
	
	public ContextInfo()
	{
		
	}
	
	public ContextInfo(String temp)
	{
		String[] arrTemp = temp.split(",");	
		if(arrTemp.length < 4)
		{
			return;
		}
		contextLatitude = Double.parseDouble(arrTemp[0]);
		contextLongitude = Double.parseDouble(arrTemp[1]);
		contextDistanceFrom = Double.parseDouble(arrTemp[2]);
		contextCPUUsage = arrTemp[3];
	}
}
