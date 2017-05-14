package com.example.constants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductDetailsExample {
	
	public final static HashMap<String,List<String>> ProductDetailsExampleMap = new HashMap<>();
	
	public final static List<String> colourList = new ArrayList<>();
	public final static	List<String> stateList = new ArrayList<>();
	public final static List<String> sizeList = new ArrayList<>();
	public final static List<String> milesList = new ArrayList<>();
	public final static List<String> mediaList = new ArrayList<>();
	public final static List<String> farmingList = new ArrayList<>();
	public final static List<String> raceList = new ArrayList<>();
	public final static List<String> jobList = new ArrayList<>();
	public final static List<String> surfaceList = new ArrayList<>();
	
	static {
		colourList.add("Bialy");
		colourList.add("Czarny");
		colourList.add("Szary");
		colourList.add("Zielony");
		
		stateList.add("Nowy");
		stateList.add("Używany");
		
		sizeList.add("S");
		sizeList.add("M");
		sizeList.add("L");
		sizeList.add("XL");
		
		milesList.add("50000");
		milesList.add("120000");
		milesList.add("190000");
		milesList.add("260000");
		
		mediaList.add("Podprowadzone");
		mediaList.add("Brak");
		mediaList.add("W cenie");
		
		raceList.add("Bez Rodowodu");
		raceList.add("Z Rodowodem");
		
		surfaceList.add("60m2");
		surfaceList.add("15a");
		surfaceList.add("0.5ha");
		
		jobList.add("UOP");
		jobList.add("B2B");
		jobList.add("UZ");
		
		ProductDetailsExampleMap.put(CategoryDetailsExample.Colour,colourList);
		ProductDetailsExampleMap.put(CategoryDetailsExample.STATE,stateList);
		ProductDetailsExampleMap.put(CategoryDetailsExample.SIZE,sizeList);
		ProductDetailsExampleMap.put(CategoryDetailsExample.MILES,milesList);
		ProductDetailsExampleMap.put(CategoryDetailsExample.MEDIA,mediaList);
		ProductDetailsExampleMap.put(CategoryDetailsExample.RACE,raceList);
		ProductDetailsExampleMap.put(CategoryDetailsExample.TYPE_OF_JOB,jobList);
		ProductDetailsExampleMap.put(CategoryDetailsExample.SURFACE,surfaceList);
		
	}

}
