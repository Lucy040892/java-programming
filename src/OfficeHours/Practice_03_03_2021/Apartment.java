package OfficeHours.Practice_03_03_2021;

public class Apartment {
    public static void main(String[] args){
        String address = "1212 N.Mulligan Ave";
        String nameOfOwner = "Maria Vlasyk";
        byte numberOfUnits = 3;
        double averageSizeOfEachUnit = 23.5;
        int monthlyRentAmount = 1100;
        byte numberOfWashersAndDriers = 2;
        boolean arePetsAllowed = true;
        boolean hasAPool = false;
        byte lengthOfLease = 2;
        byte totalNumberOfResidents = 7;
        long phoneNumberOfOwner = 1234545587L;
        boolean isNearGasStation = true;
        byte numberOfFloors = 3;
        boolean hasABasement = true;
        boolean hasAvailableUnitsForRent = false;
        boolean hasAirConditioning = true;
        byte numberOfParkingSpaces = 6;
        byte numberOfReviewStarts = 3;

        double monthlyRentAfter3Years = monthlyRentAmount - monthlyRentAmount * 0.1;
        double monthlyRentAfter6Years = monthlyRentAmount - monthlyRentAmount * 0.2;
        double averageNumberOfResidentsPerUnit = totalNumberOfResidents / numberOfUnits;
        double averageNumberOfParkingSpotsPerUnit = numberOfParkingSpaces /numberOfUnits;
        int numberOfUnitsPerFloor = numberOfUnits / numberOfFloors;

        System.out.println("Monthly rent after 3 years will be " +monthlyRentAfter3Years);
        System.out.println("Monthly rent after 6 years will be " +monthlyRentAfter6Years);
        System.out.println("Average number of residents per unit is " +averageNumberOfResidentsPerUnit);
        System.out.println("Average number of parking spots per unit is " +averageNumberOfParkingSpotsPerUnit);
        System.out.println("Average number of units per floor is " +numberOfUnitsPerFloor);
    }
}
