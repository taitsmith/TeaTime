package net.taitsmith.teatime.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.Companion.REPLACE
import androidx.room.Query

@Dao
interface TeaDao {

    @Query("SELECT * FROM tea")
    fun getAll(): List<Tea>

    @Query("SELECT * FROM tea WHERE name LIKE :name LIMIT 1")
    fun findTeaByName(name: String): Tea

    @Query("SELECT * FROM tea WHERE triedIt = 1")
    fun triedTeas(): List<Tea>

    @Insert(onConflict = REPLACE)
    fun insertAll(vararg teas: Tea)

    @Delete
    fun delete(tea: Tea)
}