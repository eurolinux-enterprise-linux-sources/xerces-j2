/*
 * Copyright 1999,2000,2004 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.wml;

/**
 * <p>The interface is modeled after DOM1 Spec for HTML from W3C.
 * The DTD used in this DOM model is from 
 * <a href="http://www.wapforum.org/DTD/wml_1.1.xml">
 * http://www.wapforum.org/DTD/wml_1.1.xml</a></p>
 *
 * <p>'option' element specifies a choice in a 'select' element</p>
 *
 * @version $Id: WMLOptionElement.java,v 1.2 2004/02/24 23:34:05 mrglavas Exp $
 * @author <a href="mailto:david@topware.com.tw">David Li</a>
 */

public interface WMLOptionElement extends WMLElement {

    /**
     * 'value' specifies the value to used to set the 'name' variable
     * (Section 11.6.2.2, WAP WML Version 16-Jun-1999)
     */
    public void setValue(String newValue);
    public String getValue();

    /**
     * 'title' specifies a title for this element.
     * (Section 11.6.2.2, WAP WML Version 16-Jun-1999)
     */
    public void setTitle(String newValue);
    public String getTitle();

    /**
     * 'onpick' specifies a event to occur when a user select and
     * disselect this choice.
     * (Section 11.6.2.2, WAP WML Version 16-Jun-1999) */
    public void setOnPick(String href);
    public String getOnPick();

    /**
     * 'xml:lang' specifics the natural or formal language in which
     * the document is written.  
     * (Section 8.8, WAP WML Version 16-Jun-1999) 
     */
    public void setXmlLang(String newValue);
    public String getXmlLang();
}
