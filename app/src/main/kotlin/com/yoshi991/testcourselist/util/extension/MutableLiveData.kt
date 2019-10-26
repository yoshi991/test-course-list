package com.yoshi991.testcourselist.util.extension

import androidx.annotation.MainThread
import androidx.lifecycle.MutableLiveData

fun <T> mutableLiveDataOf() = MutableLiveData<T>()

@MainThread
fun <T> mutableLiveDataOf(defaultValue: T): MutableLiveData<T> {
    return MutableLiveData<T>().apply {
        value = defaultValue
    }
}
