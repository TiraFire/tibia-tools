package com.anonymousmoose.tibiatools.converter;

import com.anonymousmoose.tibiatools.openapi.model.Vocation;
import org.springframework.core.convert.converter.Converter;


public class StringToEnumConverter implements Converter<String, Vocation> {
    @Override
    public Vocation convert(String source) {
        return Vocation.valueOf(source.toUpperCase());
    }
}
