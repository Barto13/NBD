
printjson(db.people.insertOne({
    "sex":"Male",
    "first_name":"Bartek",
    "last_name":"Urło",
    "job":"Student",
    "email":"bartek.u@gmail.com",
    "location":{"city":"Warsaw",
    "address":{"streetname":"Czerwona",
    "streetnumber":"25"}},
    "description":"super description",
    "height":"178.38",
    "weight":"66.81",
    "birth_date":"1997-04-12T03:55:03Z",
    "nationality":"Poland",
    "credit":[{"type":"switch",
    "number":"6751234939100098699",
    "currency":"PLN",
    "balance":"2154.46"}]
}))