/*
 * Copyright 2017 The Android Open Source Project
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
package com.bottombar.navigation.material.animation;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/**
 * Property wrapper for {@link ImageView#getImageMatrix()} and {@link
 * ImageView#setImageMatrix(Matrix)}.
 */
public class ImageMatrixProperty extends Property<ImageView, Matrix> {
  private final Matrix matrix = new Matrix();

  public ImageMatrixProperty() {
    super(Matrix.class, "imageMatrixProperty");
  }

  @Override
  public void set(@NonNull ImageView object, @NonNull Matrix value) {
    object.setImageMatrix(value);
  }

  @NonNull
  @Override
  public Matrix get(@NonNull ImageView object) {
    matrix.set(object.getImageMatrix());
    return matrix;
  }
}
