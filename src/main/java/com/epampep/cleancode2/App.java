package com.epampep.cleancode2;

import java.util.Scanner;

import com.epampep.Cleancode.Construction;
import com.epampep.Cleancode.Interest;
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal");
        double principal=sc.nextDouble();
        System.out.println("Enter time");
        double time=sc.nextDouble();
        System.out.println("Enter rate_of_interest");
        double rate_of_interest=sc.nextDouble();
        System.out.println("Is automated ?");
        boolean automated=sc.nextBoolean();
        System.out.println("Enter material");
        String material=sc.next();
        System.out.println("Enter area");
        double area=sc.nextDouble();
        Interest s =new Interest(principal,rate_of_interest,time);
        double simple_interest=s.simple_interest();
        System.out.println("Simple Interest : "+simple_interest);
        double compound_interest=s.compound_interest();
        System.out.println("Compound Interest : "+compound_interest);
        Construction con =new Construction(automated, material, area);
        double cost=con.construction_cost();
        System.out.println("Total Cost : "+cost);
        sc.close();
    }
}
