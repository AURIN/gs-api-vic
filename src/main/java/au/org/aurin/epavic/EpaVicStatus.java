/* (c) 2016 Open Source Geospatial Foundation - all rights reserved
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */

package au.org.aurin.epavic;

import java.util.Optional;

import org.geoserver.platform.ModuleStatus;
import org.geotools.data.epavic.EpaVicDatastore;
import org.geotools.factory.GeoTools;
import org.geotools.util.Version;

public class EpaVicStatus implements ModuleStatus {

  @Override
  public String getModule() {
    return "gs-epa-vic";
  }

  @Override
  public Optional<String> getComponent() {
    return Optional.ofNullable("epavic");
  }

  @Override
  public String getName() {
    return "EPA VIC Data service";
  }

  @Override
  public Optional<String> getVersion() {
    Version v = GeoTools.getVersion(EpaVicDatastore.class);
    if (v == null) {
      return Optional.empty();
    }
    return Optional.ofNullable(v.toString());
  }

  @Override
  public boolean isAvailable() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }

  @Override
  public Optional<String> getMessage() {
    return Optional.ofNullable("");
  }

  @Override
  public Optional<String> getDocumentation() {
    return Optional.ofNullable("");
  }

}
