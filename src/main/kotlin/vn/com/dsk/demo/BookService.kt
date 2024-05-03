package vn.com.dsk.demo

import jakarta.jws.WebMethod
import jakarta.jws.WebService

@WebService
interface BookService {

    @WebMethod
    fun getBookPrice(bookName: String): Int
}