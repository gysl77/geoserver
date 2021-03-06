/* (c) 2018 Open Source Geospatial Foundation - all rights reserved
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package org.geoserver.wfs3;

import org.geotools.xml.xsi.XSISimpleTypes;

import javax.xml.namespace.QName;

/**
 * Request for the server contents
 */
public class CollectionsRequest extends BaseRequest {

    QName typeName;

    public QName getTypeName() {
        return typeName;
    }

    public void setTypeName(QName typeName) {
        this.typeName = typeName;
    }
    
}
