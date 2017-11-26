package com.uece.jeerest.interfaces;

public interface Strategy {
	
	public static final double PERC_GERENT = 0.08;
	public static final double PERC_ATEND = 0.03;
	public static final double PERC_PRESID = 0.15;

	double execute(int valor);
}
