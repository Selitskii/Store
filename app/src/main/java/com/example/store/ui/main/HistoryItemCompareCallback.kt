package com.example.store.ui.main

import androidx.recyclerview.widget.DiffUtil

class HistoryItemCompareCallback: DiffUtil.ItemCallback<HistoryItem>() {
    override fun areItemsTheSame(oldItem: HistoryItem, newItem: HistoryItem): Boolean {
        return (oldItem.name==newItem.name)
    }

    override fun areContentsTheSame(oldItem: HistoryItem, newItem: HistoryItem): Boolean {
        return oldItem.data == newItem.data
    }

}