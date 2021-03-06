/**
* Copyright (c) Facebook, Inc. and its affiliates.
*
* This source code is licensed under the MIT license found in the
* LICENSE file in the root directory of this source tree.
*
* @generated by codegen project: GeneratePropsJavaInterface.js
*/

package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;

public interface ModalHostViewManagerInterface<T extends View> {
  void setAnimationType(T view, @Nullable String value);
  void setPresentationStyle(T view, @Nullable String value);
  void setTransparent(T view, boolean value);
  void setHardwareAccelerated(T view, boolean value);
  void setAnimated(T view, boolean value);
  void setSupportedOrientations(T view, @Nullable ReadableArray value);
  void setIdentifier(T view, int value);
}
