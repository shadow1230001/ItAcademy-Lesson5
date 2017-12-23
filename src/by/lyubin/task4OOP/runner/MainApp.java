package by.lyubin.task4OOP.runner;

import by.lyubin.task4OOP.bean.City;
import by.lyubin.task4OOP.bean.District;
import by.lyubin.task4OOP.bean.Country;

public class MainApp {
    public static void main(String[] args) {


        District district1 = new District("Brestskij", "Brest", 54.8, 3);
        District district2 = new District("Vitebskij", "Vitebsk", 40.0, 3);
        District district3 = new District("Gomelskij", "Gomel", 40.4, 3);
        District district4 = new District("Grodnenskij", "Grodno", 20.1, 3);
        District district5 = new District("Minsk", "Minsk", 0.3, 0);
        District district6 = new District("Minskij", "Minsk", 39.9, 3);
        District district7 = new District("Mogilevskij", "Mogilev", 29.1, 3);

        district1.addCity(new City("Brest"));
        district1.addCity(new City("Baranovichi"));
        district1.addCity(new City("Bereza"));

        district2.addCity(new City("Vitebsk"));
        district2.addCity(new City("Beshenkovichi"));
        district2.addCity(new City("Braslav"));

        district3.addCity(new City("Gomel"));
        district3.addCity(new City("Jlobin"));
        district3.addCity(new City("Jitkovichi"));

        district4.addCity(new City("Grodno"));
        district4.addCity(new City("Volkovisk"));
        district4.addCity(new City("Ivie"));

        district6.addCity(new City("Minsk"));
        district6.addCity(new City("Volojin"));
        district6.addCity(new City("Dzerjinsk"));

        district7.addCity(new City("Mogilev"));
        district7.addCity(new City("Bihov"));
        district7.addCity(new City("Gorki"));

        Country country = new Country(" RB ", "Minsk", 6);

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
