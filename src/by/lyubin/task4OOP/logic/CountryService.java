package by.lyubin.task4OOP.logic;

import by.lyubin.task4OOP.bean.Country;
import by.lyubin.task4OOP.bean.District;

public class CountryService {
    public String showArea(Country country) {
        double area = districtCalcArea(country);
        return " Area of " + country.getName() + " is " + area + " sqrt km ";
    }

    public double getArea(Country country) {
        return districtCalcArea(country);
    }

    private double districtCalcArea(Country country) {
        double total = 0;

        for (District district : country.getDistricts()) {
            total += district.getArea();
        }

        return total;
    }
}
