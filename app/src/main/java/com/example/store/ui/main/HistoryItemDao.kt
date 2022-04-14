package com.example.store.ui.main

import androidx.room.*
import androidx.room.OnConflictStrategy.IGNORE
import androidx.room.OnConflictStrategy.REPLACE


@Dao
interface HistoryItemDao {
    @Query("SELECT * FROM HistoryItems")
    fun getAll(): List<HistoryItem?>?

    @Query("SELECT * FROM HistoryItems WHERE id = :id")
    fun getById(id: Int): HistoryItem?

    @Insert(onConflict = REPLACE )
    fun insert(employee:HistoryItem?)

    @Update
    fun update(employee: HistoryItem?)

    @Delete
    fun delete(employee: HistoryItem?)
}