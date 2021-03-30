package com.example.demo.SPI;

import java.util.List;

/**
 * @author LY
 * @date 2021年03月30日 14:10
 * @project demo
 */
public class DatabaseSearch implements Search {
    @Override
    public List<String> searchDoc(String keyword) {
        System.out.println("DatabaseSearch..."+keyword);
        return null;
    }
}
