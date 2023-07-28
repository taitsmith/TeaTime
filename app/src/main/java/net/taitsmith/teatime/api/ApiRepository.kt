package net.taitsmith.teatime.api

import android.util.Log
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import kotlinx.coroutines.runBlocking
import net.taitsmith.teatime.data.Tea
import javax.inject.Inject

@Module
@InstallIn(ViewModelComponent::class)
class ApiRepository @Inject constructor(private val teaApiInterface: ApiInterface) {

    suspend fun getAllTeas() : List<Tea> {
        val teaList: List<Tea>

        runBlocking {
            teaList = teaApiInterface.getAllTeas()
            Log.d("TEA: ", teaList[0].name)
        }

        return teaList
    }
}