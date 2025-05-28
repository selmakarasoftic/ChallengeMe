package com.example.challengeme.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [UserEntity::class], version = 1)
abstract class ChallengeMeDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao

    companion object {
        @Volatile private var INSTANCE: ChallengeMeDatabase? = null

        fun getDatabase(context: Context): ChallengeMeDatabase {
            return INSTANCE ?: synchronized(this) {
                Room.databaseBuilder(
                    context.applicationContext,
                    ChallengeMeDatabase::class.java,
                    "challengeme_db"
                ).build().also { INSTANCE = it }
            }
        }
    }
}
