/*
 * Copyright 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * NOTE: THIS CLASS IS AUTO-GENERATED FROM THE EQUIVALENT CLASS IN THE PARENT TRANSITION PACKAGE.
 * IT SHOULD NOT BE EDITED DIRECTLY.
 */
package com.bottombar.navigation.material.transition.platform;

import com.ssos.support.R;

import androidx.annotation.AttrRes;

/**
 * A {@link android.transition.Visibility} transition that, by default, provides a fade in and
 * scale out when appearing and a fade out and scale out when disappearing.
 *
 * <p>MaterialFadeThrough supports theme-based easing and duration. The transition will load theme
 * values from the {@code SceneRoot}'s context before it runs, and only use them if the
 * corresponding properties weren't already set on the transition instance.
 */
@androidx.annotation.RequiresApi(android.os.Build.VERSION_CODES.LOLLIPOP)
public final class MaterialFadeThrough extends MaterialVisibility<FadeThroughProvider> {

  private static final float DEFAULT_START_SCALE = 0.92f;

  @AttrRes private static final int DEFAULT_THEMED_DURATION_ATTR = R.attr.motionDurationLong1;

  @AttrRes
  private static final int DEFAULT_THEMED_EASING_ATTR = R.attr.motionEasingEmphasizedInterpolator;

  public MaterialFadeThrough() {
    super(createPrimaryAnimatorProvider(), createSecondaryAnimatorProvider());
  }

  private static FadeThroughProvider createPrimaryAnimatorProvider() {
    return new FadeThroughProvider();
  }

  private static VisibilityAnimatorProvider createSecondaryAnimatorProvider() {
    ScaleProvider scaleProvider = new ScaleProvider();
    scaleProvider.setScaleOnDisappear(false);
    scaleProvider.setIncomingStartScale(DEFAULT_START_SCALE);
    return scaleProvider;
  }

  @AttrRes
  @Override
  int getDurationThemeAttrResId(boolean appearing) {
    return DEFAULT_THEMED_DURATION_ATTR;
  }

  @AttrRes
  @Override
  int getEasingThemeAttrResId(boolean appearing) {
    return DEFAULT_THEMED_EASING_ATTR;
  }
}
