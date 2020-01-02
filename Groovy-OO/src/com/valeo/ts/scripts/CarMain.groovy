package com.valeo.ts.scripts



println "Car Details"
def engine = new Engine(engineNo:12987,fuelType:"Petrol")

def door = new Door(doorNo:9000,doorType:'Side Door')

//dependency Injection 
def car  =new Car(model:1918,name:"X-Car",engine:engine,door:door);
println car;
//Print details
println "Engine No ${car.engine.engineNo}"
println "fuelType ${car.engine.fuelType}"
println  "Door No ${car.door.doorNo}"
println  "Door Type ${car.door.doorType} "
println   "Model ${car.model}"
println   "Name ${car.name}"

def newCar = new Car();
newCar.engine = engine // newCar.setEngine(engine);



