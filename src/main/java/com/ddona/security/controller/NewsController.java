package com.ddona.security.controller;

import com.ddona.security.entities.News;
import com.ddona.security.util.FakeUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/news")
public class NewsController {
    @RequestMapping(method = RequestMethod.GET)
    public List<News> news() {
        // Tham khảo FakeUtils mình có viết trong package Utils để fake dữ liệu nhé
        return FakeUtils.getAllNews();
    }
}
