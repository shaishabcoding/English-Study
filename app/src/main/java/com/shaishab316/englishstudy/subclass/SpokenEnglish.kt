package com.shaishab316.englishstudy.subclass

import com.shaishab316.englishstudy.activity.Sub
import com.shaishab316.englishstudy.root

class SpokenEnglish : Sub() {
    override fun loadData() {
        repeat(7) {
            add("বহুল ব্যবহৃত কয়েকটি গুরুত্বপূর্ণ বাক্য - part ${1 + it}")
        }
    }

    override fun url() = "$root/${title()}/"
    override fun title() = "Spoken English"
}