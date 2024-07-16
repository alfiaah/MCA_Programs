#polymorphism

class Person:
    def __init__(self, name):
        self.name = name

    def greet(self):
        print(f"Hello, my name is {self.name}")
        
class Student:
    def __init__(self, name, sub):
        self.name = name
        self.sub = sub

    def greet(self):
        print(f"Hello, my name is {self.name} and I am a {self.sub} major")

p1 = Person("John")
s1 = Student("Jane", "Computer Science")

for x in(p1,s1):
    x.greet()