a=1
b=2.8
c=7j
d="Alfia "
e='A H'
f=["apple","orange","mango"]
i=[1,2,3]
j=list((2,3,8))
g={'1,2,3'}
h=('a','b','c')
i=["apple","orange","mango",(2,3,8)]

print('Type of a is : ',type(a))
print('Type of b is : ',type(b))
print('Type of c is : ',type(c))
print('Type of d is : ',type(d))
print('Type of e is : ',type(e))
print('My name is: ',d+e)
print('Type of f is : ',type(f))
print('Type of g is : ',type(g))
print('Type of h is : ',type(h))
print('Type of i is : ',type(i))
print('Type of j is : ',type(j))
print(j[0])
j[0]=5
print(j)


list1=[1.0,2,3,4,5.5,('a','b','c')]
list2=["albin","alfia","anjaleena",[11,12,13,14,(1,2)]]
list3= list((2,4,6,8,10)) #double parenthesis is needed to run without errors
print("The type of list1", type(list1)) 
print("The type of list2", type(list2))
print("The type of list3", type(list3))  

d={
    "student1":{
    "name":"alfia",
    "age":"22",
    "city":"banglore",
    "marks":{
        'maths':90,
        'science': 80
    }    
    },
"student2":{
    "name":"sarah",
    "age":"22",
    "city":"banglore",
    "marks":{
        'maths':95,
        'science': 99
    }    
    }
}
print(d.get('student1').get('marks'))
d['student1']

thisdict = {
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
thisdict.pop("model")
print(thisdict)

print(len(e))

thislist = ["apple", "banana", "cherry"]
mylist = thislist.copy()
print(mylist)
print(thislist)

thislist = ["apple", "baa", "cherry"]
mylist = thislist.copy()
print(mylist)
print(thislist)

set1={1,2,3,4,5}
set2={'a','b','c','d',21,22,23,'a',22,'23'}
print(set1)
print(set2)