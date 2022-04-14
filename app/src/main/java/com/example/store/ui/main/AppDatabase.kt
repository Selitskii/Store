package com.example.store.ui.main

import androidx.room.RoomDatabase

import androidx.room.Database


@Database(entities = [Item::class], version = 2)
abstract class AppDatabase : RoomDatabase() {
    abstract fun itemDao(): ItemDao?
}