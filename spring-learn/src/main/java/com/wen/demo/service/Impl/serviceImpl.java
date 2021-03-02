package com.wen.demo.service.Impl;

import com.wen.demo.service.IService;

/**
 * @author WenXun
 * @version 1.0
 * @date 2021/3/2 下午5:00
 */
public class serviceImpl implements IService {
    @Override
    public void sayHello() {
        System.out.println("Spring demo Hello world");
    }
}
