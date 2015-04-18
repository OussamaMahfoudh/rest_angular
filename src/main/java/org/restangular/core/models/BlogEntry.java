package org.restangular.core.models;

import com.sun.istack.internal.NotNull;
import org.restangular.core.models.base.GeneratedValueEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by oussama on 4/8/2015.
 */
@AttributeOverride(name = "id", column = @Column(name = "BLOG_ENTRY_ID"))
@Entity
public class BlogEntry extends GeneratedValueEntity {

    @NotNull
    private String title;
    private String description;
    @Temporal(value = TemporalType.DATE)
    private Date publishDate;
    @NotNull
    private String link;
    @ManyToOne
    private Blog blog;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }


    @Override
    public boolean equals(Object blogEntry) {
        if (blogEntry == null) {
            return false;
        }
        if (blogEntry instanceof BlogEntry) {
            return this.getId() == ((BlogEntry) blogEntry).getId() ? true : false;
        }
        return false;
    }
}
