/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.xwiki.contrib.ring.internal.model;

import org.xwiki.contrib.ring.XWikiRelation;
import org.xwiki.model.reference.DocumentReference;

public class DefaultXWikiRelation extends DefaultXWikiTerm implements XWikiRelation
{
    String domain, image;

    boolean transitive;

    public DefaultXWikiRelation(DocumentReference identifier, String domain, String image, boolean transitive)
    {
        super(identifier);
        this.domain = domain;
        this.image = image;
        this.transitive = transitive;
    }

    public String getDomain()
    {
        return domain;
    }

    public String getImage()
    {
        return image;
    }

    public boolean isTransitive()
    {
        return transitive;
    }

    public void setTransitive(boolean transitive)
    {
        this.transitive = transitive;
    }

    public void setDomain(String domain)
    {
        //this.domain = domain;
    }

    public void setImage(String image)
    {
        this.image = image;
    }
}
