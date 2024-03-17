package com.adobe.aem.guides.wknd.core.models;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class)
public class NavigationItem {
    @Inject
    @Default(values = StringUtils.EMPTY)
    private String title;

    @Inject
    @Default(values = StringUtils.EMPTY)
    private String path;

    public String getTitle() {
        return title;
    }

    public String getPath() {
        return path;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
