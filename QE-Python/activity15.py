class activity15:
    def __init__(self,manufacturer,model,make,transmission,color):
        self.manufacturer=manufacturer
        self.model=model
        self.make=make
        self.transmission=transmission
        self.color=color
    def accelerate(self):
        print(f"{self.manufacturer} {self.model} is moving..")
    def stop(self):
        print(f"{self.manufacturer} {self.model} has stopped")
car1=activity15(2015,"bmw","german","automatic","black")
car2=activity15(2018,"audi","india","manual","red")
car3=activity15(2019,"tata","us","automatic","black")
car1.accelerate()
car1.stop()
car2.accelerate()
car2.stop()
car3.accelerate()
car3.stop()
    
    