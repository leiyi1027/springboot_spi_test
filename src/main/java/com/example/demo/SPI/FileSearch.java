package com.example.demo.SPI;

import java.util.List;

/**
 * @author LY
 * @date 2021年03月30日 14:11
 * @project demo
 */
public class FileSearch implements Search {
    @Override
    public List<String> searchDoc(String keyword) {
        System.out.println("FileSearch..."+keyword);
        return null;
    }
}
