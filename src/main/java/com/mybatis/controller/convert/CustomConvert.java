package com.mybatis.controller.convert;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p></p>
 *
 * @author Andy
 * @date 2017/8/9
 */
public class CustomConvert implements Converter<String,Date> {

    @Override
    public Date convert(String source) {

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return dateFormat.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
