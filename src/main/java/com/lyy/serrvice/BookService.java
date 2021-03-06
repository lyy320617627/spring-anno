package com.lyy.serrvice;

import com.lyy.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * @program: spring-annotation
 * @description:
 * @author: ly
 * @create: 2021-11-15 17:18
 **/
@Service
public class BookService {
//    @Qualifier("bookDao")
//    @Autowired(required = false)
//    @Resource(name = "bookDao2")
    @Inject
    private BookDao bookDao;
    public void print(){
        System.out.println(bookDao);
    }

    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao +
                '}';
    }
}
