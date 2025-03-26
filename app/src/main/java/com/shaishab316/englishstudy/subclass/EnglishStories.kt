package com.shaishab316.englishstudy.subclass

import com.shaishab316.englishstudy.activity.Sub
import com.shaishab316.englishstudy.root

class EnglishStories : Sub() {
    override fun loadData() {
        add("17 Camels and 3 Sons")
        add("A Merchant and his Donkey")
        add("Change Yourself and not The World")
        add("Unhelpful Friends")
        add("Greedy Boy")
        add("Strong or Weak")
        add("The Crystal Ball")

        //moral
        add("The Ant and the Dove")
        add("The Apple Tree and the Farmer")
        add("The Fox and the Grapes")
        add("The Cunning Fox and the Clever Stork")
        add("The Lion and the Mouse")
        add("The Milkmaid and her Pail")
        add("Gold Coins and a Selfish Man")
        add("The Stranger in the Garden")
    }

    override fun url() = "$root/${title()}/"
    override fun title() = "English Stories"
}