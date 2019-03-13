package com.baizhi;

import com.baizhi.dao.AdminMapper;
import com.baizhi.dao.AlbumMapper;
import com.baizhi.entity.Admin;
import com.baizhi.entity.Album;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.el.FunctionMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MbgApplicationTests {

    @Autowired
    private AlbumMapper albumMapper;
    @Autowired
    private AdminMapper adminMapper;
    @Test
    public void contextLoads() {
        Admin admin = new Admin();
        admin.setId("435345332");
        admin.setName("12321");
        admin.setPassword("123123");
        adminMapper.insert(admin);
    }

    @Test
    public void test1(){
        Album album = albumMapper.selectByPrimaryKey("1");
        System.out.println(album);
        System.out.println("asdasd");
        System.out.println("123123");
        System.out.println("master");
        System.out.println("323232");
    }
}
