package cn.bllli.cms.anothercms.user.service.impl;

import cn.bllli.cms.anothercms.user.entity.Article;
import cn.bllli.cms.anothercms.user.mapper.ArticleMapper;
import cn.bllli.cms.anothercms.user.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bllli
 * @since 2019-10-19
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

}
