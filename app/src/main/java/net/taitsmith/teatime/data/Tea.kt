package net.taitsmith.teatime.data

data class Tea(
    //holds name of tea for display in various places
    //tea object used to populate <Tea> list
    var name: String,

    //holds tea type (black, white, etc) for display
    var type: String,

    //holds region for display
    var region: String,

    //holds directions (temperature and time) for display
    var directions: String,
    var description: String
)