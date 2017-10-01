
public class Countries{

    private String countryName="";

    private String latitude="";

    private String longitude="";

    private int countryArea =0;

    private int countryPopulation =0;

    private double countryGDP =0.0;

    private int countryYear = 0;

    public Countries(){



    }

    public Countries(String country, String lat, String longi,int countryA,int countryPop,double gdp, int year){

        countryName=country;

        latitude=lat;

        longitude=longi;

        countryArea=countryA;

        countryPopulation=countryPop;

        countryGDP=gdp;

        countryYear=year;

    }

    public String getName(){

        return countryName;

    }

    public String getLat(){

        return latitude;

    }

    public String getLongi(){

        return longitude;

    }

    public int getCountryA(){

        return countryArea;

    }

    public int getCountryPop(){

        return countryPopulation;

    }

    public double getGDP(){

        return countryGDP;

    }

    public int getYear(){

        return countryYear;

    }

    public void setName(String name){

        countryName=name;

    }

    public void setLat(String lat){

        latitude = lat;

    }

    public void setLongi(String longi){

        longitude=longi;

    }

    public void setCountryA(int a){

        countryArea=a;

    }

    public void setCountryPop(int pop){

        countryPopulation=pop;

    }

    public void setGDP(double gdp){

        countryGDP=gdp;

    }

    public void setYear(int year){

        countryYear=year;

    }

}