/*
 * Copyright 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bottombar.navigation.material.shape;

import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import java.util.Arrays;

/**
 * A {@link CornerSize} that takes a percent and computes the size used based on the height of the
 * shape.
 */
public final class RelativeCornerSize implements CornerSize {

  private final float percent;

  /**
   * @param percent The relative size of the corner in range [0,1] where 0 is no size and 1 is the
   *     full bounds height.
   */
  public RelativeCornerSize(@FloatRange(from = 0.0f, to = 1.0f) float percent) {
    this.percent = percent;
  }

  /** Returns the relative percent used for this {@link CornerSize} in range [0,1]. */
  @FloatRange(from = 0.0f, to = 1.0f)
  public float getRelativePercent() {
    return percent;
  }

  @Override
  public float getCornerSize(@NonNull RectF bounds) {
    return percent * bounds.height();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof RelativeCornerSize)) {
      return false;
    }
    RelativeCornerSize that = (RelativeCornerSize) o;
    return percent == that.percent;
  }

  @Override
  public int hashCode() {
    Object[] hashedFields = {percent};
    return Arrays.hashCode(hashedFields);
  }
}
