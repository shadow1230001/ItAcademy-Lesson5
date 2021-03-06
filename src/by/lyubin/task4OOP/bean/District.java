package by.lyubin.task4OOP.bean;

import java.util.Arrays;

public class District {
    private String name;
    private String districtCenter;
    private double area;
    private City[] cities;

    private int cityCounter = 0;

    public District(String name, String districtCenter, double area, int numOfCities) {
        this.name = name;
        this.districtCenter = districtCenter;
        this.area = area;
        cities = new City[numOfCities];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getDistrictCenter() {
        return districtCenter;
    }

    public void setDistrictCenter(String districtCenter) {
        this.districtCenter = districtCenter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public int getCityCounter() {
        return cityCounter;
    }

    public void setCityCounter(int cityCounter) {
        this.cityCounter = cityCounter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        District district = (District) o;

        if (Double.compare(district.area, area) != 0) return false;
        return cityCounter == district.cityCounter && (name != null ? name.equals(district.name) : district.name == null) && (districtCenter != null ? districtCenter.equals(district.districtCenter) : district.districtCenter == null) && Arrays.equals(cities, district.cities);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (districtCenter != null ? districtCenter.hashCode() : 0);
        temp = Double.doubleToLongBits(area);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + Arrays.hashCode(cities);
        result = 31 * result + cityCounter;
        return result;
    }

    @Override
    public String toString() {
        return "District{" +
                "name='" + name + '\'' +
                ", districtCenter='" + districtCenter + '\'' +
                ", area=" + area +
                ", cities=" + Arrays.toString(cities) +
                ", cityCounter=" + cityCounter +
                '}';
    }
}


