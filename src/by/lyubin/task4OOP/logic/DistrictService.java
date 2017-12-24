package by.lyubin.task4OOP.logic;

import by.lyubin.task4OOP.bean.City;
import by.lyubin.task4OOP.bean.District;

public class DistrictService {
    public void addCity(District district, City city) {
        if (district.getName() != null && district.getName().equals("Minsk") && district.getCities().length == 0) {
            System.out.println(" Minsk cannot have any cities inside itsself ");
        } else if (district.getCities() != null && (district.getCityCounter() < district.getCities().length)) {
            City[] cities = district.getCities();
            cities[district.getCityCounter()] = city;
            district.setCities(cities);
            int newIndex = district.getCityCounter() + 1;
            district.setCityCounter(newIndex);
        } else {
            System.out.println(" You can add only " + district.getCities().length + " cities ");
        }
    }

    public void showCities(District district) {
        System.out.print("Cities of " + district.getName() + " region are: ");
        for (City city : district.getCities()) {
            System.out.print(city.getName() + " ");
        }
    }
}
