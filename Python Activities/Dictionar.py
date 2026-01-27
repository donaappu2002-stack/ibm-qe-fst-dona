example_dict =	{
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}

x = example_dict.get("model")
print(x) # Output: Mustang

	
# for x in example_dict:
#   print(example_dict[x])

	
for x in example_dict.values():
  print(x)

	
for x, y in example_dict.items():
  print(x, y)