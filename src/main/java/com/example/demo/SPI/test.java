package com.example.demo.SPI;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author LY
 * @date 2021年03月30日 14:00
 * @project demo
 */
public class test {
    public static void main(String[] args) {
        ServiceLoader<Search> searches = ServiceLoader.load(Search.class);
        Iterator<Search> iterator = searches.iterator();
        while (iterator.hasNext()) {
            Search search = iterator.next();
            search.searchDoc("hello world SPI!");

        }
    }
}
