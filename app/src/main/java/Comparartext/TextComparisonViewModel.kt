package Comparartext

import androidx.lifecycle.ViewModel

class TextComparisonViewModel : ViewModel() {
    fun compareTexts(text1: String, text2: String): Boolean {
        return text1 == text2
    }
}
