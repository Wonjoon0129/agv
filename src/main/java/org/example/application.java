package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.entity.Agv;
import org.example.entity.Trs;
import org.example.mapper.AgvMapper;
import org.example.mapper.TrsMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class application {
    public static void main(String[] args) throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();
        AgvMapper agvDao = session.getMapper(AgvMapper.class);
        TrsMapper trsDao = session.getMapper(TrsMapper.class);


        List<Agv> agvs = agvDao.findAll();
        List<Trs> trs =trsDao.findAll();

        Initializer initializer = new Initializer(agvs, trs);
        initializer.initialize();

        session.close();
        in.close();
    }
}
