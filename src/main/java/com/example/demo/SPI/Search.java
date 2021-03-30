package com.example.demo.SPI;

import java.util.List;

/**
 * @author LY
 * @date 2021年03月30日 13:55
 * @project demo
 */
public interface Search {
    /**
     *
     * @param keyword
     * @return
     */
    public List<String> searchDoc(String keyword);

}
