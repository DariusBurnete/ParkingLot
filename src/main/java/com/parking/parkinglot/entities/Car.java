package com.parking.parkinglot.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "CAR", uniqueConstraints =
@UniqueConstraint(name = "UNIQUE_CAR_OWNER", columnNames = {"OWNER_ID"}))
public class Car {
  @GeneratedValue
  @Id
  private Long id;

  @Basic
  private String licensePlate;

  @Basic
  private String parkingSpot;

  @ManyToOne
  @JoinColumn(name = "OWNER_ID", foreignKey =
  @ForeignKey(name = "FK_CAR_OWNER_ID"))
  private User owner;

  @OneToOne(mappedBy = "car", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private CarPhoto photo;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getLicensePlate() {
    return licensePlate;
  }

  public void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }

  public String getParkingSpot() {
    return parkingSpot;
  }

  public void setParkingSpot(String parkingSpot) {
    this.parkingSpot = parkingSpot;
  }

  public User getOwner() {
    return owner;
  }

  public void setOwner(User owner) {
    this.owner = owner;
  }

  public CarPhoto getPhoto() {
    return photo;
  }

  public void setPhoto(CarPhoto photo) {
    this.photo = photo;
  }
}