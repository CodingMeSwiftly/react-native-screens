package com.swmansion.rnscreens;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;

@ReactModule(name = ScreensTransactionsViewManager.REACT_CLASS)
public class ScreensTransactionsViewManager extends ViewGroupManager<Screen> {

  protected static final String REACT_CLASS = "ScreensTransaction";

  @Override
  public String getName() {
    return REACT_CLASS;
  }

  @Override
  protected Screen createViewInstance(ThemedReactContext reactContext) {
    return new Screen(reactContext);
  }

  @ReactProp(name = "active", defaultFloat = 0)
  public void setActive(Screen view, float active) {
    view.setActive(active != 0);
  }
}

