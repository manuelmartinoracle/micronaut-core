package io.micronaut.tracing.codec

import io.micronaut.context.ApplicationContext
import io.micronaut.tracing.jaeger.JaegerConfiguration
import spock.lang.Specification

/**
 * @author: Manuel martin
 */
class JaegerConfigurationSpec extends Specification {

    void "test codec configuration"() {
        given:
        def ctx = ApplicationContext.run(
                'tracing.jaeger.enabled': 'true',
                'tracing.jaeger.codec.codecs': 'W3C'
        )
        // def config = ctx.getBean(JaegerConfiguration.JaegerCodecConfiguration).getCodecConfiguration()

        expect:
        // config.codecs.get(0) == "W3C"

        cleanup:
        ctx.close()
    }
}

