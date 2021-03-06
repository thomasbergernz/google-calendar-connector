/**
 * Mule Google Calendars Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.google.calendar.model;

import com.google.api.services.calendar.model.Event;
import org.mule.modules.google.api.model.BaseWrapper;

import java.io.IOException;


/**
 * Wrapper for {@link com.google.api.services.calendar.model.Event.Creator}
 * to make it data mapper friendly.
 * 
 * @author mariano.gonzalez@mulesoft.com
 */
public class Creator extends BaseWrapper<Event.Creator>{

	public Creator(){
		this(new Event.Creator());
	}
	
	public Creator(Event.Creator wrapped) {
		super(wrapped);
	}

	public boolean equals(Object arg0) {
		return wrapped.equals(arg0);
	}

	public Boolean getSelf() {
		return wrapped.getSelf();
	}

	public String getDisplayName() {
		return wrapped.getDisplayName();
	}

	public String getEmail() {
		return wrapped.getEmail();
	}

	public int hashCode() {
		return wrapped.hashCode();
	}

	public void setSelf(Boolean self) {
		wrapped.setSelf(self);
	}

	public void setDisplayName(String displayName) {
		wrapped.setDisplayName(displayName);
	}

	public void setEmail(String email) {
		wrapped.setEmail(email);
	}

	public String toString() {
		return wrapped.toString();
	}

	public String toPrettyString() throws IOException{
		return wrapped.toPrettyString();
	}

    public Event.Creator setId(String id) {
        return wrapped.setId(id);
    }

    public String getId() {
        return wrapped.getId();
    }
}
