package com.maverick.springdatajparevisited.constant;


public class MobileNoFormat {

    public static final String NCELL = "(980{1})\\d{7}|(981{1})\\d{7}|(982{1}\\d{7})";
    public static final String NT_PREPAID = "(984{1})\\d{7}|(986{1})\\d{7}";
    public static final String NT_POSTPAID = "(985{1})\\d{7}";
    public static final String NT_CDMA_PREPAID = "(974{1})\\d{7}";
    public static final String NT_CDMA_POSTPAID = "(975{1})\\d{7}";
    public static final String NT_LANDLINE = "[1-9]{8}";
    public static final String NT_ADSL_UNLIMITED = "[1-9]{1}[0-9]{7}";
    public static final String NT_ADSL_VOLUME="[1-9]{1}[\\d]{7}";
    public static final String SMARTCELL="[9][6](1|2){1}[0-9]{7}|[9][8][8][0-9]{7}";
    public static final String NT_FIBER="(NTFTTH){1}[0-9]{9}";
    public static final String NT_WIMAX="[0-9]{9}";


}
