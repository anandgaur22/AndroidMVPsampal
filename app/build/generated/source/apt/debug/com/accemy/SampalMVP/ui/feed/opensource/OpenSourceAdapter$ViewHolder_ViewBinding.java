// Generated code from Butter Knife. Do not modify!
package com.accemy.SampalMVP.ui.feed.opensource;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.accemy.SampalMVP.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class OpenSourceAdapter$ViewHolder_ViewBinding implements Unbinder {
  private OpenSourceAdapter.ViewHolder target;

  @UiThread
  public OpenSourceAdapter$ViewHolder_ViewBinding(OpenSourceAdapter.ViewHolder target, View source) {
    this.target = target;

    target.coverImageView = Utils.findRequiredViewAsType(source, R.id.cover_image_view, "field 'coverImageView'", ImageView.class);
    target.titleTextView = Utils.findRequiredViewAsType(source, R.id.title_text_view, "field 'titleTextView'", TextView.class);
    target.contentTextView = Utils.findRequiredViewAsType(source, R.id.content_text_view, "field 'contentTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    OpenSourceAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.coverImageView = null;
    target.titleTextView = null;
    target.contentTextView = null;
  }
}
