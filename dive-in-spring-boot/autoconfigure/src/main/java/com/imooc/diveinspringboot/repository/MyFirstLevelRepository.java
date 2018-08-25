package com.imooc.diveinspringboot.repository;

import com.imooc.diveinspringboot.annotation.FirstLevelRepository;
import com.imooc.diveinspringboot.annotation.SecondLevelRepository;

//@FirstLevelRepository(value = "myFirstLevelRepository")
@SecondLevelRepository(value = "myFirstLevelRepository")
public class MyFirstLevelRepository {

}
