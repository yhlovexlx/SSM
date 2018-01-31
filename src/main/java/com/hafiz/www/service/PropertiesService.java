package com.hafiz.www.service;

/**
 * Author：yanghl
 * Desc：java程序获取properties文件内容的service
 * Date: 2017/3/21.
 */
public interface PropertiesService {


    /**
     * 第一种实现方式获取properties文件中指定key的value
     *
     * @return
     */
    String getProperyByFirstWay();


    /**
     * 第二种实现方式获取properties文件中指定key的value
     *
     * @return
     */
    String getProperyBySecondWay();

    /**
     * 第三种实现方式获取properties文件中指定key的value
     *
     * @return
     */
    String getProperyByThirdWay();

    /**
     * 第四种实现方式获取properties文件中指定key的value
     *
     * @param key
     * @return
     */
    String getProperyByFourthWay(String key);

    /**
     * 第四种实现方式获取properties文件中指定key的value
     *
     * @param key
     * @param defaultValue
     * @return
     */
    String getProperyByFourthWay(String key, String defaultValue);

    /**
     * 第五种实现方式获取properties文件中指定key的value
     *
     * @param key
     * @return
     */
    String getProperyByFifthWay(String key);

    /**
     * 第五种实现方式获取properties文件中指定key的value
     *
     * @param key
     * @param defaultValue
     * @return
     */
    String getProperyByFifthWay(String key, String defaultValue);
}
