import java.util.LinkedList;

import java.util.Scanner;

import java.io.File;

import java.io.File;

import java.io.IOException;
/*Authors: Jeffrey Cutcliffe and Justin Trece
 *Version: 09.2017
 *Assignment: Homework 3
*/

public class HW3{

    public HW3(){

    }

    public static void main(String[] args) {

        Borders borderz = new Borders();

        LinkedList<Borders> borders= importBord(borderz);

        //    LinkedClass<Countries> countries = importCount();
        LinkedList<Countries> countries = new LinkedList<>();

        String name =greet();

        String querie = greet1();

        LinkedList<Borders> setTo= new LinkedList<>();
        //LinkedClass<String> setTo=null;

        Borders setToo = null;

        if(querie.equals("pop")){

            //setTo=returnCountries(countries,name);
            populateCountryArray();
            /*setTo=populateCountryArray();

            //System.out.println(setTo.length());

            for(int i=0;i<setTo.length();i++){

               // System.out.print(setTo.get(i).getName());
                System.out.print(setTo.get(i).getName());

            }
            */
            System.out.println();

        }

        if(querie.equals("bord")){

            setToo=returnBord(borders,name);

            System.out.println(setToo.getBorderName());

            setToo.printBorders();

            System.out.println();

        }

        if(querie.equals("both")){

            setToo = returnBord(borders,name);

            setTo=returnBoth(borders);

            for(int i=0;i<setTo.size();i++){

                System.out.print(setTo.get(i).getBorderName() + " ");

            }

            System.out.println();

        }



    }

    public static LinkedList<Borders> importBord(Borders border){

        LinkedList<String> linesOfBords=new LinkedList<String>();

        LinkedList<Borders> bordering = new LinkedList<Borders>();

        Scanner sc = new Scanner(System.in);

        try{

            sc = new Scanner(new File("borders.txt"));

        }catch(Exception e){

            System.out.println(e);

        }

        sc.useDelimiter("_");

        int counter=0;

        // System.out.println("didn't even do the first");



        while(sc.hasNext()){

            linesOfBords.add(sc.next());

            counter++;

        }

        counter=0;

        Scanner breaker = new Scanner(System.in);

        breaker.useDelimiter(" ");

        Borders borderly = new Borders();

        // System.out.println("1st loop complete");

        for(int k=0;k<9;k++){

            // System.out.println("hi");

            breaker=new Scanner(linesOfBords.get(k));

            int counters=0;

            // System.out.println(  k);

            borderly = new Borders();

            // System.out.println("Does for loop");

            while(breaker.hasNext()){

                // System.out.println(  counter);

                if(counters==0){

                    borderly.setBorderName(breaker.next());

                    counters++;// Oh my god i just tested this for hours not knowing what was wrong. You want to know? yeah this was originally named counter not counters....

                }else{

                    // System.out.println(breaker.next());

                    String s = breaker.next();

                    borderly.addBorder(s);

                    counters++;

                }

                // System.out.println(borderly.getBorderName());

                // borderly.printBorders();

            }

            bordering.add(borderly);

        }

        return bordering;

    }

    /*   public static LinkedClass<Countries> importCount(){

           LinkedClass<Countries> returnArray = new LinkedClass<Countries>();

           for(int i=0;i<10;i++){

               returnArray.add(populateCountryArray());

           }

           return returnArray;

       }
   */
    public static String greet(){

        String country = "";



        System.out.println("Hello there please do tell me the name of the country you'd like information on");

        Scanner sc = new Scanner(System.in);

        sc.useDelimiter("\n");

        country=sc.next();

        return country;

    }

    public static String greet1(){

        Scanner sc = new Scanner(System.in);

        String whatToDo="";

        System.out.println("Please enter whether you'd like a list of countries with a population over 35,000,000, what borders these countries or both (pop/bord/both)");

        whatToDo=sc.next();

        return whatToDo;

    }

