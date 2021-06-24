var mapFunction1 = function() {
    emit(this.job, 1);
 };

var reduceFunction1 = function(key, values) {
    return;
 };


db.people.mapReduce(
    mapFunction1,
    reduceFunction1,
    { out: "wynik_2_3_MR"}
 )

 printjson(db.wynik_2_3_MR.find().toArray())

