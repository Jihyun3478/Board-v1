package persistence;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import persistence.mapper.BoardMapper;

import java.io.IOException;
import java.io.Reader;

public class MyBatisConnectionFactory {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            String resource = "config/config.xml";
            Reader reader = Resources.getResourceAsReader(resource);
            if(sqlSessionFactory == null) {
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
                Class[] mappers={
                        BoardMapper.class,
                };
                for(Class mapper : mappers) {
                    sqlSessionFactory.getConfiguration().addMapper(mapper);
                }
            }
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
    public static SqlSessionFactory getSqlSessionFactory() { return sqlSessionFactory; }
}