package com.facilityapi.psi

import com.facilityapi.FsdLanguage
import com.intellij.psi.tree.IElementType

data class FsdElementType(val debugName: String) : IElementType(debugName, FsdLanguage)