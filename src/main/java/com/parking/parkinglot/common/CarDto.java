package com.parking.parkinglot.common;

import com.parking.parkinglot.entities.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarDto {
    Long id;
    String licensePlate;
    String parkingSpot;
    String ownerName;

    public CarDto(Long id, String licensePlate, String parkingSpot, String ownerName) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.parkingSpot = parkingSpot;
        this.ownerName = ownerName;
    }

    public Long getId() {
        return id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getParkingSpot() {
        return parkingSpot;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public static List<CarDto> copyCarsToDto(List<Car> cars) {
        return cars.stream()
                .map(car -> new CarDto(
                        car.getId(),
                        car.getLicensePlate(),
                        car.getParkingSpot(),
                        car.getOwner().getUsername()
                ))
                .collect(Collectors.toList());
    }

}
