import java.util.LinkedList;
import java.util.Scanner;

import java.io.File;

public class Borders{

    private LinkedList<String> borders = new LinkedList<String>();

    private String borderName ="";

    public Borders(){

        borders= new LinkedList<String>();

    }

	/*

	public String[ getBorders(){

		Scanner sc = new Scanner(System.in);

		try{

			sc = new Scanner(new File("borders.txt"));

		}catch(Exception e){

			System.out.println(e);

		}

		sc.useDelimiter("_");

		int counter=0;

		while(sc.hasNext()){

			linesOfBords[counter]=sc.next();

			counter++;

		}

		counter=0;

		Scanner breaker = new Scanner(System.in);

		breaker.useDelimiter(" ");

		for(int i=0;i<borders[0].length;i++){

			breaker=new Scanner(linesOfBords[i]);

			int counters=0;

			while(breaker.hasNext()){

				borders[i][counters]=breaker.next();

				counter++;

			}

		}

		return borders;



	}

	*/

    public void addBorder(String read){

        borders.add(read);

    }

    public LinkedList<String> getBorders(){

        return borders;

    }

    public void printBorders(){

        for(int i=0; i<borders.size();i++){

            System.out.println(borders.get(i));

        }

    }

    public String getBorderName(){

        return borderName;

    }

    public void setBorderName(String stringy){

        borderName = stringy;

    }



}