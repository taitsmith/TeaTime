package net.taitsmith.teatime.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Tea::class], version = 1)
abstract class TeaDatabase: RoomDatabase() {
    abstract fun teaDao(): TeaDao
}