package com.shaishab316.englishstudy.subclass

import com.shaishab316.englishstudy.activity.Sub
import com.shaishab316.englishstudy.root

class Narration : Sub() {
    override fun loadData() {
        add("Narration কি");
        add("Rules on passage narration");
        add("According to Tense");
        add("According to Modal Verb");
        add("According to Person");
        add("According to Sentence");
    }

    override fun url() = "$root/English Grammar/${title()}/"
    override fun title() = "Narration"
}