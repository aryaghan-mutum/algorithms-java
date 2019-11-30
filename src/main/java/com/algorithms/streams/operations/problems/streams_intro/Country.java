package com.algorithms.streams.operations.problems.streams_intro;

public class Country {
    
    private String name;
    private String capital;
    private long population;
    
    public Country(String name, String capital, long population) {
        this.name = name;
        this.capital = capital;
        this.population = population;
    }
    
    public String getCountryName() { return name; }
    
    public void setCountryName(String countryName) {
        this.name = countryName;
    }
    
    public String getCapital() { return capital; }
    
    public void setCapital(String countryCapital) {
        this.capital = countryCapital;
    }
    
    public long getPopulation() {
        return population;
    }
    
    public void setPopulation(long CountryPopulation) {
        this.population = CountryPopulation;
    }
    
    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", int=" + population +
                '}';
    }
}
