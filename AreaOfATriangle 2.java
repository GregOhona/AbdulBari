/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areaofatriangle;

import java.util.Scanner;

/**
 *
 * @author Greg
 */
public class AreaOfATriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float base;
        float height;
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base Length: ");               
        base = sc.nextFloat();
        System.out.println("Enter Height: ");             
        height = sc.nextFloat();
        float area = (.5f * (base * height));
    
        System.out.println("Area of the Triangle is: "+area);               
        // TODO code application logic here
    }
    
}
