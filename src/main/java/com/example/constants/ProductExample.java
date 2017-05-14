package com.example.constants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductExample {
	
	public final static HashMap<Integer,List<String>> ProductExampleMap = new HashMap<>();
	
	public final static List<String> carList = new ArrayList<>();
	public final static	List<String> clothesList = new ArrayList<>();
	public final static List<String> immovablesList = new ArrayList<>();
	public final static List<String> electronicsList = new ArrayList<>();
	public final static List<String> houseAndGardenList = new ArrayList<>();
	public final static List<String> farmingList = new ArrayList<>();
	public final static List<String> petList = new ArrayList<>();
	public final static List<String> musicList = new ArrayList<>();
	public final static List<String> jobList = new ArrayList<>();
	
	
	public final static List<String> cityList = new ArrayList<>();
	
	
	static {
		carList.add("BMW");
		carList.add("Audi");
		carList.add("Skoda");
		carList.add("Mercedes-Benz");
		
		clothesList.add("Buty");
		clothesList.add("Spodnie");
		clothesList.add("Marynarka");
		clothesList.add("Bluza");
		
		immovablesList.add("Mieszkanie");
		immovablesList.add("Dom");
		immovablesList.add("Dzialka");
		
		electronicsList.add("Telefon");
		electronicsList.add("Tablet");
		electronicsList.add("Telewizor");
		electronicsList.add("Komputer");
		
		houseAndGardenList.add("Meble");
		houseAndGardenList.add("Taczka");
		houseAndGardenList.add("Grabie");
		
		farmingList.add("Ciagnik");
		farmingList.add("Przyczepa");
		farmingList.add("Nawoz");
		
		petList.add("Pies");
		petList.add("Kot");
		petList.add("Rybki");
		
		musicList.add("Plyta vinyl");
		musicList.add("Gitara");
		musicList.add("Fortepian");
		
		jobList.add("Kelner");
		jobList.add("Mechanik");
		jobList.add("Informatyk");
		
		ProductExampleMap.put(1,carList);
		ProductExampleMap.put(2,clothesList);
		ProductExampleMap.put(3,immovablesList);
		ProductExampleMap.put(4,electronicsList);
		ProductExampleMap.put(5,houseAndGardenList);
		ProductExampleMap.put(6,farmingList);
		ProductExampleMap.put(7,petList);
		ProductExampleMap.put(8,musicList);
		ProductExampleMap.put(9,jobList);
		
		
		cityList.add("Warszawa");
		cityList.add("Lublin");
		cityList.add("Zamosc");
		cityList.add("Chełm");
		cityList.add("Gdansk");
		cityList.add("Sopot");
		
	}

}
