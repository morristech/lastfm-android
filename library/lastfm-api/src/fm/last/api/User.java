// Copyright 2008 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package fm.last.api;

import java.io.Serializable;

/**
 * @author jennings
 *         Date: Oct 20, 2008
 */
public class User implements Serializable {

  public User(String name, String url, ImageUrl[] images) {
    this.name = name;
    this.url = url;
    this.images = images;
  }
  
  public String getName() {
    return name;
  }

  public String getUrl() {
    return url;
  }

  public ImageUrl[] getImages() {
    return images;
  }

  private String name;
  private String url;
  private ImageUrl[] images;

}
