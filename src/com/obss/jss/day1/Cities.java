package com.obss.jss.day1;

import java.util.Scanner;

public class Cities {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of cities: ");
        int numOfCities = scanner.nextInt();
        scanner.nextLine();

        String [][] citiesAndDistricts = new String[numOfCities][4];

        for(int i = 0; i < numOfCities; i++) {
            System.out.println("Enter the city name: ");
            String cityName = scanner.nextLine();
            citiesAndDistricts[i][0] = cityName;
            System.out.println("Enter 3 districts for " + cityName + " separated by space: ");
            String allDistricts = scanner.nextLine();
            String [] spaceSeparatedDistricts = allDistricts.split(" ");
            int index = 0;
            while(index < 3) {
                citiesAndDistricts[i][index + 1] = spaceSeparatedDistricts[index];
                index++;
            }
        }

        for(int i=0; i<citiesAndDistricts.length; i++) {
            System.out.print("Districts of " + citiesAndDistricts[i][0] + " are");
            String districts = "";
            for(int j=1; j<citiesAndDistricts[i].length; j++) {
                districts = districts + " " + citiesAndDistricts[i][j];
            }
            System.out.println(districts);
        }
    }
}
