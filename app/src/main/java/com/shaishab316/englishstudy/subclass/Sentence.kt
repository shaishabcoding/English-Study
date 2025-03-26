package com.shaishab316.englishstudy.subclass

import com.shaishab316.englishstudy.activity.Sub
import com.shaishab316.englishstudy.root

class Sentence : Sub() {
    override fun loadData() {
        add("Sentence কি")
        add("Assertive Sentence")
        add("Interrogative Sentence")
        add("Imperative Sentence")
        add("Optative Sentence")
        add("Exclamatory Sentence")
        add("Simple Sentence")
        add("Compound Sentence")
        add("Complex Sentence")
    }

    override fun url() = "$root/English Grammar/${title()}/"
    override fun title() = "Sentence"
}