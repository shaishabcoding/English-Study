package com.shaishab316.englishstudy.subclass

import com.shaishab316.englishstudy.activity.Sub
import com.shaishab316.englishstudy.root

class PartsOfSpeech : Sub() {
    override fun loadData() {
        add("Parts of Speech কি")
        add("Noun")
        add("Pronoun")
        add("Adjective")
        add("Verb")
        add("Adverb")
        add("Preposition")
        add("Conjunction")
        add("Interjection")
    }

    override fun url() = "$root/English Grammar/${title()}/"
    override fun title() = "Parts of Speech"
}