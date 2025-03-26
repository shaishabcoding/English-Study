package com.shaishab316.englishstudy.subclass

import com.shaishab316.englishstudy.activity.Sub
import com.shaishab316.englishstudy.root

class WritingPart : Sub() {
    override fun loadData() {
        add("Paragraph")
        add("Completing a Story")
        add("Letter")
        //add("Dialogue")
    }

    override fun url() = "$root/${title()}/"
    override fun title() = "Writing Part"
}