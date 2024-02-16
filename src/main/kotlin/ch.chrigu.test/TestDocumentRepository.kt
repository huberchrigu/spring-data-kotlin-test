package ch.chrigu.test

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface TestDocumentRepository : ReactiveMongoRepository<TestDocument, ObjectId>
