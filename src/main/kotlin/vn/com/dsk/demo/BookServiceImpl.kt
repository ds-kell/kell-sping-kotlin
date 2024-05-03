package vn.com.dsk.demo

import jakarta.jws.WebService
import org.springframework.stereotype.Component

@Component
@WebService(endpointInterface = "vn.com.dsk.demo.BookService")
class BookServiceImpl : BookService {
    override fun getBookPrice(bookName: String): Int {
        return 10000
    }
}
