package by.lyubin.task4OOP.runner;

import by.lyubin.task4OOP.bean.City;
import by.lyubin.task4OOP.bean.District;
import by.lyubin.task4OOP.bean.Country;
import by.lyubin.task4OOP.logic.DistrictService;

import static by.lyubin.task4OOP.constant.CityConstant.*;
import static by.lyubin.task4OOP.constant.CoutryConstant.*;
import static by.lyubin.task4OOP.constant.DistrictConstant.*;


public class MainApp {

    public static void main(String[] args) {

        District district1 = new District(DISTRICT_BRESRSKIY, DISTRICT_CENTER_BREST, DISTRICT_AREA_BREST, DISTRICT_NUMBER_CITY);
        District district2 = new District(DISTRICT_VITEBSKIY, DISTRICT_CENTER_VITEBSK, DISTRICT_AREA_VITEBSK, DISTRICT_NUMBER_CITY);
        District district3 = new District(DISTRICT_GOMELSKIY, DISTRICT_CENTER_GOMEL, DISTRICT_AREA_GOMEL, DISTRICT_NUMBER_CITY);
        District district4 = new District(DISTRICT_GRODNENSKIY, DISTRICT_CENTER_GRODNO, DISTRICT_AREA_GRODNO, DISTRICT_NUMBER_CITY);
        District district5 = new District(DISTRICT_MINSK, DISTRICT_CENTER_MINSKI, DISTRICT_AREA_MINSKI, DISTRICT_NUMBER_CITY_MINSK);
        District district6 = new District(DISTRICT_MINSKIY, DISTRICT_CENTER_MINSK, DISTRICT_AREA_MINSK, DISTRICT_NUMBER_CITY);
        District district7 = new District(DISTRICT_MOGILEVSKIY, DISTRICT_CENTER_MOGILEV, DISTRICT_AREA_MOGILEV, DISTRICT_NUMBER_CITY);

        DistrictService districtService = new DistrictService();

        districtService.addCity(district1, new City(CITY_BREST));
        districtService.addCity(district1, new City(CITY_BARANOVICHI));
        districtService.addCity(district1, new City(CITY_BEREZA));

        districtService.addCity(district2, new City(CITY_VITEBSK));
        districtService.addCity(district2, new City(CITY_BESHENKOVICHI));
        districtService.addCity(district2, new City(CITY_BRASLAV));

        districtService.addCity(district3, new City(CITY_GOMEL));
        districtService.addCity(district3, new City(CITY_JLOBIN));
        districtService.addCity(district3, new City(CITY_JITKOVICHI));

        districtService.addCity(district4, new City(CITY_GRODNO));
        districtService.addCity(district4, new City(CITY_VOLKOVISK));
        districtService.addCity(district4, new City(CITY_IVIE));

        districtService.addCity(district5, new City(CITY_GRODNO));
        districtService.addCity(district5, new City(CITY_VOLKOVISK));
        districtService.addCity(district5, new City(CITY_IVIE));

        districtService.addCity(district6, new City(CITY_MINSK));
        districtService.addCity(district6, new City(CITY_VOLOJIN));
        districtService.addCity(district6, new City(CITY_DZERJINSK));

        districtService.addCity(district7, new City(CITY_MOGILEV));
        districtService.addCity(district7, new City(CITY_BIHOV));
        districtService.addCity(district7, new City(CITY_GORKI));


        Country country = new Country(COUTRY_NAME, CAPTITAL_COUNTRY, DISTRICT_NUMBER);

        country.addDistrict(district1);
        country.addDistrict(district2);
        country.addDistrict(district3);
        country.addDistrict(district4);
        country.addDistrict(district5);
        country.addDistrict(district6);
        country.addDistrict(district7);

        country.showDistricts();

        districtService.showCities(district1);
        System.out.println();
        districtService.showCities(district2);
        System.out.println();
        districtService.showCities(district3);
        System.out.println();
        districtService.showCities(district4);
        System.out.println();
        districtService.showCities(district5);
        System.out.println();
        districtService.showCities(district6);
        System.out.println();
        districtService.showCities(district7);
        System.out.println();


    }
}
