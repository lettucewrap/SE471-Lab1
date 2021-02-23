package com.Lab1;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // creates and prints new vehicle
        System.out.println("New Vehicle");
        Vehicle vehicle = new Vehicle("Ford", "Fiesta", 1999);
        vehicle.printVehicle();

        // creates and prints new bus
        System.out.println("\nNew Bus");
        Bus bus = new Bus("Fiat","470", 1998, "4Y1SL65848Z411439" );
        bus.setPlateNo("HELLO123");
        bus.printVehicle();
        bus.printBus();

        // creates and prints new chartered bus
        System.out.println("\nNew Charted Bus");
        ChartedBus chbus = new ChartedBus("General Motors","Buffalo", 1966, "5Y1SM65848Z414567" );
        chbus.setChBusName("chbus1");
        chbus.printVehicle();
        chbus.printChBus();

        // creates and prints new express bus
        System.out.println("\nNew Express Bus");
        ExpressBus exbus = new ExpressBus("Volvo","C10M", 1987, "8E1KL65848Z475869" );
        exbus.setExBusNO("ex1001");
        exbus.printVehicle();
        exbus.printExBus();

        // creates and prints new tour bus
        System.out.println("\nNew Tour Bus");
        TourBus trbus = new TourBus("CRRC","C12", 2016, "7G1UW63448U4869473" );
        trbus.setTrBusID("tr1234");
        trbus.printVehicle();
        trbus.printTrBus();

        // creates and prints new airplane
        System.out.println("\nNew Airplane");
        Airplane airplane = new Airplane("Piaggio","P180 Avanti EVO", 2017,"Turboprop" );
        airplane.printVehicle();
        airplane.printAirplane();

        // creates and prints new route
        System.out.println("\nNew Route");
        Route route = new Route("San Marcos", "Escondido");
        route.printRoute();

        // creates and prints new trail
        System.out.println("\nNew Trail");
        Trail trail = new Trail("Double Peak Park", "Via Vera Cruz");
        trail.setTrail("Double Peak/Ridgeline");
        trail.printRoute();
        trail.printTrail();

        // creates and prints new highway
        System.out.println("\nNew Highway");
        Highway highway = new Highway("Oceanside", "Julian");
        highway.setHighwayName("HW78");
        highway.printRoute();
        highway.printHighway();

        // creates and prints new flight route
        System.out.println("\nNew Flight Route");
        FlightRoute flightRoute = new FlightRoute("Camp Pendleton", "San Diego");
        flightRoute.setFlightNO("SD2379");
        flightRoute.printRoute();
        flightRoute.printFlight();

        //create route schedule 1
        Schedule rSchedule1 = new Schedule("12PM", "1PM");
        //create route schedule 2
        Schedule rSchedule2 = new Schedule("2PM", "3PM");
        //create route schedule 3
        Schedule rSchedule3 = new Schedule("8AM", "9PM");

        //create route schedule list
        List<Schedule> routeScheduleList = new ArrayList<>();
        routeScheduleList.add(rSchedule1);
        routeScheduleList.add(rSchedule2);
        routeScheduleList.add(rSchedule3);

        //set many schedules to one route and print schedule
        System.out.println("\nNew Route Schedule");
        route.setRouteSchedule(routeScheduleList);
        route.printRoute();
        for(Schedule schedule : routeScheduleList){
            System.out.println(schedule.getStart_time() + " " + schedule.getEnd_time());}

        //create trip schedule 1
        Schedule tSchedule1 = new Schedule("3PM", "4PM");
        //create route schedule 2
        Schedule tSchedule2 = new Schedule("1PM", "2PM");
        //create route schedule 3
        Schedule tSchedule3 = new Schedule("5AM", "6AM");

        //create trip schedule list
        List<Schedule> tripScheduleList = new ArrayList<>();
        tripScheduleList.add(tSchedule1);
        tripScheduleList.add(tSchedule2);
        tripScheduleList.add(tSchedule3);

        //create trip
        Trip trip = new Trip("Las Vegas", "New York");

        //set many schedules to one trip and print schedule
        System.out.println("\nNew Trip Schedule");
        trip.setTripSchedule(tripScheduleList);
        trip.printTrip();
        for(Schedule schedule : tripScheduleList){
            System.out.println(schedule.getStart_time() + " " + schedule.getEnd_time());}

        //create vehicle schedule 1
        Schedule vSchedule1 = new Schedule("1PM", "2PM");
        //create vehicle schedule 2
        Schedule vSchedule2 = new Schedule("3PM", "4PM");
        //create vehicle schedule 3
        Schedule vSchedule3 = new Schedule("7AM", "8AM");

        //create vehicle schedule list
        List<Schedule> vehicleScheduleList = new ArrayList<>();
        vehicleScheduleList.add(vSchedule1);
        vehicleScheduleList.add(vSchedule2);
        vehicleScheduleList.add(vSchedule3);

        //set many schedules to one vehicle and print schedule
        System.out.println("\nNew Vehicle Schedule");
        vehicle.setVehicleSchedule(vehicleScheduleList);
        vehicle.printVehicle();
        for(Schedule schedule : vehicleScheduleList){
            System.out.println(schedule.getStart_time() + " " + schedule.getEnd_time());}
    }


}

