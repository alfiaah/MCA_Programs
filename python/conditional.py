myList=['albin','anjaleena','abhinav','abhijith','adithya']

print(myList)
print(myList[0])

length=len(myList)

if(length>0):
    print("List is not empty")
else:
    print("List is empty")
    
print("--------------------------------------------")
# Accessing elements in a list using a for loop
for i in myList:
    print(i)
    
print("--------------------------------------------")
# sorting the list
myList.sort()

print(myList)

i=0
while i<length:
    print(myList[i])
    i=i+1