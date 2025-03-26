package com.shaishab316.englishstudy.subclass

import com.shaishab316.englishstudy.activity.Sub
import com.shaishab316.englishstudy.root

class Voice : Sub() {
    override fun loadData() {
        add("Voice কি")

        for (i in 1..16) add("Rule $i")
    }

    override fun url() = "$root/English Grammar/${title()}/"
    override fun title() = "Voice"
}