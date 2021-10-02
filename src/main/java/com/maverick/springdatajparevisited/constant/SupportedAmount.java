package com.maverick.springdatajparevisited.constant;

import java.util.List;
import java.util.function.DoublePredicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * @Project spring-boot-validation
 * @Author mave on 10/1/21
 */
public class SupportedAmount {
    public static final DoublePredicate NCELL = (amount) -> amount >= 10.0 && amount <= 5000.0;
    public static final List<Double> NT_PREPAID = List.of(
            10.0,20.0,30.0,40.0,50.0,100.0,150.0,200.0,500.0,1000.0,1500.0,2000.0,2500.0,3000.0,4000.0,5000.0
    );
    public static final DoublePredicate NT_POSTPAID = (amount) -> amount >= 10.0 && amount <= 5000.0;
    public static final DoublePredicate NT_CDMA_PREPAID = (amount) -> amount >= 10.0 && amount <= 5000.0;
    public static final List<Double> NT_CDMA_POSTPAID = List.of(
            100.0,150.0,200.0,300.0,500.0,1000.0,1500.0,2000.0,2500.0,3000.0,4000.0,5000.0
    );
    public static final DoublePredicate NT_LANDLINE = (amount) -> amount >= 10.0 && amount <= 5000.0;
    public static final DoublePredicate NT_ADSL_UNLIMITED = (amount) -> amount >= 10.0 && amount <= 5000.0;
    /**
     * For NT_ADSL_UNLIMITED and NT_ADSL_VOLUME,
     *  mobileNumberFormat && Supported amount are identical,
     *  hence, NT_ADSL_VOLUME is commented
     */
   //public static final DoublePredicate NT_ADSL_VOLUME=(amount) -> amount >= 10.0 && amount <= 5000.0;
    public static final List<Double> SMARTCELL = List.of(
            100.0,150.0,200.0,300.0,500.0,1000.0,1500.0,2000.0,3000.0,4000.0,5000.0
    );
    public static final DoublePredicate NT_FIBER= (amount) -> amount >= 50.0 && amount <= 20000.0;;
    public static final DoublePredicate NT_WIMAX = (amount) -> amount >= 50.0 && amount <= 20000.0;;;
}
