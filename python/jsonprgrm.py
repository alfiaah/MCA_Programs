import json

# Create a dictionary
person = {
    "name": "John",
    "age": 30,
    "city": "New York"
}


person_json = json.dumps(person)

print(person_json)  

print(type(person_json))
person_dict = json.loads(person_json)

print(person_dict)  # Outputs: {'name': 'John', 'age': 30, 'city': 'New York'}