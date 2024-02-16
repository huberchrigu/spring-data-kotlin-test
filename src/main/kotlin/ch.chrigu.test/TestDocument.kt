package ch.chrigu.test

import org.bson.types.ObjectId

data class TestDocument(val id: ObjectId?, val notes: Map<String, String> = emptyMap()) {
    constructor(notes: Map<String, String>, additionalNotes: Map<String, String> = emptyMap()) : this(null, notes + additionalNotes)
}
