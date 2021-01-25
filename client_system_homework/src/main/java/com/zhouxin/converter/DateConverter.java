package com.zhouxin.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 自定义类型转换器
 */
public class DateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String s) {
        //将日期字符串转换成日期对象 返回
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {

            date = simpleDateFormat.parse(s);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;

    }
}
