package com.hjp.common.utils;

import java.util.Arrays;
import java.util.List;

public class DOGenUtils {

    /**
     * 数据库字段转换为DO字段
     * @param strs 字段列表
     */
    public static void genDO (List<String> strs) {
        strs.forEach(str -> {
            String[] keys = str.split("_");
            if (keys.length > 1) {
                StringBuilder sb = new StringBuilder(keys[0]);
                String key;
                char c;
                String s;
                for (int i=1; i<keys.length; i++) {
                    key = keys[i];
                    c = key.toCharArray()[0];
                    s = String.valueOf(c).toUpperCase();
                    sb.append(s).append(key.substring(1));
                }
                System.err.println("private String " + sb.toString() + ";");
            }else {
                System.err.println("private String " + str + ";");
            }

            System.err.println();
        });
    }

    public static void main(String[] args) {
        List<String> strs = Arrays.asList("is_process_subcontract","product_id","actual_processed_products","bom_id","name","product_qty","product_uom","price_unit","date_planned","taxes_id");
        genDO(strs);
    }

}
