CREATE DATABASE vehicleManagement;

USE vehicleManagement;

CREATE TABLE vehicle (
    vehicleId DOUBLE PRIMARY KEY,
    make VARCHAR (50),
    model VARCHAR (50),
    engineInCC INT, 
    fuelCapacity INT,
    mileage INT,
    price FLOAT,
    roadTax FLOAT 
    );
    
CREATE TABLE car (
    vehicleId DOUBLE,
    ac VARCHAR(10),
    powerSteering VARCHAR(10),
    accessoryKit VARCHAR(100),
    FOREIGN KEY(vehicleId) REFERENCES vehicle (vehicleId)
    ON DELETE CASCADE ON UPDATE CASCADE
    );


CREATE TABLE bike (
    vehicleId DOUBLE,
    selfStart VARCHAR (10),
	  helmetPrice INT,
    FOREIGN KEY(vehicleId) REFERENCES vehicle (vehicleId)
    ON DELETE CASCADE ON UPDATE CASCADE
    );
