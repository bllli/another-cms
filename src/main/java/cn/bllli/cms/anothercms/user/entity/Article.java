package cn.bllli.cms.anothercms.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author bllli
 * @since 2019-10-19
 */
@Data
public class Article {

    private static final long serialVersionUID=1L;

    @TableId(type = IdType.AUTO)
    private String title;

    private String content;

    private String authorName;

    private Integer authorId;

    private Boolean deleted;


}
