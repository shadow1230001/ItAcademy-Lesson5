package by.lyubin.task4OOP.runner;

import by.lyubin.task4OOP.bean.City;
import by.lyubin.task4OOP.bean.District;
import by.lyubin.task4OOP.bean.Country;

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

        district1.addCity(new City(CITY_BREST));
        district1.addCity(new City(CITY_BARANOVICHI));
        district1.addCity(new City(CITY_BEREZA));

        district2.addCity(new City(CITY_VITEBSK));
        district2.addCity(new City(CITY_BESHENKOVICHI));
        district2.addCity(new City(CITY_BRASLAV));

        district3.addCity(new City(CITY_GOMEL));
        district3.addCity(new City(CITY_JLOBIN));
        district3.addCity(new City(CITY_JITKOVICHI));

        district4.addCity(new City(CITY_GRODNO));
        district4.addCity(new City(CITY_VOLKOVISK));
        district4.addCity(new City(CITY_IVIE));

        district6.addCity(new City(CITY_MINSK));
        district6.addCity(new City(CITY_VOLOJIN));
        district6.addCity(new City(CITY_DZERJINSK));

        district7.addCity(new City(CITY_MOGILEV));
        district7.addCity(new City(CITY_BIHOV));
        district7.addCity(new City(CITY_GORKI));

        Country country = new Country(COUTRY_NAME, CAPTITAL_COUNTRY, DISTRICT_NUMBER);

        country.addDistrict(district1);
        country.addDistrict(district2);
        country.addDistrict(district3);
        country.addDistrict(district4);
        country.addDistrict(district5);
        country.addDistrict(district6);
        country.addDistrict(district7);

        country.showDistricts();

        district1.showCities();
        System.out.println();
        district2.showCities();
        System.out.println();
        district3.showCities();
        System.out.println();
        district4.showCities();
        System.out.println();
        district5.showCities();
        System.out.println();
        district6.showCities();
        System.out.println();
        district7.showCities();
        System.out.println();


    }
}
