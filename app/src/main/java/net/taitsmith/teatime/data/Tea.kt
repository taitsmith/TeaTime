package net.taitsmith.teatime.data

import io.realm.RealmObject

open class Tea : RealmObject() {
    //holds name of tea for display in various places
    //tea object used to populate <Tea> list
    var name: String? = null

    //holds tea type (black, white, etc) for display
    var type: String? = null

    //holds region for display
    var region: String? = null

    //holds directions (temperature and time) for display
    var directions: String? = null
    var description: String? = null
}