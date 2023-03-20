package net.taitsmith.teatime.di

import javax.inject.Inject
import net.taitsmith.teatime.data.Tea
import net.taitsmith.teatime.data.TeaDao

class TeaRepository @Inject constructor(private val teaDao: TeaDao) {

    fun getAllTeas() = teaDao.getAll()
    fun addTeas(vararg tea: Tea) = teaDao.insertAll(*tea)

}