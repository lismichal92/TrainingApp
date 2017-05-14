package com.example.constants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CategoryDetailsExample {
	
	public final static HashMap<Integer,List<String>> CategoryDetailsExampleMap = new HashMap<>();
	
	public final static List<String> carListCategoryDetails = new ArrayList<>();
	public final static	List<String> clothesListCategoryDetails = new ArrayList<>();
	public final static List<String> immovablesListCategoryDetails = new ArrayList<>();
	public final static List<String> electronicsListCategoryDetails = new ArrayList<>();
	public final static List<String> houseAndGardenListCategoryDetails = new ArrayList<>();
	public final static List<String> farmingListCategoryDetails = new ArrayList<>();
	public final static List<String> petListCategoryDetails = new ArrayList<>();
	public final static List<String> musicListCategoryDetails = new ArrayList<>();
	public final static List<String> jobListCategoryDetails = new ArrayList<>();
	
	
	public final static String Colour = "KOLOR";
	public final static String STATE = "STAN";
	public final static String SIZE = "ROZMIAR";
	public final static String MILES = "PRZEBIEG";
	public final static String MEDIA = "MEDIA";
	public final static String RACE = "RASA";
	public final static String TYPE_OF_JOB = "TYP UMOWY";
	public final static String SURFACE = "POWIERZCHNIA";
	
	static {
		carListCategoryDetails.add(Colour);
		carListCategoryDetails.add(MILES);
		
		clothesListCategoryDetails.add(SIZE);
		clothesListCategoryDetails.add(Colour);
		
		immovablesListCategoryDetails.add(MEDIA);
		immovablesListCategoryDetails.add(SURFACE);
		
		electronicsListCategoryDetails.add(STATE);
		
		houseAndGardenListCategoryDetails.add(STATE);
		houseAndGardenListCategoryDetails.add(Colour);
		
		farmingListCategoryDetails.add(STATE);
		
		petListCategoryDetails.add(RACE);
		
		musicListCategoryDetails.add(STATE);
		
		jobListCategoryDetails.add(TYPE_OF_JOB);
		
		
		CategoryDetailsExampleMap.put(1, carListCategoryDetails);
		CategoryDetailsExampleMap.put(2, clothesListCategoryDetails);
		CategoryDetailsExampleMap.put(3, immovablesListCategoryDetails);
		CategoryDetailsExampleMap.put(4, electronicsListCategoryDetails);
		CategoryDetailsExampleMap.put(5, houseAndGardenListCategoryDetails);
		CategoryDetailsExampleMap.put(6, farmingListCategoryDetails);
		CategoryDetailsExampleMap.put(7, petListCategoryDetails);
		CategoryDetailsExampleMap.put(8, musicListCategoryDetails);
		CategoryDetailsExampleMap.put(9, jobListCategoryDetails);
	}

}
