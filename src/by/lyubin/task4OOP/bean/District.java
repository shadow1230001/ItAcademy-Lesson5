package by.lyubin.task4OOP.bean;

public class District {
    private String name;
    private String regionCenter;
    private double area;
    private City[] cities;

    private int cityCounter = 0;

    public District(String name, String regionCenter, double area, int numOfCities) {
        this.name = name;
        this.regionCenter = regionCenter;
        this.area = area;
        cities = new City[numOfCities];
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getRegionCenter() {
        return regionCenter;
    }

    public void setRegionCenter(String regionCenter) {
        this.regionCenter = regionCenter;
    }

    double getArea() {
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

    public void addCity(City city) {
        if (this.getName().equals("Minsk") && this.cities.length == 0) {
            System.out.println(" Minsk cannot have any cities inside itsself ");
        } else if (cityCounter < cities.length) {
            cities[cityCounter] = city;
            cityCounter++;
        } else {
            System.out.println(" You can add only " + cities.length + " cities ");
        }
    }

    public void showCities() {
        System.out.print("Cities of " + this.name + " region are: ");
        for (City city : this.cities) {
            System.out.print(city.getName() + " ");
        }
    }
}


