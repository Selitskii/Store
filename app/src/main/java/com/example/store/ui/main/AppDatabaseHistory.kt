package com.example.store.ui.main

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [HistoryItem::class], version = 4)
abstract class AppDatabaseHistory : RoomDatabase() {
    abstract fun historyItemDao(): HistoryItemDao?
}