package com.shaishab316.englishstudy.subclass

import com.shaishab316.englishstudy.activity.Sub
import com.shaishab316.englishstudy.root

class EnglishGrammar : Sub() {
    override fun loadData() {
        add("Sentence")
        add("Parts of Speech")
        add("Tenses")
        add("Voice")
        add("Right forms of Verbs")
        add("Narration")
        add("Completing Sentences")
        add("Tag Questions")
    }

    override fun url() = "$root/${title()}/"
    override fun title() = "English Grammar"

}