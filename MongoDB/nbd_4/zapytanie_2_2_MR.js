var mapFunction1 = function() {
    for (var i = 0; i < this.credit.length; i++){
        emit(this.credit[i].currency, parseFloat(this.credit[i].balance));
    }
 };

var reduceFunction1 = function(key, balance) {
    var output = { balance: 0};
    return Array.sum(balance);
 };

db.people.mapReduce(
    mapFunction1,
    reduceFunction1,
    { out: "wynik_2_2_MR"}
 )

 printjson(db.wynik_2_2_MR.find().toArray())

