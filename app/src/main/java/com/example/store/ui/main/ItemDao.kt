package com.example.store.ui.main

import androidx.room.*

@Dao
interface ItemDao {
    @Query("SELECT * FROM Items")
    fun getAll(): List<Item?>?

    @Query("SELECT * FROM Items WHERE id = :id")
    fun getById(id: Int): Item?

    @Insert
    fun insert(employee: Item?)

    @Update
    fun update(employee: Item?)

    @Delete
    fun delete(employee: Item?)
}