package com.shaishab316.englishstudy.subclass

import com.shaishab316.englishstudy.activity.Sub
import com.shaishab316.englishstudy.root

class Dialogue : Sub() {
    override fun loadData() {
        add("Reading newspaper")
        add("Future plan of life")
        add("Your hobby")
        add("Preparation for the examination")
        add("The mobile phone")
        add("The importance of tree plantation")
        add("How to make good result in examination")
        add("The importance of education in the development of a nation")
    }

    override fun url() = "$root/Writing part/${title()}/"
    override fun title() = "Dialogue"
}