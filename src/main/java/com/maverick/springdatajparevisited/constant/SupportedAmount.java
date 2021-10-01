package com.maverick.springdatajparevisited.constant;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * @Project spring-boot-validation
 * @Author mave on 10/1/21
 */
public class SupportedAmount {
    public static final DoubleStream NCELL= IntStream.range(10,5001).asDoubleStream();
    public static final List<Double> NT_PREPAID = List.of(
            10.0,20.0,30.0,40.0,50.0,100.0,150.0,200.0,500.0,
            1000.0,1500.0,200.0,2500.0,3000.0,
            4000.0,5000.0
    );
}
