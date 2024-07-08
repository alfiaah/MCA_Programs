class Department:
    def __init__(self, dname, code):
        self.dname = dname
        self.code = code
        
    def disp(self):
        print("Department Name: "+ self.dname +" and Code: "+self.code)
        
class Student(Department):
    def __init__(self, name, age, dept):
        super().__init__(dept.dname, dept.code)
        self.name = name
        self.age = age
        

    def disp(self):
        super().disp()
        print("Student Name: "+self.name)
        print("Student Age: "+str(self.age))

d = Department("Computer Science", "CS101")
s = Student("John Doe", 20, d)
s.disp()
