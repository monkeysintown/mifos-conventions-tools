///
/// This Source Code Form is subject to the terms of the Mozilla Public
/// License, v. 2.0. If a copy of the MPL was not distributed with this
/// file, You can obtain one at http://mozilla.org/MPL/2.0/.
///
package org.mifos.conventions.tools.mfg.core.service;

import java.io.InputStream;
import org.mifos.conventions.tools.mfg.core.model.MfgTemplateIndexData;

public interface MfgTemplateIndexService {
    MfgTemplateIndexData parse(InputStream data);

    @Deprecated
    void validate(MfgTemplateIndexData index);
}
