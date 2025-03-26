package com.shaishab316.englishstudy.subclass

import com.shaishab316.englishstudy.activity.Sub
import com.shaishab316.englishstudy.root

class Vocabulary : Sub() {
    override fun loadData() {
        for (c in "ABCDEFGHIJKLMNOPQRSTUVWXYZ") add("$c দ্বারা গঠিত ভোকাবুলারি শব্দ")
    }

    override fun url() = "$root/${title()}/"
    override fun title() = "Vocabulary"
}