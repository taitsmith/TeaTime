package net.taitsmith.teatime.data

data class Tea  (
    var id:             Int?,
    var name:           String = "",
    var type:           String = "",
    var region:         String = "",
    var temp:           Int = 0,
    var time:           Int = 0,
    var description:    String = ""
)