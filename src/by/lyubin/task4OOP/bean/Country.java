package by.lyubin.task4OOP.bean;

import java.util.Arrays;

public class Country {
    private String name;
    private String capital;
    private District[] districts;
    private int regionNumbers;

    private int regionCounter = 0;

    public Country(String name, String capital, int regionNumbers) {
        this.name = name;
        this.capital = capital;
        this.regionNumbers = regionNumbers;
        this.districts = new District[regionNumbers];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public District[] getDistricts() {
        return districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

    public int getNumberOfRegions() {
        return regionNumbers;
    }

    public void setNumberOfRegions(int numberOfRegions) {
        this.regionNumbers = numberOfRegions;
    }

    private double getArea() {
        return regionsCalcArea();
    }

    public String showArea() {
        double area = regionsCalcArea();
        return " Area of " + this.name + " is " + area + " sqrt km ";
    }

    public void addRegion(District district) {
        if (regionCounter < districts.length) {
            districts[regionCounter] = district;
            regionCounter++;
        } else {
            System.out.println("You can add only " + districts.length + " districts");
        }

    }

    public void showRegions() {
        System.out.format("%-15s %15s %25s %n", "District", "District center", "Area, thsds.sqrt km");

        for (District district : districts) {
            System.out.format("%-15s %15s %25s %n", district.getName(), district.getRegionCenter(), district.getArea());
        }

        System.out.format("%-15s %15s %25s %n", "", "", "Total: " + getArea());
    }

    private double regionsCalcArea() {
        double totalArea = 0;

        for (District district : districts) {
            totalArea += district.getArea();
        }

        return totalArea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (regionNumbers != country.regionNumbers) return false;
        if (regionCounter != country.regionCounter) return false;
        if (name != null ? !name.equals(country.name) : country.name != null) return false;
        if (capital != null ? !capital.equals(country.capital) : country.capital != null) return false;

        return Arrays.equals(districts, country.districts);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (capital != null ? capital.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(districts);
        result = 31 * result + regionNumbers;
        result = 31 * result + regionCounter;
        return result;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", districts=" + Arrays.toString(districts) +
                ", numberOfRegions=" + regionNumbers +
                ", regionCounter=" + regionCounter +
                '}';
    }
}