    public static LinkedList<Countries> populateCountryArray(){

        File newFile =null;

        Scanner sc=null;

        Countries namedCountry = new Countries();
        LinkedList<Countries> countryArray = new LinkedList<Countries>();
        int popLimit = 35000000;

        try{

            newFile= new File("input.txt");

            sc = new Scanner(newFile);

        }catch(Exception e){

            System.out.println(e);

        }
        for(int i=0; i < 9; i++){
            namedCountry.setName(sc.next());
            namedCountry.setLat(sc.next());
            namedCountry.setLongi(sc.next());
            namedCountry.setCountryA(Integer.parseInt(sc.next()));
            namedCountry.setCountryPop(Integer.parseInt(sc.next()));
            namedCountry.setGDP((Double.parseDouble(sc.next())));
            namedCountry.setYear((Integer.parseInt(sc.next())));
            //System.out.print(namedCountry.getName());
            if(namedCountry.getCountryPop() > popLimit){
                System.out.print(namedCountry.getName() + " ");
            }



        }

   /*     for(int i=0;i<7;i++){

            switch(i){

                case 0: namedCountry.setName(sc.next());

                    break;

                case 1: namedCountry.setLat(sc.next());

                    break;

                case 2: namedCountry.setLongi(sc.next());

                    break;

                case 3: namedCountry.setCountryA(Integer.parseInt(sc.next()));

                    break;

                case 4: namedCountry.setCountryPop((Integer.parseInt(sc.next())));

                    //isPop==True&&country.getCountryPop()>100000000?System.out.println(country.getName());  Was going to try to do it without arrays as a challenge but it proved too much for the amount of time I have

                    break;

                case 5: namedCountry.setGDP((Double.parseDouble(sc.next())));

                    break;

                case 6: namedCountry.setYear((Integer.parseInt(sc.next())));

                    break;

                default:System.out.println("Broke");

                    break;

            }

        }
*/
        return countryArray;

    }

    public static Borders returnBord(LinkedList<Borders> jimbo, String a){

        LinkedList<Borders> returnArray=new LinkedList<Borders>();

        Borders bord = new Borders();

        //System.out.println("happens");

        for(int i=0;i<jimbo.size();i++){

            //  System.out.println("yeah");

            //  System.out.println(jimbo.get(i).getBorderName()+"a");

            // System.out.println((a)+"a");

            // System.out.println( a.substring(1,2));

            String  b = jimbo.get(i).getBorderName();

            b.trim();

            a.trim();

            //System.out.println( b);

            //System.out.println( b.compareTo(a));

            if(b.compareTo(a)==0){

                //System.out.println("yaeh?");

                return jimbo.get(i);

            }

        }

        return null;

    }

    public static LinkedList<Countries> returnCountries(LinkedList<Countries> jimbo,String theName){

        LinkedList<Countries> returnArray = new LinkedList<Countries>();
        //LinkedClass<String> returnArray = new LinkedClass<String>();
        int popLimit = 35000000;

        for (int i=0;i<jimbo.size();i++) {

            if(jimbo.get(i).getCountryPop()>popLimit){
                returnArray.add(jimbo.get(i));
                //returnArray.add(jimbo.get(i).getName());

            }

        }

        //System.out.println(returnArray.get(2).getName());

        return returnArray;

    }
    public static LinkedList<Borders> returnBoth(LinkedList<Borders> bords){
        // LinkedClass<Borders> bords = new LinkedClass<>();


        LinkedList<Borders> returnArray = new LinkedList<>();
        // System.out.println(bords.get(0).getBorderName());
        for(int i = 0; i < bords.size(); i++){
            if(bords.get(i).getBorderName().equals("Germany")){
                returnArray.add(bords.get(i));
            }
            if(bords.get(i).getBorderName().equals("France")){
                returnArray.add(bords.get(i));
            }
            if(bords.get(i).getBorderName().equals("Poland")){
                returnArray.add(bords.get(i));
            }
        }
        return returnArray;
    }

}