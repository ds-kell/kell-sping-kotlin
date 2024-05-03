package vn.com.dsk.demo

import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequiredArgsConstructor
@RestController
class BookController {
    @GetMapping("/book/get-name")
    fun getAllBooks(): String{
        return "Fairy Tail"
    }
}