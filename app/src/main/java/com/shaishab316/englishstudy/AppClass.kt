package com.shaishab316.englishstudy

import com.shaishab316.englishstudy.subclass.CompletingStory
import com.shaishab316.englishstudy.subclass.Dialogue
import com.shaishab316.englishstudy.subclass.EnglishGrammar
import com.shaishab316.englishstudy.subclass.EnglishStories
import com.shaishab316.englishstudy.subclass.Letter
import com.shaishab316.englishstudy.subclass.Narration
import com.shaishab316.englishstudy.subclass.Paragraph
import com.shaishab316.englishstudy.subclass.PartsOfSpeech
import com.shaishab316.englishstudy.subclass.RightFormsOfVerbs
import com.shaishab316.englishstudy.subclass.Sentence
import com.shaishab316.englishstudy.subclass.SpokenEnglish
import com.shaishab316.englishstudy.subclass.Tenses
import com.shaishab316.englishstudy.subclass.Vocabulary
import com.shaishab316.englishstudy.subclass.Voice
import com.shaishab316.englishstudy.subclass.WritingPart

public fun String.toClass(): Class<*>? = when (this) {
    "English Grammar" -> EnglishGrammar::class.java
    "Spoken English" -> SpokenEnglish::class.java
    "Vocabulary" -> Vocabulary::class.java
    "Writing Part" -> WritingPart::class.java
    "English Stories" -> EnglishStories::class.java
    "Sentence" -> Sentence::class.java
    "Parts of Speech" -> PartsOfSpeech::class.java
    "Tenses" -> Tenses::class.java
    "Voice" -> Voice::class.java
    "Right forms of Verbs" -> RightFormsOfVerbs::class.java
    "Narration" -> Narration::class.java
    "Paragraph" -> Paragraph::class.java
    "Completing a Story" -> CompletingStory::class.java
    "Letter" -> Letter::class.java
    "Dialogue" -> Dialogue::class.java
    else -> null
}