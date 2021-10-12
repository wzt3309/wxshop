package io.zeddw.wxshop.facade.web

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import spock.lang.Specification
import spock.lang.Title
/**
 * @author xingguan.wzt
 * @date 2021/10/12
 */
@Title("SpockWebMvc Specification")
@SpringBootTest
@AutoConfigureMockMvc
@EnableAutoConfiguration
class ExampleSpockWebMvcTest extends Specification {

    @Autowired
    private MockMvc mvc;

    def "when get is performed then response has status 404"() {
        expect: "Status is 404"
        mvc.perform(MockMvcRequestBuilders.get("/hello"))
                .andExpect(MockMvcResultMatchers.status().isNotFound())
    }
}
