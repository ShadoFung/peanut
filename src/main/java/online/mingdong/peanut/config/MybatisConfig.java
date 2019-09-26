package online.mingdong.peanut.config;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

/**
 * @author Shado
 * @date Sep 24, 2019
 */
@Configuration
@MapperScan("online.mingdong.peanut.**.dao")
public class MybatisConfig {
  @Autowired
  private DataSource dataSource;

  @Bean
  public SqlSessionFactory sqlSessionFactory() throws Exception {
    SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
    sessionFactory.setDataSource(dataSource);
    sessionFactory.setTypeAliasesPackage("online.mingdong.peanut.**.model");
    
    PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
    // 扫描映射文件
    sessionFactory.setMapperLocations(resolver.getResources("classpath*:**/sqlmap/*.xml"));
    
    return sessionFactory.getObject();
  }
}