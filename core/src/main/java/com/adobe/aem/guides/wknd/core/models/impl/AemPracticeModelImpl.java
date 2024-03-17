package com.adobe.aem.guides.wknd.core.models.impl;

import com.adobe.aem.guides.wknd.core.models.AemPracticeModel;
import com.adobe.aem.guides.wknd.core.models.NavigationItem;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;
import java.util.List;


@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AemPracticeModelImpl implements AemPracticeModel {
    @Inject
    private String title;
    @Inject
    private String assetPath;
    @Inject
    private List<NavigationItem> navigationItems;


    public String getImagePath() {
        return assetPath;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBackgroundImage() {
        //logic was not provided in task details
        return true;
    }

    public List<NavigationItem> getNavigationItems() {
        if (navigationItems != null) {
            navigationItems.forEach(item -> item.setTitle("TEST_" + item.getTitle()));
        }
        return navigationItems;
    }

}
