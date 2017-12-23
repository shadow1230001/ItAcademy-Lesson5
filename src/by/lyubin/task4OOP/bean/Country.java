package by.lyubin.task4OOP.bean;

import java.util.Arrays;

public class Country {
    private String name;
    private String capital;
    private District[] districts;
    private int districtNumbers;

    private int districtCounter = 0;

    public Country(String name, String capital, int districtNumbers) {
        this.name = name;
        this.capital = capital;
        this.districtNumbers = districtNumbers;
        this.districts = new District[districtNumbers];
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
        return districtNumbers;
    }

    public void setNumberOfRegions(int numberOfRegions) {
        this.districtNumbers = numberOfRegions;
    }

    private double getArea() {
        return districtCalcArea();
    }

    public String showArea() {
        double area = districtCalcArea();
        return " Area of " + this.name + " is " + area + " sqrt km ";
    }

    public void addDistict(District district) {
        if (districtCounter < districts.length) {
            districts[districtCounter] = district;
            districtCounter++;
        } else {
            System.out.println("You can add only " + districts.length + " districts");
        }

    }

    public void showDistricts() {
        System.out.format("%-15s %15s %25s %n", "District", "District center", "Area, thsds.sqrt km");

        for (District district : districts) {
            System.out.format("%-15s %15s %25s %n", district.getName(), district.getDistrictCenter(), district.getArea());
        }

        System.out.format("%-15s %15s %25s %n", "", "", "Total: " + getArea());
    }

    private double districtCalcArea() {
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

        if (districtNumbers != country.districtNumbers) return false;
        if (districtCounter != country.districtCounter) return false;
        if (name != null ? !name.equals(country.name) : country.name != null) return false;
        if (capital != null ? !capital.equals(country.capital) : country.capital != null) return false;

        return Arrays.equals(districts, country.districts);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (capital != null ? capital.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(districts);
        result = 31 * result + districtNumbers;
        result = 31 * result + districtCounter;
        return result;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", districts=" + Arrays.toString(districts) +
                ", numberOfRegions=" + districtNumbers +
                ", districtCounter=" + districtCounter +
                '}';
    }
}
