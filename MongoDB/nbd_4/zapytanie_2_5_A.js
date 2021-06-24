printjson(db.getCollection("people").aggregate([

    { $match: { "nationality": "Poland", "sex": "Female" } },
    { $unwind: "$credit" },
    { $group: {
        _id: { currency: "$credit.currency" },
        sumBalance: { $sum: { $toDouble: "$credit.balance" } },
        avgBalance: { $avg: { $toDouble: "$credit.balance"} } ,
    } }
]).toArray()
)