package cn.powerr.blog.blog.entity;

import cn.powerr.blog.user.entity.User;
import lombok.Data;

@Data
public class ArticleWithUser extends ArticleWithBLOBs {
    private User user;
}
