package com.vehicles.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collection;
import java.util.Scanner;

public class main {

	public static final int CAR = 1;
	public static final int BIKE = 2;
													//////ARRAY 
	static ArrayList frontWheel = new ArrayList();
	static ArrayList backWheel = new ArrayList();
		
											
	
	
	static Scanner lector;

	public static void main(String[] args) throws Exception {

		lector = new Scanner(System.in);
//variables

		String plate, brand, color;
		String brandrightbackWheel, brandlefttbackWheel, brandrightfrontWheel, brandleftfrontWheel;
		String brandfrontWheel, brandbackWheel;

		int vehicle = 0;

		double diameterfrontWheel, diameterbackWheel;
		double diameterrightfrontWheel, diameterleftbackWheel, diameterrightbackWheel, diameterleftfrontWheel;

// pregunta si vol crear COTXE O MOTO

		System.out.println("Vol crear cotxe(1) o moto(2)?: ");

		vehicle = Integer.parseInt(lector.nextLine());
		if ((vehicle != CAR) && (vehicle != BIKE)) {
			return;
		} else {
			switch (vehicle) {
			case CAR:
				System.out.println("Has escollit crear un cotxe. ");
				break;
			case BIKE:
				System.out.println("Has escollit crear una moto. ");
				break;
			}
		}

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////

//demanar MATRICULA, comprovar si es correcte		

		System.out.println("Introdueix matrícula : ");
		plate = lector.nextLine();

//demanar MARCA  del cotxe / moto

		System.out.println("De quina marca es?: ");
		brand = lector.nextLine();

//demanar COLOR			

		System.out.println("Quin es el color?: ");
		color = lector.nextLine();

		////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//creacio objecte COTXE	 / MOTO 

		// if

		if (vehicle == CAR) {

			Car car = new Car(plate, brand, color);

			addFrontWheel_car();

			addBackWheel_car();

			car.addWheels(frontWheel, backWheel);

		} else {

			Bike bike = new Bike(plate, brand, color);

			addFrontWheel_bike();

			addBackWheel_bike();

			bike.addWheels(frontWheel, backWheel);

		}

//creació del cotxe / moto amb les rodes		

		// else

		// bike addFrontWheel();
		// bike addBackWheel();

	}

	/////////////////////////// COTXE /////////////////////////
	public static void addFrontWheel_car() throws Exception {

//  MARCA RODES DAVANTERES

		System.out.println("Introdueix marca de la roda davantera dreta");
		String brandrightfrontWheel = lector.nextLine();

		System.out.println("Introdueix marca de la roda davantera esquerra");
		String brandleftfrontWheel = lector.nextLine();

// DIAMETRE RODES DAVANTERES

		System.out.println("Introdueix diametre de la roda davantera dreta");
		double diameterrightfrontWheel = Double.parseDouble(lector.nextLine());

		System.out.println("Introdueix diametre de la roda davantera esquerra");
		double diameterleftfrontWheel = Double.parseDouble(lector.nextLine());

		Wheel leftfrontWheel = new Wheel(brandleftfrontWheel, diameterleftfrontWheel);
		Wheel rightfrontWheel = new Wheel(brandrightfrontWheel, diameterrightfrontWheel);

		frontWheel.add(rightfrontWheel);
		frontWheel.add(leftfrontWheel);

	}

	public static void addBackWheel_car() throws Exception {

//MARCA RODES POSTERIORS

		System.out.println("Introdueix marca de la roda posterior dreta");
		String brandrightbackWheel = lector.nextLine();

		System.out.println("Introdueix marca de la roda posterior esquerra");
		String brandleftbackWheel = lector.nextLine();

//DIAMETRE RODES POSTERIORS

		System.out.println("Introdueix diametre de la roda posterior dreta");
		double diameterrightbackWheel = Double.parseDouble(lector.nextLine());

		System.out.println("Introdueix diametre de la roda posterior esquerra");
		double diameterleftbackWheel = Double.parseDouble(lector.nextLine());

		Wheel leftbackWheel = new Wheel(brandleftbackWheel, diameterleftbackWheel);
		Wheel rightbackWheel = new Wheel(brandrightbackWheel, diameterrightbackWheel);

		backWheel.add(leftbackWheel);
		backWheel.add(rightbackWheel);

	}
	/////////////////////////////////////// MOTO ///////////////////////////

	public static void addFrontWheel_bike() throws Exception {

		System.out.println("Introdueix marca de la roda davantera: ");
		String brandfrontWheel = lector.nextLine();

		System.out.println("Introdueix diametre de la roda davantera: ");
		double diameterfrontWheel = Double.parseDouble(lector.nextLine());

		Wheel frontwheel = new Wheel(brandfrontWheel, diameterfrontWheel);

		frontWheel.add(frontwheel);
	}

	public static void addBackWheel_bike() throws Exception {

		System.out.println("Introdueix marca de la roda posterior: ");
		String brandbackWheel = lector.nextLine();

		System.out.println("Introdueix diametre de la roda posterior:");
		double diameterbackWheel = Double.parseDouble(lector.nextLine());

		Wheel backwheel = new Wheel(brandbackWheel, diameterbackWheel);

		backWheel.add(backwheel);
	}

}

//public static void main(){   
// SOLO VA A SABER QUE EXISTE EL CONTROLADOR
//controller controller = new controller ();;
//controller.createFishes();
//controller.createMamals();
//controller.feedAllAnimals();
//public ArrayList getWheel() {
//ArrayList<Wheel> (List<Wheel> frontWheels, List<Wheel> backWheels){ 
//}