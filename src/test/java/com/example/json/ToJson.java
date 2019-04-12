package com.example.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yanzt
 * @date 2019/4/11 14:37
 * @describe
 */
public class ToJson {

    private static ObjectMapper mapper = null;
    {
        mapper = new ObjectMapper();
        //设置输出包含的属性
        mapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);
        //设置输入时忽略JSON字符串中存在而Java对象实际没有的属性
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    @Test
    public void test1(){
        List<GameRewardVo> gameRewardVos = new ArrayList<>();
        GameRewardVo gameRewardVo = new GameRewardVo("1","小份食物","小份食物","http://www.carbuyin.net/by2/qunHeader/052e2684-e7c9-49ee-9b5e-4fdbb8af3f92.jpg",
                "60",4,2);
        GameRewardVo gameRewardVo2 = new GameRewardVo("2","饰品1","头饰","http://www.carbuyin.net/by2/qunHeader/052e2684-e7c9-49ee-9b5e-4fdbb8af3f92.jpg",
                null,null,1);
        gameRewardVos.add(gameRewardVo);
        gameRewardVos.add(gameRewardVo2);


        String json = null;
        try {
            json = mapper.writeValueAsString(gameRewardVos);
            System.out.println("json: " + json);
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<GameRewardVo> vo = null;
        try {
            vo = mapper.readValue(json, new TypeReference<List<GameRewardVo>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(vo);
        GameRewardVo vo1 = vo.get(0);
        System.out.println(vo1);
        System.out.println(vo1.getClass());
        System.out.println(vo1.getGoodsName());
        System.out.println(vo1.getEnergy());
        System.out.println(vo1.getGoodsType());
    }

    @Test
    public void test2(){
        String json = "";
        List<GameRewardVo> vo = null;
        try {
            vo = mapper.readValue(json, new TypeReference<List<GameRewardVo>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(vo);
        GameRewardVo vo1 = vo.get(0);
        System.out.println(vo1);
        System.out.println(vo1.getClass());
        System.out.println(vo1.getGoodsName());
        System.out.println(vo1.getEnergy());
        System.out.println(vo1.getGoodsType());
    }

    @Test
    public void test3(){
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(null);
        System.out.println(objects);
    }

}
