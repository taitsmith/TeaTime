package net.taitsmith.teatime.api

import net.taitsmith.teatime.data.Tea
import retrofit2.http.GET


interface ApiInterface {

    @GET("teas")
    suspend fun getAllTeas() : List<Tea>

}
