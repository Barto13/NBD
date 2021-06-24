printjson(db.getCollection("people").aggregate([
    
        { $unwind: "$credit" },
        { $group: {
            _id: { currency: "$credit.currency" },
            balance: { $sum: { $toDouble: "$credit.balance" } },
        } }
]).toArray()
)