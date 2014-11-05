package com.networks.contextprofilecreator;

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
}
