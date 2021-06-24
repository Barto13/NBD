var mapFunction1 = function() {
    const bmi = parseFloat(this.weight)/(parseFloat(this.height)/100 * parseFloat(this.height)/100)
    emit(this.nationality, {count: 1, bmiSum: bmi, maxBmi: bmi, minBmi: bmi});
 };

var reduceFunction1 = function(key, values) {
    // var output = {count :0, bmi: [], bmiSum: 0};

    var output = {count :0, bmiSum: 0, maxBmi: 0, minBmi: 9999}

    
    values.forEach(value => {
        output.count += value.count;
        output.bmiSum += value.bmiSum;
        if(output.minBmi > value.minBmi){
            output.minBmi = value.minBmi;
        }
        if(output.maxBmi < value.maxBmi){
            output.maxBmi = value.maxBmi;
        }
        // output.bmi.push(value.bmi);
    })

    return output;
 };

 var finalizeFunction1 = function(key, value){
     value.avgBMI = value.bmiSum/value.count;
    //  value.minBMI = Math.min.apply(Math, value.bmi);
    //  value.maxBMI = Math.max.apply(Math, value.bmi);
    value.minBMI = value.minBmi;
    value.maxBMI = value.maxBmi;

     var result = {avgBMI: 0, minBMI: 0, maxBMI: 0};
     result.avgBMI = value.avgBMI;
     result.minBMI = value.minBMI;
     result.maxBMI = value.maxBMI;
     return result;
 };

 //min, max, sum - liczyc
 //reduce - nie push -^  + count
 //map min, max , sum
 //finalize koncowe obliczenia


db.people.mapReduce(
    mapFunction1,
    reduceFunction1,
    { out: "wynik_2_4_MR", finalize: finalizeFunction1}
 )

 printjson(db.wynik_2_4_MR.find().toArray())

