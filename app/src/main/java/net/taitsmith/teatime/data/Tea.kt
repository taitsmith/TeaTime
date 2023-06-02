package net.taitsmith.teatime.data

import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey
import org.mongodb.kbson.ObjectId

class Tea : RealmObject {
    @PrimaryKey
    var _id: ObjectId = ObjectId()
    var name: String = ""
    var type: String = ""
    var region: String = ""
    var temp: Int = 0
    var time: Int = 0
    var description: String = ""
    var triedIt: Boolean = false
}