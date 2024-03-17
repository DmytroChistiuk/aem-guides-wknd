package com.adobe.aem.guides.wknd.core.models;

import java.util.List;


public interface AemPracticeModel {

    String getImagePath();

    String getTitle();

    boolean isBackgroundImage();

    List<NavigationItem> getNavigationItems();
}
