package com.thounghtworks.zjr_mark.utils;

import com.thounghtworks.zjr_mark.exception.ParseErrorException;
import com.thounghtworks.zjr_mark.models.Talk;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//读取txt文件工具类
public class TalksParser {


    //获得txt文件中每一行的信息,将其封装到talks类中,再将其装入list容器。
    public static ArrayList<Talk> parse(String url) throws FileNotFoundException, ParseErrorException {

        //创建list集合 准备装入talks
        ArrayList<Talk> list = new ArrayList<>();
        BufferedReader reader = null;
        try {
            //准备读取txt文件中的内容
            File file = new File(url);
            reader = new BufferedReader(new FileReader(file));
            String line = null;
            int numTime = 0;
            //读循环开始,每次读一行内容,将其封装到talks类中,再将其装入list容器。
            while ((line = reader.readLine()) != null) {
                //利用正则表达式  获取每一行的信息。
                String pattern = "(\\D*)(\\d+)(.*)";
                Pattern r = Pattern.compile(pattern);
                Matcher m = r.matcher(line);
                if (m.find()) {
                    list.add(new Talk(m.group(1), Integer.parseInt(m.group(2))));
                }
                //如果读到的是lightning结尾的话,添加到集合
                else if (line.substring((line.lastIndexOf(" ")+1)).equals("lightning")){
                  list.add(new Talk(line+" ",5));
                }else {
                    //处理异常
                    throw new ParseErrorException();
                }
            }
            //调用排序方法
            sort(list);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(reader);
        }
        return list;
    }

    //排序方法,使list中的元素按照时间从大到小排列
    public static void sort(ArrayList<Talk> list) {

        list.sort((o1, o2) -> o2.getDuration() - o1.getDuration());

    }

    //关流
    public static void close(BufferedReader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

}
