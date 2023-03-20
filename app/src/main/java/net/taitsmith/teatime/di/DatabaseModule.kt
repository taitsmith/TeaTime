package net.taitsmith.teatime.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import net.taitsmith.teatime.data.TeaDatabase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context) = Room.databaseBuilder(
        context,
        TeaDatabase::class.java,
        "teatime_database"
    ).build()

    @Singleton
    @Provides
    fun provideTeaDao(db: TeaDatabase) = db.teaDao()
}