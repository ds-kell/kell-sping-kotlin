package vn.com.dsk.demo

import jakarta.xml.ws.Endpoint
import org.apache.cxf.Bus
import org.apache.cxf.jaxws.EndpointImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean

class BookEndpoint {

    @Autowired
    private lateinit var bus: Bus

    @Autowired
    private lateinit var bookService: BookService

    @Bean
    fun endpoint(): Endpoint {
        val endpoint = EndpointImpl(bus, bookService)
        endpoint.publish("/ws/book")
        return endpoint
    }
}