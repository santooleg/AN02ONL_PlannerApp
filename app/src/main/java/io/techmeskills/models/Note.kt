package io.techmeskills.an02onl_plannerapp.models

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "notes")
open class Note(
    @PrimaryKey(autoGenerate = true) val id: Long = 0L,
    val title: String,
    val date: String? = null,
    val userId: Long = -1 // -1 нужно что бы не вводить его при создании промежуточной заметки
) : Parcelable