printjson(db.getCollection("people").aggregate([
    { 
        $group: {
        _id: { job: "$job" },
        }
    }
]).toArray()
)