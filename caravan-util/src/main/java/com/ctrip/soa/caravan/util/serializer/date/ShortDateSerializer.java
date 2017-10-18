package com.ctrip.soa.caravan.util.serializer.date;

import com.ctrip.soa.caravan.common.value.DateValues;

/**
 * Created by Qiang Zhao on 10/05/2016.
 */
public class ShortDateSerializer extends AbstractDateSerializer {
    
    public static final String DATE_PATTERN = "\\d{4}-\\d{2}-\\d{2}";
    
    public static final ShortDateSerializer INSTANCE = new ShortDateSerializer();
    
    public ShortDateSerializer() {
        super(DateValues.SHORT_DATE_FORMAT, DATE_PATTERN, null);
    }
}
