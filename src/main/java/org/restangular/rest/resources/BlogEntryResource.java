package org.restangular.rest.resources;

import org.restangular.core.models.Blog;
import org.springframework.hateoas.ResourceSupport;

import java.util.Date;

/**
 * Created by oussama on 4/9/2015.
 */
public class BlogEntryResource extends ResourceSupport {

    private String title;
    private String description;
    private Date publishDate;
    private String link;

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

}
