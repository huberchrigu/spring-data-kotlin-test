package ch.chrigu.test

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import reactor.test.StepVerifier

@SpringBootTest(properties = ["de.flapdoodle.mongodb.embedded.version=4.0.28"])
class AppTest(@Autowired private val testDocumentRepository: TestDocumentRepository) {

    @Test
    fun test() {
        StepVerifier.create(testDocumentRepository.save(TestDocument(mapOf("abc" to "123"))))
            .expectNextCount(1)
            .verifyComplete()
        StepVerifier.create(testDocumentRepository.findAll())
            .expectNextCount(1)
            .verifyComplete()
    }
}
