package com.example.store.ui.main

import androidx.recyclerview.widget.DiffUtil

class ItemCompareCallback: DiffUtil.ItemCallback<Item>() {
    override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean {
        return (oldItem.name==newItem.name)
    }

    override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean {
        return oldItem == newItem
    }

}