/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.backgroundtask.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the BTEntry service. Represents a row in the &quot;BTEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.backgroundtask.model.impl.BTEntryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.backgroundtask.model.impl.BTEntryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BTEntry
 * @see com.liferay.portlet.backgroundtask.model.impl.BTEntryImpl
 * @see com.liferay.portlet.backgroundtask.model.impl.BTEntryModelImpl
 * @generated
 */
public interface BTEntryModel extends BaseModel<BTEntry>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a b t entry model instance should use the {@link BTEntry} interface instead.
	 */

	/**
	 * Returns the primary key of this b t entry.
	 *
	 * @return the primary key of this b t entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this b t entry.
	 *
	 * @param primaryKey the primary key of this b t entry
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the bt entry ID of this b t entry.
	 *
	 * @return the bt entry ID of this b t entry
	 */
	public long getBtEntryId();

	/**
	 * Sets the bt entry ID of this b t entry.
	 *
	 * @param btEntryId the bt entry ID of this b t entry
	 */
	public void setBtEntryId(long btEntryId);

	/**
	 * Returns the group ID of this b t entry.
	 *
	 * @return the group ID of this b t entry
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this b t entry.
	 *
	 * @param groupId the group ID of this b t entry
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this b t entry.
	 *
	 * @return the company ID of this b t entry
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this b t entry.
	 *
	 * @param companyId the company ID of this b t entry
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this b t entry.
	 *
	 * @return the user ID of this b t entry
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this b t entry.
	 *
	 * @param userId the user ID of this b t entry
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this b t entry.
	 *
	 * @return the user uuid of this b t entry
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this b t entry.
	 *
	 * @param userUuid the user uuid of this b t entry
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this b t entry.
	 *
	 * @return the user name of this b t entry
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this b t entry.
	 *
	 * @param userName the user name of this b t entry
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this b t entry.
	 *
	 * @return the create date of this b t entry
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this b t entry.
	 *
	 * @param createDate the create date of this b t entry
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this b t entry.
	 *
	 * @return the modified date of this b t entry
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this b t entry.
	 *
	 * @param modifiedDate the modified date of this b t entry
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this b t entry.
	 *
	 * @return the name of this b t entry
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this b t entry.
	 *
	 * @param name the name of this b t entry
	 */
	public void setName(String name);

	/**
	 * Returns the servlet context names of this b t entry.
	 *
	 * @return the servlet context names of this b t entry
	 */
	@AutoEscape
	public String getServletContextNames();

	/**
	 * Sets the servlet context names of this b t entry.
	 *
	 * @param servletContextNames the servlet context names of this b t entry
	 */
	public void setServletContextNames(String servletContextNames);

	/**
	 * Returns the task executor class name of this b t entry.
	 *
	 * @return the task executor class name of this b t entry
	 */
	@AutoEscape
	public String getTaskExecutorClassName();

	/**
	 * Sets the task executor class name of this b t entry.
	 *
	 * @param taskExecutorClassName the task executor class name of this b t entry
	 */
	public void setTaskExecutorClassName(String taskExecutorClassName);

	/**
	 * Returns the task context of this b t entry.
	 *
	 * @return the task context of this b t entry
	 */
	@AutoEscape
	public String getTaskContext();

	/**
	 * Sets the task context of this b t entry.
	 *
	 * @param taskContext the task context of this b t entry
	 */
	public void setTaskContext(String taskContext);

	/**
	 * Returns the completed of this b t entry.
	 *
	 * @return the completed of this b t entry
	 */
	public boolean getCompleted();

	/**
	 * Returns <code>true</code> if this b t entry is completed.
	 *
	 * @return <code>true</code> if this b t entry is completed; <code>false</code> otherwise
	 */
	public boolean isCompleted();

	/**
	 * Sets whether this b t entry is completed.
	 *
	 * @param completed the completed of this b t entry
	 */
	public void setCompleted(boolean completed);

	/**
	 * Returns the completion date of this b t entry.
	 *
	 * @return the completion date of this b t entry
	 */
	public Date getCompletionDate();

	/**
	 * Sets the completion date of this b t entry.
	 *
	 * @param completionDate the completion date of this b t entry
	 */
	public void setCompletionDate(Date completionDate);

	/**
	 * Returns the status of this b t entry.
	 *
	 * @return the status of this b t entry
	 */
	public int getStatus();

	/**
	 * Sets the status of this b t entry.
	 *
	 * @param status the status of this b t entry
	 */
	public void setStatus(int status);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(BTEntry btEntry);

	public int hashCode();

	public CacheModel<BTEntry> toCacheModel();

	public BTEntry toEscapedModel();

	public BTEntry toUnescapedModel();

	public String toString();

	public String toXmlString();
}