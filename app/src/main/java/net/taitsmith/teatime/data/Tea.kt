package net.taitsmith.teatime.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Tea(
    @PrimaryKey(autoGenerate = true)
    val id: Int,

    var name: String,
    var type: String,
    var region: String,
    var instructions: String,
    var description: String
)