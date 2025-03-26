package com.shaishab316.englishstudy.subclass

import com.shaishab316.englishstudy.activity.Sub
import com.shaishab316.englishstudy.root

class Tenses : Sub() {
    override fun loadData() {
        add("Tense কি");

        add("Present Indefinite Tense");
        add("Present Continuous Tense");
        add("Present Perfect Tense");
        add("Present Perfect Continuous Tense");

        add("Past Indefinite Tense");
        add("Past Continuous Tense");
        add("Past Perfect Tense");
        add("Past Perfect Continuous Tense");

        add("Future Indefinite Tense");
        add("Future Continuous Tense");
        add("Future Perfect Tense");
        add("Future Perfect Continuous Tense");
    }

    override fun url() = "$root/English Grammar/${title()}/"
    override fun title() = "Tenses"
}