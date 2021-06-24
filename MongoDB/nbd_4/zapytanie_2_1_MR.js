var mapFunction1 = function() {
    emit(this.sex, {count: 1, height: parseFloat(this.height), weight: parseFloat(this.weight)});
 };

var reduceFunction1 = function(key, values) {
    var output = {count :0, height: 0, weight: 0};

    values.forEach(values => {
        output.height += values.height;
        output.weight += values.weight;
        output.count += values.count;
    })

    return output;
 };

 var finalizeFunction1 = function(key, value){
     value.avgHeight = value.height/value.count;
     value.avgWeight = value.weight/value.count;

     var result = {avgHeight: 0, avgWeight: 0};
     result.avgHeight = value.avgHeight;
     result.avgWeight = value.avgWeight;

     return result;
 };

db.people.mapReduce(
    mapFunction1,
    reduceFunction1,
    { out: "wynik_2_1_MR", finalize: finalizeFunction1}
 )

 printjson(db.wynik_2_1_MR.find().toArray())

