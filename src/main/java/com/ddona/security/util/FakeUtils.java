package com.ddona.security.util;

import com.ddona.security.entities.News;

import java.util.ArrayList;
import java.util.List;

public class FakeUtils {
    public static List<News> getAllNews() {
        List<News> newsList = new ArrayList<News>();
        newsList.add(new News("JWT", "This is JWT tut", "Trung Doan"));
        newsList.add(new News("Spring core", "Spring boot tut", "Hoang Nguyen"));
        newsList.add(new News("MySql", "Database tutorial", "Hoan Tu"));
        return newsList;
    }
}