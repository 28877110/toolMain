package bean;

import lombok.Data;

import java.time.LocalTime;
import java.util.List;
import java.util.Map;

/**
 * @author smallfish
 * @Title: InfoBean
 * @ProjectName toolMain
 * @date 18-9-4下午1:43
 */
@Data
public class InfoBean {
    private int anInt;
    private String string;
    private double aDouble;
    private float aFloat;
    private LocalTime localTime;
    private List<String> list;
    private Map<String,String> map;
}
