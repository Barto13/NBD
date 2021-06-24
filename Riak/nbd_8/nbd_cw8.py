# Napisz program, który wrzuci do bazy dokument,
# pobierze go i wypisze, zmodyfikuje go, następnie pobierze i wypisze,
# a na końcu usunie go i spróbuje pobrać z bazy.
# Sam program może być napisany w jednym z następujących języków programowania:
# •	Python
# •	Java (wyeksportowany projekt z Eclipse, NetBeans lub IntelliJ)
# •	Scala (wyeksportowany projekt z Eclipse, NetBeans, ScalaIDE lub IntelliJ)

import requests

print("Creating new document...")
r = requests.post('http://localhost:8098/buckets/s23432/keys/ex8', data = {'key':'value'})

print("Getting created document...")
r = requests.get('http://localhost:8098/buckets/s23432/keys/ex8')
print(r.text)

print("Modifying...")
r = requests.put('http://localhost:8098/buckets/s23432/keys/ex8', data = {'key':'modifiedValue', 'key2':123})

print("Getting modified document...")
r = requests.get('http://localhost:8098/buckets/s23432/keys/ex8')
print(r.text)

print("Deleting document...")
r = requests.delete('http://localhost:8098/buckets/s23432/keys/ex8')

r = requests.get('http://localhost:8098/buckets/s23432/keys/ex8')
print(r.text)