package com.github.juanncode.notesapp.feature_note.presentation.notes

import androidx.lifecycle.ViewModel
import com.github.juanncode.notesapp.feature_note.domain.use_case.NoteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NotesViewModel @Inject constructor(
    private val noteUseCase: NoteUseCase
): ViewModel() {

}