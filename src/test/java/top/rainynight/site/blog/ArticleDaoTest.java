package top.rainynight.site.blog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.rainynight.site.blog.dao.ArticleDao;
import top.rainynight.site.blog.entity.Article;

import javax.annotation.Resource;

/**
 * Created by sllx on 2015-06-04.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class ArticleDaoTest extends AbstractJUnit4SpringContextTests {

    @Resource
    private ArticleDao articleDao;

    @Test
    public void listWithArticleclass() {
        articleDao.listWithArticleclass();
    }

    public void insert() {

    }

    public void delete() {
    }

    public void update() {
    }

    public void select() {
    }

    public void list() {
    }
}
