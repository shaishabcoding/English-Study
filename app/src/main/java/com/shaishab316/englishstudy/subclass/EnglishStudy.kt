package com.shaishab316.englishstudy.subclass

import com.shaishab316.englishstudy.R
import com.shaishab316.englishstudy.activity.Home

class EnglishStudy : Home() {
    override fun loadData() {
        add("English Grammar", R.drawable.english_grammar)
        add("Spoken English", R.drawable.spoken_english)
        add("Vocabulary", R.drawable.word)
        add("Writing Part", R.drawable.writing_part)
        add("English Stories", R.drawable.english_stories)
        add("Google Translate", R.drawable.google_translate)
    }

    override fun title() = "English Study"
}