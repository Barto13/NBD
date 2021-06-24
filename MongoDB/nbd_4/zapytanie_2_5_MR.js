var mapFunction1 = function() {
    if(this.nationality == "Poland" && this.sex == "Female"){
        for (var i = 0; i < this.credit.length; i++){
            emit(this.credit[i].currency,  parseFloat(this.credit[i].balance) );
        }
    }

 };

var reduceFunction1 = function(key, balance) {
    var output = { balance: 0, sumBalance: 0, count: 0};

    output.sumBalance = Array.sum(balance);
    output.count = balance.length;

    return output;
 };

 var finalizeFunction1 = function(key, value){
     value.avgBalance = value.sumBalance/value.count;

     var result = {avgBalance: 0, sumBalance: 0};
     result.avgBalance = value.avgBalance;
     result.sumBalance = value.sumBalance;

     return result;
 };

db.people.mapReduce(
    mapFunction1,
    reduceFunction1,
    { out: "wynik_2_5_MR", finalize: finalizeFunction1}
 )

 printjson(db.wynik_2_5_MR.find().toArray())

