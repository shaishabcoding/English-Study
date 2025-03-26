package com.shaishab316.englishstudy.subclass

import com.shaishab316.englishstudy.activity.Sub
import com.shaishab316.englishstudy.root

class RightFormsOfVerbs: Sub() {
    override fun loadData() {
        add("Rule 01 - 05");
        add("Rule 06 - 10");
        add("Rule 11 - 15");
        add("Rule 16 - 20");
        add("Rule 21 - 25");
        add("Rule 26 - 30");
    }

    override fun url() = "$root/English Grammar/${title()}/"
    override fun title() = "Right forms of Verbs"
}